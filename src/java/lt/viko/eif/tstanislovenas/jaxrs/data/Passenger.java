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
 * Holds information about passengers
 */
@Entity
@Table(name = "passenger")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Passenger.findAll", query = "SELECT p FROM Passenger p")
    , @NamedQuery(name = "Passenger.findById", query = "SELECT p FROM Passenger p WHERE p.id = :id")
    , @NamedQuery(name = "Passenger.findByName", query = "SELECT p FROM Passenger p WHERE p.name = :name")
    , @NamedQuery(name = "Passenger.findBySurname", query = "SELECT p FROM Passenger p WHERE p.surname = :surname")
    , @NamedQuery(name = "Passenger.findByAge", query = "SELECT p FROM Passenger p WHERE p.age = :age")})
public class Passenger implements Serializable {

    /**
     * @param name A name of the passenger
     * @param surname A surname of a passenger
     * @param age An age of the passenger
     * @param ID Holds identification number
     */
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Size(max = 50)
    @Column(name = "Name")
    private String name;
    @Size(max = 50)
    @Column(name = "Surname")
    private String surname;
    @Column(name = "Age")
    private Integer age;
    @OneToMany(mappedBy = "passengerID")
    private Collection<Flightpassengers> flightpassengersCollection;

    public Passenger() {
    }

    public Passenger(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
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
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Passenger)) {
            return false;
        }
        Passenger other = (Passenger) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "lt.viko.eif.tstanislovenas.jaxrs.data.Passenger[ id=" + id + " ]";
    }
    
}
