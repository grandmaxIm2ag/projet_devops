/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.java.lib;

import java.util.ArrayList;
import junit.framework.TestCase;
import  main.java.lib.*;


/**
 *
 * @author marcof
 */
public class DataframeTest extends TestCase {
    
    public DataframeTest(String testName) {
        super(testName);
    }
    
    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }
    
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    /**
     * Test of getColumns method, of class Dataframe.
     */
    public void testGetColumns() {
        System.out.println("getColumns");
        Dataframe instance = new Dataframe();
        ArrayList<DataframeColumn> result = instance.getColumns();
        assertEquals(0, result.size());
    }

    /**
     * Test of setColumns method, of class Dataframe.
     */
    public void testSetColumns() {
        System.out.println("setColumns");
        ArrayList<DataframeColumn> columns = new ArrayList<>();
        Dataframe instance = new Dataframe();
        instance.setColumns(columns);
        assertEquals(instance.getColumns(),columns);
    }

    /**
     * Test of addColumn method, of class Dataframe.
     */
	
    public void testAddColumn_DataframeColumn() {
        System.out.println("addColumn");
        DataframeColumn newcolumn = new DataframeColumn<Integer>("label");
        Dataframe instance = new Dataframe();
        instance.addColumn(newcolumn);
        assertEquals(instance.getColumns().get(instance.getColumns().size()-1),newcolumn);
    }

    /**
     * Test of addColumn method, of class Dataframe.
     */
    public void testAddColumn_DataframeColumn_int() {
        System.out.println("addColumn");
        DataframeColumn newcolumn = new DataframeColumn<Integer>("label");
        int columnindex = 0;
        Dataframe instance = new Dataframe();
        instance.addColumn(newcolumn);
        assertEquals(instance.getColumns().get(columnindex),newcolumn);
    }

    /**
     * Test of printRow method, of class Dataframe.
     */
    public void testPrintRow() {
        //not sure how to test this for real.
        System.out.println("printRow");
        int index = 0;
        Dataframe instance = new Dataframe();
        instance.printRow(index);
    }

    /**
     * Test of printFirstRows method, of class Dataframe.
     */
    public void testPrintFirstRows_int() {
        System.out.println("printFirstRows");
        int numberOfRow = 2;
        Dataframe instance = new Dataframe();
        instance.printFirstRows(numberOfRow);
    }

    /**
     * Test of printFirstRows method, of class Dataframe.
     */
    public void testPrintFirstRows_0args() {
        System.out.println("printFirstRows");
        Dataframe instance = new Dataframe();
        instance.printFirstRows();
    }

    /**
     * Test of printLastRows method, of class Dataframe.
     */
    public void testPrintLastRows_int() {
        System.out.println("printLastRows");
        int numberOfRow = 2;
        Dataframe instance = new Dataframe();
        instance.printLastRows(numberOfRow);
    }

    /**
     * Test of printLastRows method, of class Dataframe.
     */
    public void testPrintLastRows_0args() {
        System.out.println("printLastRows");
        Dataframe instance = new Dataframe();
        instance.printLastRows();
    }
    
}
