/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cpd4414.assign1;

import java.util.Date;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author c0644288
 */
public class OrderTest {
    
    public OrderTest() {
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

    /**
     * Test of addPurchase method, of class Order.
     */
    @Test
    public void testAddPurchase() {
        System.out.println("addPurchase");
        Purchase p = null;
        Order instance = null;
        instance.addPurchase(p);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCustomerId method, of class Order.
     */
    @Test
    public void testGetCustomerId() {
        System.out.println("getCustomerId");
        Order instance = null;
        String expResult = "";
        String result = instance.getCustomerId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCustomerId method, of class Order.
     */
    @Test
    public void testSetCustomerId() {
        System.out.println("setCustomerId");
        String customerId = "";
        Order instance = null;
        instance.setCustomerId(customerId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCustomerName method, of class Order.
     */
    @Test
    public void testGetCustomerName() {
        System.out.println("getCustomerName");
        Order instance = null;
        String expResult = "";
        String result = instance.getCustomerName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCustomerName method, of class Order.
     */
    @Test
    public void testSetCustomerName() {
        System.out.println("setCustomerName");
        String customerName = "";
        Order instance = null;
        instance.setCustomerName(customerName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTimeReceived method, of class Order.
     */
    @Test
    public void testGetTimeReceived() {
        System.out.println("getTimeReceived");
        Order instance = null;
        Date expResult = null;
        Date result = instance.getTimeReceived();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTimeReceived method, of class Order.
     */
    @Test
    public void testSetTimeReceived() {
        System.out.println("setTimeReceived");
        Date timeReceived = null;
        Order instance = null;
        instance.setTimeReceived(timeReceived);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTimeProcessed method, of class Order.
     */
    @Test
    public void testGetTimeProcessed() {
        System.out.println("getTimeProcessed");
        Order instance = null;
        Date expResult = null;
        Date result = instance.getTimeProcessed();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTimeProcessed method, of class Order.
     */
    @Test
    public void testSetTimeProcessed() {
        System.out.println("setTimeProcessed");
        Date timeProcessed = null;
        Order instance = null;
        instance.setTimeProcessed(timeProcessed);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTimeFulfilled method, of class Order.
     */
    @Test
    public void testGetTimeFulfilled() {
        System.out.println("getTimeFulfilled");
        Order instance = null;
        Date expResult = null;
        Date result = instance.getTimeFulfilled();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTimeFulfilled method, of class Order.
     */
    @Test
    public void testSetTimeFulfilled() {
        System.out.println("setTimeFulfilled");
        Date timeFulfilled = null;
        Order instance = null;
        instance.setTimeFulfilled(timeFulfilled);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListOfPurchases method, of class Order.
     */
    @Test
    public void testGetListOfPurchases() {
        System.out.println("getListOfPurchases");
        Order instance = null;
        List<Purchase> expResult = null;
        List<Purchase> result = instance.getListOfPurchases();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setListOfPurchases method, of class Order.
     */
    @Test
    public void testSetListOfPurchases() {
        System.out.println("setListOfPurchases");
        List<Purchase> listOfPurchases = null;
        Order instance = null;
        instance.setListOfPurchases(listOfPurchases);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNotes method, of class Order.
     */
    @Test
    public void testGetNotes() {
        System.out.println("getNotes");
        Order instance = null;
        String expResult = "";
        String result = instance.getNotes();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNotes method, of class Order.
     */
    @Test
    public void testSetNotes() {
        System.out.println("setNotes");
        String notes = "";
        Order instance = null;
        instance.setNotes(notes);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
