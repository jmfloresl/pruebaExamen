package hn.unah.lenguajes1900.examen2.Modelos;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(name="artista")
public class Artista {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int codigoArtista;
    
    @Column(name="nombreArtistico")
    private String nombreArtistico;

    private String nombre;

    private String apellido;

    @Column(name="fechaNacimiento")
    private Date fechaNacimiento; 
   
   @JsonIgnore
   @OneToOne (mappedBy = "artista", cascade = CascadeType.ALL)
   private InformacionContacto informacionContacto;
    

   @OneToMany (mappedBy = "artista", cascade = CascadeType.ALL)
   private List<Canciones> canciones;
}
