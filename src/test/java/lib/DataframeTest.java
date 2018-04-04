/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.java.lib;

import java.util.ArrayList;
import junit.framework.TestCase;
import main.java.lib.Dataframe;
import main.java.lib.DataframeColumn;


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
        ArrayList<DataframeColumn> expResult = null;
        ArrayList<DataframeColumn> result = instance.getColumns();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setColumns method, of class Dataframe.
     */
    public void testSetColumns() {
        System.out.println("setColumns");
        ArrayList<DataframeColumn> columns = null;
        Dataframe instance = new Dataframe();
        instance.setColumns(columns);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addColumn method, of class Dataframe.
     */
    public void testAddColumn_DataframeColumn() {
        System.out.println("addColumn");
        DataframeColumn newcolumn = null;
        Dataframe instance = new Dataframe();
        instance.addColumn(newcolumn);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addColumn method, of class Dataframe.
     */
    public void testAddColumn_DataframeColumn_int() {
        System.out.println("addColumn");
        DataframeColumn newcolumn = null;
        int columnindex = 0;
        Dataframe instance = new Dataframe();
        instance.addColumn(newcolumn, columnindex);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of printRow method, of class Dataframe.
     */
    public void testPrintRow() {
        System.out.println("printRow");
        int index = 0;
        Dataframe instance = new Dataframe();
        instance.printRow(index);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of printFirstRows method, of class Dataframe.
     */
    public void testPrintFirstRows_int() {
        System.out.println("printFirstRows");
        int numberOfRow = 0;
        Dataframe instance = new Dataframe();
        instance.printFirstRows(numberOfRow);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of printFirstRows method, of class Dataframe.
     */
    public void testPrintFirstRows_0args() {
        System.out.println("printFirstRows");
        Dataframe instance = new Dataframe();
        instance.printFirstRows();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of printLastRows method, of class Dataframe.
     */
    public void testPrintLastRows_int() {
        System.out.println("printLastRows");
        int numberOfRow = 0;
        Dataframe instance = new Dataframe();
        instance.printLastRows(numberOfRow);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of printLastRows method, of class Dataframe.
     */
    public void testPrintLastRows_0args() {
        System.out.println("printLastRows");
        Dataframe instance = new Dataframe();
        instance.printLastRows();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
