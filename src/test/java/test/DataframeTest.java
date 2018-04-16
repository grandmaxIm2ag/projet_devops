/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.io.IOException;
import java.util.ArrayList;
import lib.Dataframe;
import lib.DataframeColumn;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import exceptions.BadIndexException;

import static org.junit.Assert.*;

/**
 *
 * @author ducruyy
 */
public class DataframeTest {

    public DataframeTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    private Dataframe makeupDataframe() {
        //create a dataframe with 2 columns and 3 rows. first column have only two rows.

        String label1 = "column1";
        ArrayList<Integer> col1 = new ArrayList<>();
        col1.add(2);
        col1.add(3);
        DataframeColumn column1 = new DataframeColumn(label1, col1);
        String label2 = "column2";
        ArrayList<Integer> col2 = new ArrayList<>();
        col2.add(1);
        col2.add(4);
        col2.add(5);
        DataframeColumn column2 = new DataframeColumn(label2, col2);

        Dataframe d = new Dataframe();
        d.addColumn(column1);
        d.addColumn(column2);
        return d;
    }

    /**
     * Test of getColumns method, of class Dataframe.
     */
    @Test
    public void testGetColumns() {
        Dataframe instance = new Dataframe();
        ArrayList<DataframeColumn> result = instance.getColumns();
        assertEquals(0, result.size());
    }

    /**
     * Test of getColumns method, of class Dataframe. With real values
     */
    @Test
    public void testGetColumnsReal() {
        Dataframe instance = makeupDataframe();
        ArrayList<DataframeColumn> result = instance.getColumns();
        assertEquals(2, result.size());
    }

    /**
     * Test of setColumns method, of class Dataframe. With real values
     */
    @Test
    public void testSetColumnsReal() {
        Dataframe d = makeupDataframe();
        ArrayList<DataframeColumn> columns = d.getColumns();
        Dataframe instance = new Dataframe();
        instance.setColumns(columns);
        assertEquals(d.getColumns().size(), instance.getColumns().size());
        assert (d.equals(instance));
    }

    /**
     * Test of addColumn method, of class Dataframe.
     */
    @Test
    public void testAddColumn_DataframeColumn() {
        DataframeColumn newcolumn = new DataframeColumn();
        Dataframe instance = new Dataframe();
        instance.addColumn(newcolumn);
        assertEquals(1, instance.getColumns().size());
    }

    /**
     * Test of addColumn method, of class Dataframe. With a real value
     */
    @Test
    public void testAddColumn_DataframeColumnReal() {
        Dataframe d = makeupDataframe();
        DataframeColumn newcolumn = d.getColumns().get(0);
        Dataframe instance = new Dataframe();
        instance.addColumn(newcolumn);
        assertEquals(1, instance.getColumns().size());
        assert (instance.getColumns().get(0).equals(newcolumn));
    }

    /**
     * Test of addColumn method, of class Dataframe.
     */
    @Test
    public void testAddColumn_DataframeColumn_int() {
        DataframeColumn newcolumn = new DataframeColumn();
        int columnindex = 0;
        Dataframe instance = new Dataframe();
        instance.addColumn(newcolumn, columnindex);
        assert (instance.getColumns().get(columnindex).equals(newcolumn));
    }

    /**
     * Test of addColumn method, of class Dataframe. With real values
     */
    @Test
    public void testAddColumn_DataframeColumn_intReal() {
        int columnindex = 0;
        Dataframe d = makeupDataframe();
        DataframeColumn newcolumn = d.getColumns().get(0);
        DataframeColumn newcolumn2 = d.getColumns().get(1);
        Dataframe instance = new Dataframe();
        instance.addColumn(newcolumn, columnindex);
        instance.addColumn(newcolumn2, columnindex);
        assertEquals(2, instance.getColumns().size());
        assertEquals(newcolumn2, instance.getColumns().get(0));
        assertEquals(newcolumn, instance.getColumns().get(1));
        //todo : maybe check content
    }

    /**
     * Test of printRow method, of class Dataframe.
     * @throws BadIndexException exception for print
     */
    @Test
    public void testPrintRow() throws BadIndexException {
        int index = 0;
        Dataframe instance = new Dataframe();
        instance.addColumn(new DataframeColumn());
        instance.printRow(index);
    }
    /**
     * Test of printRow method, of class Dataframe.
     * @throws BadIndexException exception for print 
     */
    @Test
    public void testPrintRowReal() throws BadIndexException {
        int index = 0;
        Dataframe instance = makeupDataframe();
        instance.printRow(index);
    }
    /**
     * Test of printRow method, of class Dataframe.
     * @throws BadIndexException exception for print 
     */
    @Test
    public void testPrintRowReal2() throws BadIndexException {
        Dataframe instance = makeupDataframe();
        instance.printRow(0);
        instance.printRow(1);
    }
    /**
     * Test of printRow method, of class Dataframe.
     * @throws BadIndexException exception for print 
     */
    @Test(expected=exceptions.BadIndexException.class)
    public void testPrintRowLessZero() throws BadIndexException {
        int index = -1;
        Dataframe instance = makeupDataframe();
        instance.printRow(index);
    }
    /**
     * Test of printRow method, of class Dataframe.
     * @throws BadIndexException exception for print 
     */
    @Test(expected=exceptions.BadIndexException.class)
    public void testPrintMoreThanMax() throws BadIndexException {
        int index = 8;
        Dataframe instance = makeupDataframe();
        instance.printRow(index);
    }

    /**
     * Test of printFirstRows method, of class Dataframe.
     * @throws BadIndexException exception for print 
     */
    @Test
    public void testPrintFirstRows_int() throws BadIndexException {
        int numberOfRow = 0;
        Dataframe instance = new Dataframe();
        instance.printFirstRows(numberOfRow);
    }

    /**
     * Test of printFirstRows method, of class Dataframe.
     * @throws BadIndexException exception for print 
     */
    @Test
    public void testPrintFirstRows_0args() throws BadIndexException {
        Dataframe instance = new Dataframe();
        for(int i=0; i<10; i++) {
        	
        	ArrayList<Integer> l = new ArrayList<>();
        	for(int j =0; j<10; j++)
        		l.add(j);
        	DataframeColumn<Integer> dd = new DataframeColumn<>("c"+i, l);
        	instance.addColumn(dd);
        }
        instance.printFirstRows();
    }

    /**
     * Test of printLastRows method, of class Dataframe.
     * @throws BadIndexException exception for print 
     */
    @Test
    public void testPrintLastRows_int() throws BadIndexException {
        int numberOfRow = 2;
        Dataframe instance = new Dataframe();
        for(int i=0; i<10; i++) {
        	
        	ArrayList<Integer> l = new ArrayList<>();
        	for(int j =0; j<10; j++)
        		l.add(j);
        	DataframeColumn<Integer> dd = new DataframeColumn<>("c"+i, l);
        	instance.addColumn(dd);
        }
        instance.printLastRows(numberOfRow);
    }

    /**
     * Test of printLastRows method, of class Dataframe.
     * @throws BadIndexException exception for print 
     */
    @Test
    public void testPrintLastRows_0args() throws BadIndexException {
        Dataframe instance = new Dataframe();
        for(int i=0; i<10; i++) {
        	
        	ArrayList<Integer> l = new ArrayList<>();
        	for(int j =0; j<10; j++)
        		l.add(j);
        	DataframeColumn<Integer> dd = new DataframeColumn<>("c"+i, l);
        	instance.addColumn(dd);
        }
        instance.printLastRows();
    }

    /**
     * Test of printAllRows method, of class Dataframe.
     * @throws BadIndexException exception for print 
     */
    @Test
    public void testPrintAllRows() throws BadIndexException {
        Dataframe instance = new Dataframe();
        instance.printAllRows();
    }
    /**
     * Test of printAllRows method, of class Dataframe.
     * @throws BadIndexException exception for print 
     */
    @Test
    public void testPrintAllRowsReal() throws BadIndexException {
        Dataframe instance = makeupDataframe();
        instance.printAllRows();
    }

    /**
     * Test of subDataframeFromRows method, of class Dataframe.
     */
    @Test
    public void testSubDataframeFromRows() {
        int[] indexes = new int[0];
        Dataframe instance = new Dataframe();
        Dataframe result = instance.subDataframeFromRows(indexes);
        assertEquals(0, result.getColumns().size());
    }
    /**
     * Test of subDataframeFromRows method, of class Dataframe.
     */
    @Test
    public void testSubDataframeFromRowsReal() {
        int[] indexes = new int[1];
        indexes[0]=1;
        Dataframe instance = makeupDataframe();
        Dataframe result = instance.subDataframeFromRows(indexes);
        assertEquals(2, result.getColumns().size());
    }

    /**
     * Test of subDataframeFromColumns method, of class Dataframe.
     */
    @Test
    public void testSubDataframeFromColumns() {
        ArrayList<String> labels = new ArrayList<>();
        Dataframe instance = new Dataframe();
        Dataframe result = instance.subDataframeFromColumns(labels);
        assertEquals(0, result.getColumns().size());
    }
    /**
     * Test of subDataframeFromColumns method, of class Dataframe.
     */
    @Test
    public void testSubDataframeFromColumnsReal() {
        ArrayList<String> labels = new ArrayList<>();
        labels.add("column1");
        Dataframe instance = makeupDataframe();
        Dataframe result = instance.subDataframeFromColumns(labels);
        assertEquals(1, result.getColumns().size());
    }

    /**
     * Test of subDataframeFromColumns method, of class Dataframe.
     */
    @Test
    public void testConstructor() {
        Dataframe instance = new Dataframe();
        Dataframe instance2 = new Dataframe();

        assertTrue (instance.equals(instance2));
    }

    /*
     * Test of subDataframeFromColumns method, of class Dataframe.
     */
    @Test
    public void testConstructor2() throws Exception{
        String pathtocsv = "csvtest/small.csv";
        Dataframe instance = new Dataframe(pathtocsv);
        Dataframe instance2 = new Dataframe(pathtocsv);
        assertTrue (instance.equals(instance2));
    }

    /**
     * Test of subDataframeFromColumns method, of class Dataframe.
     */
    @Test
    public void testConstructor3() {
        Dataframe instance = makeupDataframe();
        Dataframe instance2 = makeupDataframe();
        assertTrue (instance.equals(instance2));
    }
    /**
     * Test of subDataframeFromColumns method, of class Dataframe.
     */
    @Test
    public void testConstructor4() {
        ArrayList<DataframeColumn> array = new ArrayList<>();
        Dataframe instance = new Dataframe(array);

        assertEquals(instance.getColumns().size(),0);
        assertFalse(instance.equals(null));
        assertFalse(instance.equals(""));
    }

    /**
     * Test of subDataframeFromColumns method, of class Dataframe.
     */
    @Test
    public void testCHashCode() {
        Dataframe instance = makeupDataframe();
        int hash = instance.hashCode();

        assertEquals(hash,instance.hashCode());

    }
    
    /**
     * Test of equals
     */
    @Test 
    public void testEquals( ) {
    	ArrayList<Integer> l1 = new ArrayList<>();
    	l1.add(5);
    	Dataframe d1 = new Dataframe();
    	d1.addColumn(new DataframeColumn("c1",l1));
    	Dataframe d2 = new Dataframe();
    	assertFalse(d1.equals(d2));
    	d1.addColumn(new DataframeColumn("c2",l1));
    	d2.addColumn(new DataframeColumn("c1",l1));
    	assertFalse(d1.equals(d2));
    }
    
    /**
     * Test printrow
     * @throws BadIndexException exception for print 
     */
    public void printTest() throws BadIndexException {
    	Dataframe d = makeupDataframe();
    	d.printAllRows();
    	d.printFirstRows();
    	d.printLastRows();
    }
    
    /**
     * Test printrow exception for first column
     * @throws BadIndexException exception for print 
     */
    @Test(expected=exceptions.BadIndexException.class)
    public void printTest1() throws BadIndexException {
    	Dataframe d = makeupDataframe();
    	d.printFirstRows(Integer.MAX_VALUE);
    }
    
    /**
     * Test printrow, exception for last
     * @throws BadIndexException exception for print 
     */
    @Test(expected=exceptions.BadIndexException.class)
    public void printTest2() throws BadIndexException {
    	Dataframe d = makeupDataframe();
    	d.printLastRows(Integer.MAX_VALUE);
    }

}
