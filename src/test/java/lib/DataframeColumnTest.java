/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lib;

import java.util.ArrayList;
import main.java.lib.DataframeColumn;
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
public class DataframeColumnTest {

    public DataframeColumnTest() {
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

    private DataframeColumn makeupColumn() {
        String label = "label1";
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        return new DataframeColumn(label, arr);
    }

    /**
     * Test of getLabel method, of class DataframeColumn.
     */
    @Test
    public void testGetLabel() {
        System.out.println("getLabel");
        DataframeColumn instance = new DataframeColumn();
        String expResult = "";
        String result = instance.getLabel();
        assertEquals(expResult, result);
    }

    /**
     * Test of getLabel method, of class DataframeColumn. With Real values
     */
    @Test
    public void testGetLabelReal() {
        System.out.println("getLabel");
        DataframeColumn instance = makeupColumn();
        String expResult = "label1";
        String result = instance.getLabel();
        assertEquals(expResult, result);
    }

    /**
     * Test of setLabel method, of class DataframeColumn.
     */
    @Test
    public void testSetLabel() {
        System.out.println("setLabel");
        String Label = "1";
        DataframeColumn instance = new DataframeColumn();
        instance.setLabel(Label);
    }

    /**
     * Test of setLabel method, of class DataframeColumn. With real values
     */
    @Test
    public void testSetLabelReal() {
        System.out.println("setLabel");
        String Label = "label2";
        DataframeColumn instance = makeupColumn();
        instance.setLabel(Label);
        assertEquals(Label, instance.getLabel());
    }

    /**
     * Test of getColumnContents method, of class DataframeColumn.
     */
    @Test
    public void testGetColumnContents() {
        System.out.println("getColumnContents");
        DataframeColumn instance = new DataframeColumn();
        ArrayList result = instance.getColumnContents();
        assertEquals(0, result.size());
    }

    /**
     * Test of getColumnContents method, of class DataframeColumn. With real
     * values
     */
    @Test
    public void testGetColumnContentsReal() {
        System.out.println("getColumnContents");
        DataframeColumn instance = makeupColumn();
        ArrayList result = instance.getColumnContents();
        assertEquals(3, result.size());
        assertEquals(1, result.get(0));
        assertEquals(2, result.get(1));
        assertEquals(3, result.get(2));
    }

    /**
     * Test of setColumnContents method, of class DataframeColumn.
     */
    @Test
    public void testSetColumnContents() {
        System.out.println("setColumnContents");
        DataframeColumn instance = new DataframeColumn();
        instance.setColumnContents(null);
    }

    /**
     * Test of setColumnContents method, of class DataframeColumn.
     * With real values
     * 
     */
    @Test
    public void testSetColumnContentsReal() {
        System.out.println("setColumnContents");
        DataframeColumn instance = new DataframeColumn();
        DataframeColumn makeup = makeupColumn();
        instance.setColumnContents(makeup.getColumnContents());

        assertEquals(makeup.getColumnContents().size(), instance.getColumnContents().size());
        for (int i = 0; i < makeup.getColumnContents().size(); i++) {

            assertEquals(makeup.getColumnContents().get(i), instance.getColumnContents().get(i));
        }
    }

}
