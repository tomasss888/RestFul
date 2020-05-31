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
public class PassengerTest {
    
    public PassengerTest() {
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
     * Test of getId method, of class Passenger.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Passenger instance = new Passenger();
        Integer expResult = 1;
        instance.setId(expResult);
        Integer result = instance.getId();
        assertEquals(expResult, result);
    }

    /**
     * Test of setId method, of class Passenger.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        Integer id = null;
        Passenger instance = new Passenger();
        instance.setId(id);
    }

    /**
     * Test of getName method, of class Passenger.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Passenger instance = new Passenger();
        String expResult = "test";
        instance.setName(expResult);
        String result = instance.getName();
        assertEquals(expResult, result);
    }

    /**
     * Test of setName method, of class Passenger.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "test";
        Passenger instance = new Passenger();
        instance.setName(name);
    }

    /**
     * Test of getSurname method, of class Passenger.
     */
    @Test
    public void testGetSurname() {
        System.out.println("getSurname");
        Passenger instance = new Passenger();
        String expResult = "test";
        instance.setSurname(expResult);
        String result = instance.getSurname();
        assertEquals(expResult, result);
    }

    /**
     * Test of setSurname method, of class Passenger.
     */
    @Test
    public void testSetSurname() {
        System.out.println("setSurname");
        String surname = "test";
        Passenger instance = new Passenger();
        instance.setSurname(surname);
    }

    /**
     * Test of getAge method, of class Passenger.
     */
    @Test
    public void testGetAge() {
        System.out.println("getAge");
        Passenger instance = new Passenger();
        Integer expResult = 1;
        instance.setAge(expResult);
        Integer result = instance.getAge();
        assertEquals(expResult, result);
    }

    /**
     * Test of setAge method, of class Passenger.
     */
    @Test
    public void testSetAge() {
        System.out.println("setAge");
        Integer age = null;
        Passenger instance = new Passenger();
        instance.setAge(age);
    }

    /**
     * Test of getFlightpassengersCollection method, of class Passenger.
     */
    @Test
    public void testGetFlightpassengersCollection() {
        System.out.println("getFlightpassengersCollection");
        Passenger instance = new Passenger();
        Collection<Flightpassengers> expResult = new ArrayList();
        instance.setFlightpassengersCollection(expResult);
        Collection<Flightpassengers> result = instance.getFlightpassengersCollection();
        assertEquals(expResult, result);
    }

    /**
     * Test of setFlightpassengersCollection method, of class Passenger.
     */
    @Test
    public void testSetFlightpassengersCollection() {
        System.out.println("setFlightpassengersCollection");
        Collection<Flightpassengers> flightpassengersCollection = null;
        Passenger instance = new Passenger();
        instance.setFlightpassengersCollection(flightpassengersCollection);
    }

    /**
     * Test of hashCode method, of class Passenger.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Passenger instance = new Passenger();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
    }

    /**
     * Test of equals method, of class Passenger.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object object = null;
        Passenger instance = new Passenger();
        boolean expResult = false;
        boolean result = instance.equals(object);
        assertEquals(expResult, result);
    }

    
}
