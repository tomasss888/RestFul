/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lt.viko.eif.tstanislovenas.jaxrs.service;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import lt.viko.eif.tstanislovenas.jaxrs.data.Airport;

/**
 * REST class for Airport
 */
@Stateless
@Path("lt.viko.eif.tstanislovenas.jaxrs.data.airport")
public class AirportFacadeREST extends AbstractFacade<Airport> {

    @PersistenceContext(unitName = "WebApplication1PU")
    private EntityManager em;

    public AirportFacadeREST() {
        super(Airport.class);
    }

    /**
    * Create new row in database
    */
    @POST
    @Override
    @Consumes({MediaType.APPLICATION_XML})
    public void create(Airport entity) {
        super.create(entity);
    }

    /**
    * Update row in database
    */
    @PUT
    @Path("{id}")
    @Consumes({MediaType.APPLICATION_XML})
    public void edit(@PathParam("id") Integer id, Airport entity) {
        super.edit(entity);
    }

    /**
    * Deletes row by id
    */
    @DELETE
    @Path("{id}")
    public void remove(@PathParam("id") Integer id) {
        super.remove(super.find(id));
    }

    /**
    * Returns row by id
    */
    @GET
    @Path("{id}")
    @Produces({MediaType.APPLICATION_XML})
    public Airport find(@PathParam("id") Integer id) {
        return super.find(id);
    }

    /**
    * Prints whole table from database
    */
    @GET
    @Override
    @Produces({MediaType.APPLICATION_XML})
    public List<Airport> findAll() {
        return super.findAll();
    }

    /**
    * Prints all rows in range of id
    */
    @GET
    @Path("{from}/{to}")
    @Produces({MediaType.APPLICATION_XML})
    public List<Airport> findRange(@PathParam("from") Integer from, @PathParam("to") Integer to) {
        return super.findRange(new int[]{from, to});
    }
    
    /**
    * Prints row count
    */
    @GET
    @Path("count")
    @Produces(MediaType.TEXT_PLAIN)
    public String countREST() {
        return String.valueOf(super.count());
    }

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
    
}
