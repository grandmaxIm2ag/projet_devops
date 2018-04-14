/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lib;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Objects;

import exceptions.EmptyException;
import exceptions.NotNumberColumnException;

/**
 *
 * @author Ducruy Yann,Marco Florian,Grand Maxence
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

    /**
     * Calculate mean of a column
     * @return double of column's mean
     * @throws NotNumberColumnException
     * @throws EmptyException 
     */
    public double getMean() throws NotNumberColumnException, EmptyException {
    	if(columnContents.size() == 0)
    		throw new EmptyException("Empty Column");
        double Mean = 0.0;
        for (E elem : columnContents) {
            try {
                Mean += (double) getNumber(elem);
            } catch (ParseException e) {
                throw new NotNumberColumnException("NaN Mean");
            }
        }

        Mean /= columnContents.size();
        return Mean;
    }

    /**
     * Get minimum value of a column
     * @return Minimum element of column
     * @throws ParseException
     * @throws NotNumberColumnException 
     * @throws EmptyException 
     */
    public Number getMin() throws NotNumberColumnException, EmptyException {
    	if(columnContents.size() == 0)
    		throw new EmptyException("Empty Column");
        Number Min;
        try {
            Min = getNumber(columnContents.get(0));

            for (E elem : columnContents) {
                if (Min.doubleValue() > getNumber(elem).doubleValue()) {
                	
                    Min = getNumber(elem);
                }
            }
        }catch (ParseException e) {
            throw new NotNumberColumnException("Not A Number Volumn Expception");
        }

        return Min;
    }

    /**
     * Get Maximum Value of Column
     * @return Maximum element of column
     * @throws EmptyException 
     * @throws ParseException
     */
    public Number getMax() throws NotNumberColumnException, EmptyException {
    	if(columnContents.size() == 0)
    		throw new EmptyException("Empty Column");
        Number Max;
        try {
            Max = getNumber(columnContents.get(0));

            for (E elem : columnContents) {
                if (Max.doubleValue() < getNumber(elem).doubleValue()) {
                    Max = getNumber(elem);
                }
            }
        }catch (ParseException e) {
            throw new NotNumberColumnException("Not A Number Volumn Expception");
        }

        return Max;
    }

    /**
     * Boolean that test if an element of a Dataframe is a number
     * @param elem dataframe element
     * @return True if the element is a number, False if the element is not.
     */
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

    /**
     * Function that tests if an element is a number and return it
     * @param elem dataframe element
     * @return value of the number
     * @throws ParseException if the element is not a number
     */
    public Number getNumber(E elem) throws ParseException {
        if (isNumber(elem)) {
            if (elem instanceof String) {
                Number num = NumberFormat.getInstance().parse((String) elem);
                return num;
            } else {
                return (Number) elem;
            }
        } else {
            throw new ParseException("NaN", 0);
        }
    }

    /**
     * @return the hashcode
     */
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 43 * hash + Objects.hashCode(this.Label);
        hash = 43 * hash + Objects.hashCode(this.columnContents);
        return hash;
    }

    /**
     * @param obj an object
     * @return verify the equality
     */
    @Override
    public boolean equals(Object obj) {
    	System.out.println("! "+obj+(obj == null));
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
        if(this.columnContents.size() != other.columnContents.size())
        	return false;
        
        boolean b = true;
        for(int i=0; i<this.columnContents.size(); i++)
        	b &= columnContents.get(i) == other.columnContents.get(i);
        return b;
    }

}
