package hn.unah.lenguajes1900.examen2.Modelos;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table (name="canciones")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Canciones {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int codigoCancion;

    private String titulo;

    private String album;

    private int anyoLanzamiento;

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name="codigoArtista", referencedColumnName = "codigoArtista")
    private Artista artista;
    
}
