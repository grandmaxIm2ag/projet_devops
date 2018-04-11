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
        System.out.println("getColumns");
        Dataframe instance = new Dataframe();
        ArrayList<DataframeColumn> result = instance.getColumns();
        assertEquals(0, result.size());
    }

    /**
     * Test of getColumns method, of class Dataframe. With real values
     */
    @Test
    public void testGetColumnsReal() {
        System.out.println("getColumns");
        Dataframe instance = makeupDataframe();
        ArrayList<DataframeColumn> result = instance.getColumns();
        assertEquals(2, result.size());
    }

    /**
     * Test of setColumns method, of class Dataframe. With real values
     */
    @Test
    public void testSetColumnsReal() {
        System.out.println("setColumns");
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
        System.out.println("addColumn");
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
        System.out.println("addColumn");
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
        System.out.println("addColumn");
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
        System.out.println("addColumn");
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
     */
    @Test
    public void testPrintRow() {
        System.out.println("printRow");
        int index = 0;
        Dataframe instance = new Dataframe();
        instance.printRow(index);
    }
    /**
     * Test of printRow method, of class Dataframe.
     */
    @Test
    public void testPrintRowReal() {
        System.out.println("printRow");
        int index = 0;
        Dataframe instance = makeupDataframe();
        instance.printRow(index);
    }
    /**
     * Test of printRow method, of class Dataframe.
     */
    @Test
    public void testPrintRowReal2() {
        System.out.println("printRow");
        Dataframe instance = makeupDataframe();
        instance.printRow(0);
        instance.printRow(1);
        instance.printRow(2);
    }
    /**
     * Test of printRow method, of class Dataframe.
     */
    @Test
    public void testPrintRowLessZero() {
        System.out.println("printRow");
        int index = -1;
        Dataframe instance = makeupDataframe();
        instance.printRow(index);
    }
    /**
     * Test of printRow method, of class Dataframe.
     */
    @Test
    public void testPrintMoreThanMax() {
        System.out.println("printRow");
        int index = 8;
        Dataframe instance = makeupDataframe();
        instance.printRow(index);
    }

    /**
     * Test of printFirstRows method, of class Dataframe.
     */
    @Test
    public void testPrintFirstRows_int() {
        System.out.println("printFirstRows");
        int numberOfRow = 2;
        Dataframe instance = new Dataframe();
        instance.printFirstRows(numberOfRow);
    }

    /**
     * Test of printFirstRows method, of class Dataframe.
     */
    @Test
    public void testPrintFirstRows_0args() {
        System.out.println("printFirstRows");
        Dataframe instance = new Dataframe();
        instance.printFirstRows();
    }

    /**
     * Test of printLastRows method, of class Dataframe.
     */
    @Test
    public void testPrintLastRows_int() {
        System.out.println("printLastRows");
        int numberOfRow = 2;
        Dataframe instance = new Dataframe();
        instance.printLastRows(numberOfRow);
    }

    /**
     * Test of printLastRows method, of class Dataframe.
     */
    @Test
    public void testPrintLastRows_0args() {
        System.out.println("printLastRows");
        Dataframe instance = new Dataframe();
        instance.printLastRows();
    }

    /**
     * Test of printAllRows method, of class Dataframe.
     */
    @Test
    public void testPrintAllRows() {
        System.out.println("printAllRows");
        Dataframe instance = new Dataframe();
        instance.printAllRows();
    }
    /**
     * Test of printAllRows method, of class Dataframe.
     */
    @Test
    public void testPrintAllRowsReal() {
        System.out.println("printAllRows");
        Dataframe instance = makeupDataframe();
        instance.printAllRows();
    }

    /**
     * Test of subDataframeFromRows method, of class Dataframe.
     */
    @Test
    public void testSubDataframeFromRows() {
        System.out.println("subDataframeFromRows");
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
        System.out.println("subDataframeFromRows");
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
        System.out.println("subDataframeFromColumns");
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
        System.out.println("subDataframeFromColumns");
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

        assert (instance.equals(instance2));
    }

    /**
     * Test of subDataframeFromColumns method, of class Dataframe.
     */
    @Test
    public void testConstructor2() {
        String pathtocsv = "/home/d/ducruyy/DevOps/projet_devops/csvtest/small.csv";
        try {
            Dataframe instance = new Dataframe(pathtocsv);
            Dataframe instance2 = new Dataframe(pathtocsv);
            assert (instance != null);
            assert (instance.equals(instance2));
        } catch (IOException ex) {
            fail("Exception got thrown, so test can't be asserted => " + ex.getMessage() + ex.getLocalizedMessage());
        }

    }

    /**
     * Test of subDataframeFromColumns method, of class Dataframe.
     */
    @Test
    public void testConstructor3() {
        Dataframe instance = makeupDataframe();
        Dataframe instance2 = makeupDataframe();

        assert (instance.equals(instance2));

    }
    /**
     * Test of subDataframeFromColumns method, of class Dataframe.
     */
    @Test
    public void testConstructor4() {
        ArrayList<DataframeColumn> array = new ArrayList<>();
        Dataframe instance = new Dataframe(array);

        assertEquals(instance.getColumns().size(),0);

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

}
