/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java.lib;

import java.util.ArrayList;

/**
 *
 * @author marcof
 * @param <E> The type of the column
 */
public class DataframeColumn<E> {

    
    private String Label;
    private ArrayList<E> columnContents;
    
    /**
     *  Create a dataframe column from a set of data and a label
     * @param Label the label of the column
     * @param columnContents the data set of the column
     */
    public DataframeColumn(String Label, ArrayList<E> columnContents) {
        this.Label = Label;
        this.columnContents = columnContents;
    }

    /**
     *  Create a dataframe column from an label and create an empty set
     * @param Label the label of the column
     */
    public DataframeColumn(String Label) {
        this.Label = Label;
        this.columnContents = new ArrayList<>();
    }

    /**
     *  Base constructor
     */
    public DataframeColumn() {
        this.Label = "";
        this.columnContents = new ArrayList<>();
        
    }
    
    /**
     *  Getter
     * @return the label
     */
    public String getLabel() {
        return Label;
    }

    /**
     *  Setter
     * @param Label the new label
     */
    public void setLabel(String Label) {
        this.Label = Label;
    }

    /**
     *  Getter
     * @return the data set
     */
    public ArrayList<E> getColumnContents() {
        return columnContents;
    }

    /**
     *  Setter
     * @param columnContents the new data set
     */
    public void setColumnContents(ArrayList<E> columnContents) {
        this.columnContents = columnContents;
    }

}
