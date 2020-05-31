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
public class AirportTest {
    
    public AirportTest() {
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
     * Test of getId method, of class Airport.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Airport instance = new Airport();
        Integer expResult = 1;
        instance.setId(expResult);
        Integer result = instance.getId();
        assertEquals(expResult, result);
    }

    /**
     * Test of setId method, of class Airport.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        Integer id = null;
        Airport instance = new Airport();
        instance.setId(id);
    }

    /**
     * Test of getCountry method, of class Airport.
     */
    @Test
    public void testGetCountry() {
        System.out.println("getCountry");
        Airport instance = new Airport();
        String expResult = "test";
        instance.setCountry(expResult);
        String result = instance.getCountry();
        assertEquals(expResult, result);
    }

    /**
     * Test of setCountry method, of class Airport.
     */
    @Test
    public void testSetCountry() {
        System.out.println("setCountry");
        String country = "";
        Airport instance = new Airport();
        instance.setCountry(country);
    }

    /**
     * Test of getCity method, of class Airport.
     */
    @Test
    public void testGetCity() {
        System.out.println("getCity");
        Airport instance = new Airport();
        String expResult = "test";
        instance.setCity(expResult);
        String result = instance.getCity();
        assertEquals(expResult, result);
    }

    /**
     * Test of setCity method, of class Airport.
     */
    @Test
    public void testSetCity() {
        System.out.println("setCity");
        String city = "";
        Airport instance = new Airport();
        instance.setCity(city);
    }

    /**
     * Test of getAirportCode method, of class Airport.
     */
    @Test
    public void testGetAirportCode() {
        System.out.println("getAirportCode");
        Airport instance = new Airport();
        String expResult = "test";
        instance.setAirportCode(expResult);
        String result = instance.getAirportCode();
        assertEquals(expResult, result);
    }

    /**
     * Test of setAirportCode method, of class Airport.
     */
    @Test
    public void testSetAirportCode() {
        System.out.println("setAirportCode");
        String airportCode = "";
        Airport instance = new Airport();
        instance.setAirportCode(airportCode);
    }

    /**
     * Test of getFlightCollection method, of class Airport.
     */
    @Test
    public void testGetFlightCollection() {
        System.out.println("getFlightCollection");
        Airport instance = new Airport();
        Collection<Flight> expResult = new ArrayList();
        instance.setFlightCollection(expResult);
        Collection<Flight> result = instance.getFlightCollection();
        assertEquals(expResult, result);
    }

    /**
     * Test of setFlightCollection method, of class Airport.
     */
    @Test
    public void testSetFlightCollection() {
        System.out.println("setFlightCollection");
        Collection<Flight> flightCollection = null;
        Airport instance = new Airport();
        instance.setFlightCollection(flightCollection);
    }

    /**
     * Test of getFlightCollection1 method, of class Airport.
     */
    @Test
    public void testGetFlightCollection1() {
        System.out.println("getFlightCollection1");
        Airport instance = new Airport();
        Collection<Flight> expResult = new ArrayList();
        instance.setFlightCollection1(expResult);
        Collection<Flight> result = instance.getFlightCollection1();
        assertEquals(expResult, result);
    }

    /**
     * Test of setFlightCollection1 method, of class Airport.
     */
    @Test
    public void testSetFlightCollection1() {
        System.out.println("setFlightCollection1");
        Collection<Flight> flightCollection1 = null;
        Airport instance = new Airport();
        instance.setFlightCollection1(flightCollection1);
    }

    /**
     * Test of hashCode method, of class Airport.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Airport instance = new Airport();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
    }

    /**
     * Test of equals method, of class Airport.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object object = null;
        Airport instance = new Airport();
        boolean expResult = false;
        boolean result = instance.equals(object);
        assertEquals(expResult, result);
    }

}
