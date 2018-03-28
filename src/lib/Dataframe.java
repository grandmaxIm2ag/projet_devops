/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lib;

import java.util.ArrayList;

/**
 *
 * @author marcof
 */
public class Dataframe {

    ArrayList<DataframeColumn> columns;
    int maxColumnSize;

    public Dataframe() {
        columns = new ArrayList<>();
        maxColumnSize=0;
    }

    public Dataframe(ArrayList<DataframeColumn> columns) {
        this.columns = columns;
        maxColumnSizeEvaluation();
    }

    public Dataframe(String csvFilename) {
    }

    public ArrayList<DataframeColumn> getColumns() {
        return columns;
    }

    public void setColumns(ArrayList<DataframeColumn> columns) {
        this.columns = columns;
    }

    public void addColumn(DataframeColumn newcolumn) {
        this.columns.add(newcolumn);
        maxColumnSizeEvaluation();
    }

    public void addColumn(DataframeColumn newcolumn, int columnindex) {
        this.columns.add(columnindex, newcolumn);
        maxColumnSizeEvaluation();
    }

    public void printRow(int index) {
        for (DataframeColumn column : columns) {
            //todo : prier pour que la valeur soit concatenable au string
            // prérequis : le contenu de datacolumn doit supporter tostring
            if (column.getColumnContents().size() <= index) {
                System.out.println(column.getLabel() + " : " + column.getColumnContents().get(index).toString());
            } else {
                System.out.println(column.getLabel() + " : out of bounds");
            }
        }
    }

    public void printFirstRows(int numberOfRow) {
        for (int i = 0; i < numberOfRow; i++) {
            printRow(i);
        }
    }

    public void printFirstRows() {
        for (int i = 0; i < 5; i++) {
            printRow(i);
        }
    }

    public void printLastRows(int numberOfRow) {
        for (int i = 0; i < numberOfRow; i++) {
            printRow(this.maxColumnSize-i);
        }
    }

    public void printLastRows() {
        for (int i = 0; i < 5; i++) {
            printRow(this.maxColumnSize-i);
        }
    }

    private void maxColumnSizeEvaluation() {
        int max = 0;
        for(DataframeColumn column : columns){
            if(column.getColumnContents().size()>max){
                max = column.getColumnContents().size();
            }
        }
        this.maxColumnSize = max;
    }

}
