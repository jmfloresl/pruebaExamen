package hn.unah.lenguajes1900.examen2.Controladores;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.lenguajes1900.examen2.Modelos.Artista;
import hn.unah.lenguajes1900.examen2.Modelos.InformacionContacto;
import hn.unah.lenguajes1900.examen2.Servicios.impl.ArtistaServiceImpl;


@RestController
@RequestMapping("api/artistas")
public class ArtistaController {
    
    @Autowired
    private ArtistaServiceImpl artistaServiceImpl;

    @PostMapping("/crear")
    public Artista crearArtista(@RequestBody Artista nvoartista){
        InformacionContacto informacionContacto = nvoartista.getInformacionContacto();
        if(informacionContacto != null){
            informacionContacto.setArtista(nvoartista);
        }
       return this.artistaServiceImpl.CrearArtista(nvoartista);
    }

    @DeleteMapping("/eliminar")
    public void eliminarArtista(@RequestParam(name="codigoArtista")int codigoArtista){ //cuando es Request param no es necesario delcarar valores en la url
       this.artistaServiceImpl.eliminarArtista(codigoArtista);
    }


}
