/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lt.viko.eif.tstanislovenas.jaxrs.data;

import java.io.Serializable;
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
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Connects passengers and flights in database
 */
@Entity
@Table(name = "flightpassengers")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Flightpassengers.findAll", query = "SELECT f FROM Flightpassengers f")
    , @NamedQuery(name = "Flightpassengers.findById", query = "SELECT f FROM Flightpassengers f WHERE f.id = :id")})
public class Flightpassengers implements Serializable {

    /**
     * @param passengerID Holds passenger id
     * @param flightID Holds flight id
     * @param ID Holds identification number
     */
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @JoinColumn(name = "FlightID", referencedColumnName = "ID")
    @ManyToOne
    private Flight flightID;
    @JoinColumn(name = "PassengerID", referencedColumnName = "ID")
    @ManyToOne
    private Passenger passengerID;

    public Flightpassengers() {
    }

    public Flightpassengers(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Flight getFlightID() {
        return flightID;
    }

    public void setFlightID(Flight flightID) {
        this.flightID = flightID;
    }

    public Passenger getPassengerID() {
        return passengerID;
    }

    public void setPassengerID(Passenger passengerID) {
        this.passengerID = passengerID;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Flightpassengers)) {
            return false;
        }
        Flightpassengers other = (Flightpassengers) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "lt.viko.eif.tstanislovenas.jaxrs.data.Flightpassengers[ id=" + id + " ]";
    }
    
}
