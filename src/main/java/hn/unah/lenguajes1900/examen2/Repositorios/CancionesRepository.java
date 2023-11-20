package hn.unah.lenguajes1900.examen2.Repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import hn.unah.lenguajes1900.examen2.Modelos.Canciones;

public interface CancionesRepository extends JpaRepository<Canciones,Integer>  {
    
}
