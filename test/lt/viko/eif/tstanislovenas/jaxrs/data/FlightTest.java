/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lt.viko.eif.tstanislovenas.jaxrs.data;

import java.util.ArrayList;
import java.util.Collection;
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
public class FlightTest {
    
    public FlightTest() {
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
     * Test of getId method, of class Flight.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Flight instance = new Flight();
        Integer expResult = 1;
        instance.setId(expResult);
        Integer result = instance.getId();
        assertEquals(expResult, result);
    }

    /**
     * Test of setId method, of class Flight.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        Integer id = null;
        Flight instance = new Flight();
        instance.setId(id);
    }

    /**
     * Test of getSeatsTaken method, of class Flight.
     */
    @Test
    public void testGetSeatsTaken() {
        System.out.println("getSeatsTaken");
        Flight instance = new Flight();
        Integer expResult = 1;
        instance.setSeatsTaken(expResult);
        Integer result = instance.getSeatsTaken();
        assertEquals(expResult, result);
    }

    /**
     * Test of setSeatsTaken method, of class Flight.
     */
    @Test
    public void testSetSeatsTaken() {
        System.out.println("setSeatsTaken");
        Integer seatsTaken = null;
        Flight instance = new Flight();
        instance.setSeatsTaken(seatsTaken);
    }

    /**
     * Test of getTimeTo method, of class Flight.
     */
    @Test
    public void testGetTimeTo() {
        System.out.println("getTimeTo");
        Flight instance = new Flight();
        Integer expResult = 1;
        instance.setTimeTo(expResult);
        Integer result = instance.getTimeTo();
        assertEquals(expResult, result);
    }

    /**
     * Test of setTimeTo method, of class Flight.
     */
    @Test
    public void testSetTimeTo() {
        System.out.println("setTimeTo");
        Integer timeTo = null;
        Flight instance = new Flight();
        instance.setTimeTo(timeTo);
    }

    /**
     * Test of getTimeFrom method, of class Flight.
     */
    @Test
    public void testGetTimeFrom() {
        System.out.println("getTimeFrom");
        Flight instance = new Flight();
        Integer expResult = 1;
        instance.setTimeFrom(expResult);
        Integer result = instance.getTimeFrom();
        assertEquals(expResult, result);
    }

    /**
     * Test of setTimeFrom method, of class Flight.
     */
    @Test
    public void testSetTimeFrom() {
        System.out.println("setTimeFrom");
        Integer timeFrom = null;
        Flight instance = new Flight();
        instance.setTimeFrom(timeFrom);
    }

    /**
     * Test of getSeatsTotal method, of class Flight.
     */
    @Test
    public void testGetSeatsTotal() {
        System.out.println("getSeatsTotal");
        Flight instance = new Flight();
        Integer expResult = 1;
        instance.setSeatsTotal(expResult);
        Integer result = instance.getSeatsTotal();
        assertEquals(expResult, result);
    }

    /**
     * Test of setSeatsTotal method, of class Flight.
     */
    @Test
    public void testSetSeatsTotal() {
        System.out.println("setSeatsTotal");
        Integer seatsTotal = null;
        Flight instance = new Flight();
        instance.setSeatsTotal(seatsTotal);
    }

    /**
     * Test of getPlaneID method, of class Flight.
     */
    @Test
    public void testGetPlaneID() {
        System.out.println("getPlaneID");
        Flight instance = new Flight();
        Integer expResult = 1;
        instance.setPlaneID(expResult);
        Integer result = instance.getPlaneID();
        assertEquals(expResult, result);
    }

    /**
     * Test of setPlaneID method, of class Flight.
     */
    @Test
    public void testSetPlaneID() {
        System.out.println("setPlaneID");
        Integer planeID = null;
        Flight instance = new Flight();
        instance.setPlaneID(planeID);
    }

    /**
     * Test of getAirportFrom method, of class Flight.
     */
    @Test
    public void testGetAirportFrom() {
        System.out.println("getAirportFrom");
        Flight instance = new Flight();
        Airport expResult = new Airport();
        instance.setAirportFrom(expResult);
        Airport result = instance.getAirportFrom();
        assertEquals(expResult, result);
    }

    /**
     * Test of setAirportFrom method, of class Flight.
     */
    @Test
    public void testSetAirportFrom() {
        System.out.println("setAirportFrom");
        Airport airportFrom = null;
        Flight instance = new Flight();
        instance.setAirportFrom(airportFrom);
    }

    /**
     * Test of getAirportTo method, of class Flight.
     */
    @Test
    public void testGetAirportTo() {
        System.out.println("getAirportTo");
        Flight instance = new Flight();
        Airport expResult = new Airport();
        instance.setAirportTo(expResult);
        Airport result = instance.getAirportTo();
        assertEquals(expResult, result);
    }

    /**
     * Test of setAirportTo method, of class Flight.
     */
    @Test
    public void testSetAirportTo() {
        System.out.println("setAirportTo");
        Airport airportTo = null;
        Flight instance = new Flight();
        instance.setAirportTo(airportTo);
    }

    /**
     * Test of getFlightpassengersCollection method, of class Flight.
     */
    @Test
    public void testGetFlightpassengersCollection() {
        System.out.println("getFlightpassengersCollection");
        Flight instance = new Flight();
        Collection<Flightpassengers> expResult = new ArrayList();
        instance.setFlightpassengersCollection(expResult);
        Collection<Flightpassengers> result = instance.getFlightpassengersCollection();
        assertEquals(expResult, result);
    }

    /**
     * Test of setFlightpassengersCollection method, of class Flight.
     */
    @Test
    public void testSetFlightpassengersCollection() {
        System.out.println("setFlightpassengersCollection");
        Collection<Flightpassengers> flightpassengersCollection = new ArrayList();
        Flight instance = new Flight();
        instance.setFlightpassengersCollection(flightpassengersCollection);
    }

    /**
     * Test of hashCode method, of class Flight.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Flight instance = new Flight();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
    }

    /**
     * Test of equals method, of class Flight.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object object = null;
        Flight instance = new Flight();
        boolean expResult = false;
        boolean result = instance.equals(object);
        assertEquals(expResult, result);
    }

    
    
}
