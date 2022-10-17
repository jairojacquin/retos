package com.ciclo3.reto.appg24.entidad;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="score")
public class Score implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idScore;
    private Integer calificacion;
    private String mensaje;

    @OneToMany(cascade = {CascadeType.PERSIST},mappedBy = "score")
    @JsonIgnoreProperties("score")
    private List<Reservation> reservations;

}

