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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 * Holds airports data
 */
@Entity
@Table(name = "airport")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Airport.findAll", query = "SELECT a FROM Airport a")
    , @NamedQuery(name = "Airport.findById", query = "SELECT a FROM Airport a WHERE a.id = :id")
    , @NamedQuery(name = "Airport.findByCountry", query = "SELECT a FROM Airport a WHERE a.country = :country")
    , @NamedQuery(name = "Airport.findByCity", query = "SELECT a FROM Airport a WHERE a.city = :city")
    , @NamedQuery(name = "Airport.findByAirportCode", query = "SELECT a FROM Airport a WHERE a.airportCode = :airportCode")})
public class Airport implements Serializable {
    
    /**
     * @param country Holds airport country
     * @param city Holds airport city
     * @param airportCode Holds unique code of airport
     * @param ID Holds identification number
     */
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Size(max = 50)
    @Column(name = "Country")
    private String country;
    @Size(max = 50)
    @Column(name = "City")
    private String city;
    @Size(max = 50)
    @Column(name = "AirportCode")
    private String airportCode;
    @OneToMany(mappedBy = "airportFrom")
    private Collection<Flight> flightCollection;
    @OneToMany(mappedBy = "airportTo")
    private Collection<Flight> flightCollection1;

    public Airport() {
    }

    public Airport(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAirportCode() {
        return airportCode;
    }

    public void setAirportCode(String airportCode) {
        this.airportCode = airportCode;
    }

    @XmlTransient
    public Collection<Flight> getFlightCollection() {
        return flightCollection;
    }

    public void setFlightCollection(Collection<Flight> flightCollection) {
        this.flightCollection = flightCollection;
    }

    @XmlTransient
    public Collection<Flight> getFlightCollection1() {
        return flightCollection1;
    }

    public void setFlightCollection1(Collection<Flight> flightCollection1) {
        this.flightCollection1 = flightCollection1;
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
        if (!(object instanceof Airport)) {
            return false;
        }
        Airport other = (Airport) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "lt.viko.eif.tstanislovenas.jaxrs.data.Airport[ id=" + id + " ]";
    }
    
}
