/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java.lib;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author marcof
 * @param <E> The type of the column
 */
public class DataframeColumn<E> {

    private String Label;
    private ArrayList<E> columnContents;

    /**
     * Create a dataframe column from a set of data and a label
     *
     * @param Label the label of the column
     * @param columnContents the data set of the column
     */
    public DataframeColumn(String Label, ArrayList<E> columnContents) {
        this.Label = Label;
        this.columnContents = columnContents;
    }

    /**
     * Create a dataframe column from an label and create an empty set
     *
     * @param Label the label of the column
     */
    public DataframeColumn(String Label) {
        this.Label = Label;
        this.columnContents = new ArrayList<>();
    }

    /**
     * Base constructor
     */
    public DataframeColumn() {
        this.Label = "";
        this.columnContents = new ArrayList<>();

    }

    /**
     * Getter
     *
     * @return the label
     */
    public String getLabel() {
        return Label;
    }

    /**
     * Setter
     *
     * @param Label the new label
     */
    public void setLabel(String Label) {
        this.Label = Label;
    }

    /**
     * Getter
     *
     * @return the data set
     */
    public ArrayList<E> getColumnContents() {
        return columnContents;
    }

    /**
     * Setter
     *
     * @param columnContents the new data set
     */
    public void setColumnContents(ArrayList<E> columnContents) {
        this.columnContents = columnContents;
    }

    public double getMean() {
        double Mean = 0.0;
        try {
            for (E elem : columnContents) {
                try {
                Mean += (double) getNumber(elem);}
                catch (ParseException e) {
                return 0.0;
                }
            }

            Mean /= columnContents.size();
        } catch (NumberFormatException e) {
            Mean = 0.0;
        }

        return Mean;
    }

    public Number getMin() throws ParseException {
        Number Min;
        try {
            Min = getNumber(columnContents.get(0));

            for (E elem : columnContents) {
                if (Min.doubleValue() > getNumber(elem).doubleValue()) {
                    Min = getNumber(elem);
                }
            }
        } catch (NumberFormatException e) {
            Min = 0.0;
        }

        return Min;
    }

    public Number getMax() throws ParseException {
        Number Max;
        try {
            Max = getNumber( columnContents.get(0));

            for (E elem : columnContents) {
                if (Max.doubleValue() < getNumber( elem).doubleValue()) {
                    Max = getNumber( elem);
                }
            }
        } catch (NumberFormatException e) {
            Max = 0.0;
        }

        return Max;
    }
    public boolean isNumber(E elem) {
        Class c = elem.getClass();
        if (Number.class.isAssignableFrom(c)) {
            return true;
        }
        if (elem instanceof String) {
            NumberFormat nf = NumberFormat.getInstance();
            try {
                nf.parse((String) elem).getClass().getName();
            } catch (ParseException e) {
                return false;
            }
            return true;
            
        }
        return false;
    }
    
    public Number getNumber(E elem) throws ParseException{
        if (isNumber(elem)) {
            if (elem instanceof String) {
                Number num = NumberFormat.getInstance().parse((String) elem);
                return num;
            }
            else {
                return (Number) elem;
            }
        }
        else {
            throw new ParseException("NaN",0);
        }
    }
    
    public boolean isColumnNumber(ArrayList<E> col) {
        for (E elem : col) {
            if (!isNumber(elem)) {
                return false;
            }
        }
        return true;
    }
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 43 * hash + Objects.hashCode(this.Label);
        hash = 43 * hash + Objects.hashCode(this.columnContents);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final DataframeColumn<?> other = (DataframeColumn<?>) obj;
        if (!Objects.equals(this.Label, other.Label)) {
            return false;
        }
        if (!Objects.equals(this.columnContents, other.columnContents)) {
            return false;
        }
        return true;
    }
    
}
