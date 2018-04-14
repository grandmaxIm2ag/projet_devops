/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import lib.DataframeColumn;
import exceptions.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Random;

/**
 * Test for DataFrameColumn
 * @author Ducruy Yann,Marco Florian,Grand Maxence
 */
public class DataframeColumnTest {

	/**
	 * 
	 */
    public DataframeColumnTest() {
    }

    /**
     * 
     */
    @BeforeClass
    public static void setUpClass() {
    }

    /**
     * 
     */
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * 
     */
    @Before
    public void setUp() {
    }

    /**
     * 
     */
    @After
    public void tearDown() {
    }

    /**
     * 
     * @return New column
     */
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
     * Test of setColumnContents method, of class DataframeColumn. With real
     * values
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

    /**
     * Test of getMin with correct data
     */
    @Test
    public void testMinValue() throws Exception {
        ArrayList<Double> l = new ArrayList<Double>();
        double min, tmp;
        Random r = new Random();
        min = r.nextDouble()*101;
        int len = Math.abs(r.nextInt() % 100 + 1);
        l.add(min);
        for (int i = 0; i < len; i++) {
            tmp = r.nextDouble() * 100;
            if (tmp < min) {
                min = tmp;
            }
            l.add(tmp);
        }
        DataframeColumn<Double> df = new DataframeColumn<Double>("test", l);
        assertEquals(min, df.getMin());
    }

    /**
     * Test of getMax with correct data
     */
    @Test
    public void testMaxValue() throws Exception {
        ArrayList<Double> l = new ArrayList<Double>();
        double max, tmp;
        Random r = new Random(System.currentTimeMillis());
        max = r.nextDouble()*99;
        int len = Math.abs((r.nextInt() % 100) + 1);
        System.out.println(len);
        l.add(max);
        for (int i = 0; i < len; i++) {
            tmp = r.nextDouble() * 100;
            if (tmp > max) {
                max = tmp;
            }
            l.add(tmp);
        }
        DataframeColumn<Double> df = new DataframeColumn<Double>("test", l);
        assertEquals(max, df.getMax());
    }
    
    /**
     * Test of getMax with empty column
     */
    @Test(expected=exceptions.EmptyException.class)
    public void testMaxValueEmpty() throws Exception {
        ArrayList<Double> l = new ArrayList<Double>();
        DataframeColumn<Double> df = new DataframeColumn<Double>("test", l);
        df.getMax();
    }
    
    /**
     * Test of getMin with empty column
     */
    @Test(expected=exceptions.EmptyException.class)
    public void testMinValueEmpty() throws Exception {
        ArrayList<Double> l = new ArrayList<Double>();
        DataframeColumn<Double> df = new DataframeColumn<Double>("test", l);
        df.getMin();
    }
    
    /**
     * Test of getMean with empty column
     */
    @Test(expected=exceptions.EmptyException.class)
    public void testMeanValueEmpty() throws Exception {
        ArrayList<Double> l = new ArrayList<Double>();
        DataframeColumn<Double> df = new DataframeColumn<Double>("test", l);
        df.getMean();
    }
    
    /**
     * Test of getMin with incorrect data
     */
    @Test(expected=exceptions.NotNumberColumnException.class)
    public void testMinValueIncorect() throws Exception {
        ArrayList<Boolean> l = new ArrayList<Boolean>();
        l.add(true);
        l.add(false);
        DataframeColumn<Boolean> df = new DataframeColumn<Boolean>("test", l);
        df.getMin();
    }
    
    /**
     * Test of getMax with incorrect data
     */
    @Test(expected=exceptions.NotNumberColumnException.class)
    public void testMaxValueIncorect() throws Exception {
        ArrayList<Boolean> l = new ArrayList<Boolean>();
        l.add(true);
        l.add(false);
        DataframeColumn<Boolean> df = new DataframeColumn<Boolean>("test", l);
        df.getMax();
    }
    
    /**
     * Test of getMean with incorrect data
     */
    @Test(expected=exceptions.NotNumberColumnException.class)
    public void testMeanValueIncorect() throws Exception {
        ArrayList<Boolean> l = new ArrayList<Boolean>();
        l.add(true);
        l.add(false);
        DataframeColumn<Boolean> df = new DataframeColumn<Boolean>("test", l);
        df.getMean();
    }

    /**
     * Test of getMean with correct data
     */
    @Test
    public void testMeanValue() throws Exception {
        ArrayList<Double> l = new ArrayList<Double>();
        double mean, tmp, sum;
        Random r = new Random();
        sum = 0;
        int len = Math.abs(r.nextInt() % 100 + 1);
        for (int i = 0; i < len; i++) {
            tmp = r.nextDouble() * 100;
            sum += tmp;
            l.add(tmp);
        }
        mean = (double) sum / len;
        DataframeColumn<Double> df = new DataframeColumn<Double>("test", l);
        System.out.println(mean);
        assertEquals(mean, df.getMean(), 0.001);
    }

    /**
     * Test HashCode
     */
    @Test
    public void hashtest() {
        DataframeColumn instance = new DataframeColumn();
        DataframeColumn makeup = makeupColumn();
        instance.setColumnContents(makeup.getColumnContents());
        int a = instance.hashCode();
        int b = instance.hashCode();
        assertEquals(a,b);
    }
    
    /**
     * Test equals
     */
    @Test
    public void equaltest() {
        DataframeColumn<Integer> instance = new DataframeColumn<Integer>();
        DataframeColumn<Integer> makeup = makeupColumn();
        instance.setColumnContents(makeup.getColumnContents());
        boolean a = instance.equals(instance);
        assertEquals(a,true);
        instance.setLabel("c1");
        makeup.setLabel("c2");
        
        assertFalse(instance.equals(makeup));
        makeup.setLabel("c1");
        ArrayList<Integer> l1 = new ArrayList<Integer>();
        l1.add(5);
        instance.setColumnContents(l1);
        assertFalse(instance.equals(makeup));
        ArrayList<Integer> l2 = new ArrayList<Integer>();
        l2.add(5);
        makeup.setColumnContents(l2);
        assertEquals(instance, makeup);
        l2.add(6);
        l1.add(7);
        instance.setColumnContents(l1);
        makeup.setColumnContents(l2);
        assertFalse(instance.equals(makeup));
        assertFalse(instance.equals(null));
        assertFalse(instance.equals(new String("Un erreur")));
    }
    
    /**
     * test isnumber
     */
    @Test
    public void isnumber() {
        DataframeColumn<Object> data = new DataframeColumn<Object>();
        assertTrue(data.isNumber ("5"));
        assertTrue(data.isNumber (2));
        assertTrue(data.isNumber (3.5));
        assertFalse(data.isNumber (Number.class));
        assertFalse(data.isNumber ("aa"));
        assertTrue(data.isNumber(0.1));
        assertFalse(data.isNumber(true));
    }
    
    /**
     * test getNumbner
     */
    @Test(expected=ParseException.class)
    public void testGetNumber() throws Exception{
    	DataframeColumn<Object> data = new DataframeColumn<Object>();
    	assertEquals(5.0, data.getNumber(5.0));
    	assertEquals((long)5, data.getNumber("5"));
    	data.getNumber("chien");
    }
    /**
     * Test constructor 3
     */
    @Test
    public void testConstructor3()  {
        DataframeColumn<Object> data = new DataframeColumn<Object>("un label");
        assertEquals("un label", data.getLabel());
    }
}
