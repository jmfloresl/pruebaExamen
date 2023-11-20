package hn.unah.lenguajes1900.examen2.Repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import hn.unah.lenguajes1900.examen2.Modelos.InformacionContacto;

public interface InformacionContactoRepository extends JpaRepository <InformacionContacto, Integer>{
    
}
