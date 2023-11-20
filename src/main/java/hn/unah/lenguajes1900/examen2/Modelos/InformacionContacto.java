package hn.unah.lenguajes1900.examen2.Modelos;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="informacioncontacto")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class InformacionContacto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int codigoContacto;

    private String pais;

    private String ciudad;

    private String telefono;

    private String correo; 

    @OneToOne 
    @JoinColumn(name="codigoContacto", referencedColumnName = "codigoContacto")
    private Artista artista;

}
