package hn.unah.lenguajes1900.examen2.Servicios;

import hn.unah.lenguajes1900.examen2.Modelos.Artista;

public interface ArtistaService {
    
    public Artista CrearArtista(Artista artista);

    public void eliminarArtista(int codigoArtista);
}
