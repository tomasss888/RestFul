/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lt.viko.eif.tstanislovenas.jaxrs.data;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 * A main class all database connects to this class
 */
@Entity
@Table(name = "flight")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Flight.findAll", query = "SELECT f FROM Flight f")
    , @NamedQuery(name = "Flight.findById", query = "SELECT f FROM Flight f WHERE f.id = :id")
    , @NamedQuery(name = "Flight.findBySeatsTaken", query = "SELECT f FROM Flight f WHERE f.seatsTaken = :seatsTaken")
    , @NamedQuery(name = "Flight.findByTimeTo", query = "SELECT f FROM Flight f WHERE f.timeTo = :timeTo")
    , @NamedQuery(name = "Flight.findByTimeFrom", query = "SELECT f FROM Flight f WHERE f.timeFrom = :timeFrom")
    , @NamedQuery(name = "Flight.findBySeatsTotal", query = "SELECT f FROM Flight f WHERE f.seatsTotal = :seatsTotal")
    , @NamedQuery(name = "Flight.findByPlaneID", query = "SELECT f FROM Flight f WHERE f.planeID = :planeID")})
public class Flight implements Serializable {

    /**
     * @param airportTo Holds information about airport which it's going to
     * @param airportFrom Holds information about airport which we going from
     * @param timeTo Time at which plane will arrive
     * @param timeFrom Time at which plane will leave
     * @param seatsTaken Plane taken by passengers
     * @param seatsTotal Total amount of seats
     * @param planeID Unique code of plane
     * @param ID Holds identification number
     */
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "SeatsTaken")
    private Integer seatsTaken;
    @Column(name = "TimeTo")
    private Integer timeTo;
    @Column(name = "TimeFrom")
    private Integer timeFrom;
    @Column(name = "SeatsTotal")
    private Integer seatsTotal;
    @Column(name = "PlaneID")
    private Integer planeID;
    @JoinColumn(name = "AirportFrom", referencedColumnName = "ID")
    @ManyToOne
    private Airport airportFrom;
    @JoinColumn(name = "AirportTo", referencedColumnName = "ID")
    @ManyToOne
    private Airport airportTo;
    @OneToMany(mappedBy = "flightID")
    private Collection<Flightpassengers> flightpassengersCollection;

    public Flight() {
    }

    public Flight(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSeatsTaken() {
        return seatsTaken;
    }

    public void setSeatsTaken(Integer seatsTaken) {
        this.seatsTaken = seatsTaken;
    }

    public Integer getTimeTo() {
        return timeTo;
    }

    public void setTimeTo(Integer timeTo) {
        this.timeTo = timeTo;
    }

    public Integer getTimeFrom() {
        return timeFrom;
    }

    public void setTimeFrom(Integer timeFrom) {
        this.timeFrom = timeFrom;
    }

    public Integer getSeatsTotal() {
        return seatsTotal;
    }

    public void setSeatsTotal(Integer seatsTotal) {
        this.seatsTotal = seatsTotal;
    }

    public Integer getPlaneID() {
        return planeID;
    }

    public void setPlaneID(Integer planeID) {
        this.planeID = planeID;
    }

    public Airport getAirportFrom() {
        return airportFrom;
    }

    public void setAirportFrom(Airport airportFrom) {
        this.airportFrom = airportFrom;
    }

    public Airport getAirportTo() {
        return airportTo;
    }

    public void setAirportTo(Airport airportTo) {
        this.airportTo = airportTo;
    }

    @XmlTransient
    public Collection<Flightpassengers> getFlightpassengersCollection() {
        return flightpassengersCollection;
    }

    public void setFlightpassengersCollection(Collection<Flightpassengers> flightpassengersCollection) {
        this.flightpassengersCollection = flightpassengersCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Flight)) {
            return false;
        }
        Flight other = (Flight) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "lt.viko.eif.tstanislovenas.jaxrs.data.Flight[ id=" + id + " ]";
    }
    
}
