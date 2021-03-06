/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lib;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

import exceptions.BadIndexException;

/**
 *
 * @author marcof
 */
public class Dataframe {

	/**
	 * 
	 */
    private ArrayList<DataframeColumn> columns;
    /**
     * 
     */
    private int maxColumnSize;

    /**
     * Base constructor
     */
    public Dataframe() {
        columns = new ArrayList<>();
        maxColumnSize = 0;
    }

    /**
     * create a Dataframe with existing columns
     *
     * @param columns the dataframe columns
     */
    public Dataframe(ArrayList<DataframeColumn> columns) {
        this.columns = columns;
        maxColumnSizeEvaluation();
    }

    /**
     * Import the data columns and Data from a CSV file
     *
     * @param csvFilename the filename
     * @throws java.io.IOException problem with file
     */
    public Dataframe(String csvFilename) throws IOException {
        List<String> lines = Files.readAllLines(Paths.get(csvFilename), Charset.defaultCharset());
        List<String> header = Arrays.asList(lines.get(0).split(","));
        lines.remove(0);
        this.maxColumnSize = header.size();

        ArrayList<ArrayList<String>> linetocol = new ArrayList<>();

        for (int i = 0; i < maxColumnSize; i++) {
            linetocol.add(new ArrayList<>());
        }

        for (String line : lines) {
            String[] linez = line.split(",");
            for (int i = 0; i < maxColumnSize; i++) {
                linetocol.get(i).add(linez[i]);
            }
        }
        this.columns = new ArrayList<>();
        for (int i = 0; i < maxColumnSize; i++) {
            columns.add(new DataframeColumn(header.get(i), linetocol.get(i)));
        }
    }

    /**
     * Getter
     *
     * @return the arraylist containing the columns
     */
    public ArrayList<DataframeColumn> getColumns() {
        return columns;
    }

    /**
     * Setter
     *
     * @param columns the arraylist to use
     */
    public void setColumns(ArrayList<DataframeColumn> columns) {
        this.columns = columns;
        maxColumnSizeEvaluation();
    }

    /**
     * Append newcolumn to the dataframe
     *
     * @param newcolumn the new column
     */
    public void addColumn(DataframeColumn newcolumn) {
        this.columns.add(newcolumn);
        maxColumnSizeEvaluation();
    }

    /**
     * Add a newcolumn at index columnindex
     *
     * @param newcolumn the new dataframecolumn
     * @param columnindex the index of the column
     */
    public void addColumn(DataframeColumn newcolumn, int columnindex) {
        this.columns.add(columnindex, newcolumn);
        maxColumnSizeEvaluation();
    }

    /**
     * Print the values of the row at index Need every column to have data that
     * have the function toString()
     *
     * @param index the index of the row
     * 
     * @throws BadIndexException negative or too high index
     */
    public void printRow(int index) throws BadIndexException{
        if(index<0 || index>maxColumnSize){
            throw new exceptions.BadIndexException("");
        }
        for (DataframeColumn column : columns) {
            if (column.getColumnContents().size() > index) {
                System.out.println(column.getLabel() + " : " + column.getColumnContents().get(index).toString());
            } else {
                System.out.println(column.getLabel() + " : ");
            }
        }
    }

    /**
     * print the numberOfRow first rows
     *
     * @param numberOfRow the number of rows to print
     * @throws BadIndexException negative or too high index
     */
    public void printFirstRows(int numberOfRow) throws BadIndexException {
        for (int i = 0; i < numberOfRow; i++) {
            printRow(i);
        }
    }

    /**
     * print the 5 first rows
     * @throws BadIndexException negative or too high index
     */
    public void printFirstRows() throws BadIndexException {
        for (int i = 0; i < 5; i++) {
            printRow(i);
        }
    }

    /**
     * print the last numberOfRow rows
     *
     * @param numberOfRow the number of rows to print
     * @throws BadIndexException negative or too high index
     */
    public void printLastRows(int numberOfRow) throws BadIndexException {
        for (int i = 0; i < numberOfRow; i++) {
            printRow(this.maxColumnSize - i);
        }
    }

    /**
     * print the last 5 rows
     * @throws BadIndexException negative or too high index
     */
    public void printLastRows() throws BadIndexException {
        //TODO : check if not out of bounds ?
        for (int i = 0; i < 5; i++) {
            printRow(this.maxColumnSize - i);
        }
    }

    /**
     * print the rows of the whole dataframe
     * @throws BadIndexException negative or too high index
     */
    public void printAllRows() throws BadIndexException {
        for (int i = 0; i < maxColumnSize; i++) {
            printRow(i);
        }
    }

    /**
     * Create a subdataframe that contain only the rows indicated by indexes
     *
     * @param indexes the indexes of the rows you want to extract
     * @return a dataframe
     */
    public Dataframe subDataframeFromRows(int[] indexes) {
        Dataframe d = new Dataframe();

        for (DataframeColumn column : columns) {
            d.addColumn(new DataframeColumn(column.getLabel()));
        }
        for (int i = 0; i < indexes.length; i++) {
            for (int j = 0; j < columns.size(); j++) {
                d.getColumns().get(j).getColumnContents().add(this.getColumns().get(j).getColumnContents().get(indexes[i]));
            }
        }
        return d;
    }

    /**
     * Create a subdataframe that contain only the column having a label present
     * in labels
     *
     * @param labels the labels of the columns you want to extract
     * @return a dataframe
     */
    public Dataframe subDataframeFromColumns(ArrayList<String> labels) {
        Dataframe d = new Dataframe();

        for (DataframeColumn column : columns) {
            for (String label : labels) {
                if (column.getLabel().equals(label)) {
                    d.addColumn(column);
                }
            }
        }

        return d;
    }

    /**
     * evaluate the max of columns
     */
    //Internal function that evaluate the size of the longest column
    private void maxColumnSizeEvaluation() {
        int max = 0;
        for (DataframeColumn column : columns) {
            if (column.getColumnContents().size() > max) {
                max = column.getColumnContents().size();
            }
        }
        this.maxColumnSize = max;
    }

    /**
     * hashcode
     * 
     * return the hashcode
     */
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.columns);
        hash = 79 * hash + this.maxColumnSize;
        return hash;
    }

    /**
     * 
     * return true if this == obj
     */
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Dataframe other = (Dataframe) obj;
        if (this.maxColumnSize != other.maxColumnSize) {
            return false;
        }
        if (this.columns.size() != other.columns.size()) {
            return false;
        }
        boolean b = true;
        for(int i=0; i<this.columns.size(); i++) {
            b &= this.columns.get(i).equals(other.columns.get(i));
        }
        
        return b;
    }

}
