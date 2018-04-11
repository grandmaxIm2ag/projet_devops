/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.ArrayList;
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
        min = r.nextDouble();
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
        Random r = new Random();
        max = r.nextDouble();
        int len = Math.abs(r.nextInt() % 100 + 1);
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

    
    public void hashtest() {
        DataframeColumn instance = new DataframeColumn();
        DataframeColumn makeup = makeupColumn();
        instance.setColumnContents(makeup.getColumnContents());
        int a = instance.hashCode();
        int b = instance.hashCode();
        assertEquals(a,b);
    }
    
    public void equaltest() {
        DataframeColumn instance = new DataframeColumn();
        DataframeColumn makeup = makeupColumn();
        instance.setColumnContents(makeup.getColumnContents());
        boolean a = instance.equals(instance);
        assertEquals(a,true);
        
    }
    
    public void isnumber() {
        DataframeColumn data = new DataframeColumn();
        boolean st = data.isNumber ("5");
         assertEquals(st,true);
        boolean st3 = data.isNumber (2);
         assertEquals(st3,true);
        boolean st4 = data.isNumber (3.5);
         assertEquals(st4,true);
        boolean st5 = data.isNumber (Number.class);
        assertEquals(st5,false);
        boolean sf = data.isNumber ("aa");
        assertEquals(sf,false);
        boolean d = data.isNumber(0.1);
        assertEquals(d,true);
        boolean b = data.isNumber(true);
        assertEquals(b,false);
        
        
        
    }
}
