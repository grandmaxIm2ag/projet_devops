/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.lib;

import java.util.ArrayList;
import junit.framework.TestCase;
import lib.DataframeColumn;

/**
 *
 * @author marcof
 */
public class DataframeColumnTest extends TestCase {
    
    public DataframeColumnTest(String testName) {
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
     * Test of getLabel method, of class DataframeColumn.
     */
    public void testGetLabel() {
        System.out.println("getLabel");
        DataframeColumn instance = new DataframeColumn();
        String expResult = "";
        String result = instance.getLabel();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        pass("The test case is a prototype.");
    }

    /**
     * Test of setLabel method, of class DataframeColumn.
     */
    public void testSetLabel() {
        System.out.println("setLabel");
        String Label = "";
        DataframeColumn instance = new DataframeColumn();
        instance.setLabel(Label);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getColumnContents method, of class DataframeColumn.
     */
    public void testGetColumnContents() {
        System.out.println("getColumnContents");
        DataframeColumn instance = new DataframeColumn();
        ArrayList expResult = null;
        ArrayList result = instance.getColumnContents();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setColumnContents method, of class DataframeColumn.
     */
    public void testSetColumnContents() {
        System.out.println("setColumnContents");
        DataframeColumn instance = new DataframeColumn();
        instance.setColumnContents(null);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
