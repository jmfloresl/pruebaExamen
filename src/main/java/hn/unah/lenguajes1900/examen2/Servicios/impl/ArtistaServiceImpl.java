package hn.unah.lenguajes1900.examen2.Servicios.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import hn.unah.lenguajes1900.examen2.Modelos.Artista;
import hn.unah.lenguajes1900.examen2.Repositorios.ArtistaRepository;
import hn.unah.lenguajes1900.examen2.Servicios.ArtistaService;

@Service
public class ArtistaServiceImpl implements ArtistaService {

    @Autowired
    private ArtistaRepository artistaRepository;

    @Override
    public Artista CrearArtista(Artista nvoartista) {
        
        return artistaRepository.save(nvoartista);
    }

    @Override
    public void eliminarArtista(int codigoArtista) {
        Artista artistaEliminar = this.artistaRepository.findById(codigoArtista).orElse(null);
        if (artistaEliminar != null) {
            this.artistaRepository.delete(artistaEliminar);
        }
     
    }

  
}
