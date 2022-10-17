package com.ciclo3.reto.appg24.entidad;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "reservation")
public class Reservation implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idReservation;
    private Date startDate;
    private Date devolutionDate;
    private String status = "created";


    @ManyToOne
    @JoinColumn(name= "idCar")
    @JsonIgnoreProperties("reservations")
    private Car car;

    @ManyToOne
    @JoinColumn(name= "idClient")
    @JsonIgnoreProperties({"reservations","messages"})
    private Client client;

    @ManyToOne
    @JoinColumn(name= "idScore")
    @JsonIgnoreProperties("reservations")
    private Score score;
}


/**
 * public class Reservation {
 *     @Id
 *     @GeneratedValue(strategy = GenerationType.IDENTITY)
 *     private long idReservation;
 *     private Date startDate;
 *     private Date devolutionDate;
 *     private String status= "created";
 *
 *     @ManyToOne
 *     @JoinColumn(name= "car")
 *     @JsonIgnoreProperties({"car","reservations"})
 *     private Car car;
 *
 *     @ManyToOne
 *     @JoinColumn(name= "reservations")
 *     @JsonIgnoreProperties({"reservations","messages"})
 *     private Client client;
 *
 *     @ManyToOne
 *     @JoinColumn(name= "score")
 *     @JsonIgnoreProperties("reservations")
 *     private Gama score;
 *
 * }
 *
 *
public class Reservation implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idReservation;
    private String cliente;
    private Date fechainicio;
    private Date fechafin;

    @ManyToOne
    @JoinColumn(name = "idGama")
    @JsonIgnoreProperties("reservation")
    private Gama gama;

    public Integer getIdReservation() {
        return idReservation;
    }

    public void setIdReservation(int idReservation) {
        this.idReservation = idReservation;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public Date getFechainicio() {
        return fechainicio;
    }

    public void setFechainicio(Date fechainicio) {
        this.fechainicio = fechainicio;
    }

    public Date getFechafin() {
        return fechafin;
    }

    public void setFechafin(Date fechafin) {
        this.fechafin = fechafin;
    }

    public Gama getGama() {
        return gama;
    }

    public void setGama(Gama gama) {
        this.gama = gama;
    }
}
*/