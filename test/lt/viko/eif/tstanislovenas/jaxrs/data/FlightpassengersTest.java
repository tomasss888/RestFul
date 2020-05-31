/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lt.viko.eif.tstanislovenas.jaxrs.data;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author bicas
 */
public class FlightpassengersTest {
    
    public FlightpassengersTest() {
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
     * Test of getId method, of class Flightpassengers.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Flightpassengers instance = new Flightpassengers();
        Integer expResult = 1;
        instance.setId(expResult);
        Integer result = instance.getId();
        assertEquals(expResult, result);
    }

    /**
     * Test of setId method, of class Flightpassengers.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        Integer id = 1;
        Flightpassengers instance = new Flightpassengers();
        instance.setId(id);
    }

    /**
     * Test of getFlightID method, of class Flightpassengers.
     */
    @Test
    public void testGetFlightID() {
        System.out.println("getFlightID");
        Flightpassengers instance = new Flightpassengers();
        Flight expResult = new Flight();
        instance.setFlightID(expResult);
        Flight result = instance.getFlightID();
        assertEquals(expResult, result);
    }

    /**
     * Test of setFlightID method, of class Flightpassengers.
     */
    @Test
    public void testSetFlightID() {
        System.out.println("setFlightID");
        Flight flightID = null;
        Flightpassengers instance = new Flightpassengers();
        instance.setFlightID(flightID);
    }

    /**
     * Test of getPassengerID method, of class Flightpassengers.
     */
    @Test
    public void testGetPassengerID() {
        System.out.println("getPassengerID");
        Flightpassengers instance = new Flightpassengers();
        Passenger expResult = new Passenger();
        instance.setPassengerID(expResult);
        Passenger result = instance.getPassengerID();
        assertEquals(expResult, result);
    }

    /**
     * Test of setPassengerID method, of class Flightpassengers.
     */
    @Test
    public void testSetPassengerID() {
        System.out.println("setPassengerID");
        Passenger passengerID = null;
        Flightpassengers instance = new Flightpassengers();
        instance.setPassengerID(passengerID);
    }

    /**
     * Test of equals method, of class Flightpassengers.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object object = null;
        Flightpassengers instance = new Flightpassengers();
        boolean expResult = false;
        boolean result = instance.equals(object);
        assertEquals(expResult, result);
    }

}
