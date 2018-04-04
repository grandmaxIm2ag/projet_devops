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
 */
public class DataframeColumn<E> {

    
    private String Label;
    private ArrayList<E> columnContents;
    
    public DataframeColumn(String Label, ArrayList<E> columnContents) {
        this.Label = Label;
        this.columnContents = columnContents;
    }

    public DataframeColumn(String Label) {
        this.Label = Label;
        this.columnContents = new ArrayList<>();
    }

    public DataframeColumn() {
        this.Label = "";
        this.columnContents = new ArrayList<>();
        
    }
    
    public String getLabel() {
        return Label;
    }

    public void setLabel(String Label) {
        this.Label = Label;
    }

    public ArrayList<E> getColumnContents() {
        return columnContents;
    }

    public void setColumnContents(ArrayList<E> columnContents) {
        this.columnContents = columnContents;
    }

}
