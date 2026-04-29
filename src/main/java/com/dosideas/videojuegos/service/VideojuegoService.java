/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dosideas.videojuegos.service;

import com.dosideas.videojuegos.domain.Videojuego;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author fer_g
 */
@Service
public class VideojuegoService {
    public List<Videojuego> buscarDestacados() {
        List<Videojuego> destacados = new ArrayList<>();
        
        Videojuego juego = new Videojuego();
        
        juego.setNombre("BioShock Infinite");
        juego.setDescripcion("La última gran entrega de la saga Bioshock, ahora en una imperdible ciudad de ensueño entre las nubes");
        juego.setImagenUrl("https://m.media-amazon.com/images/I/91aueKAy13L.jpg");
        destacados.add(juego);
        
        juego = new Videojuego();
        juego.setNombre("Insurgency: Sandstorm");
        juego.setDescripcion("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. ");
        juego.setImagenUrl("https://www.metacritic.com/a/img/catalog/provider/6/12/6-1-813832-52.jpg");
        destacados.add(juego);
        
        juego = new Videojuego();
        juego.setNombre("The Witness");
        juego.setDescripcion("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. ");
        juego.setImagenUrl("https://image.api.playstation.com/cdn/UP2124/CUSA00498_00/awvzBy4CY2NKeps2omt7SC8lxJNozWCe.png");
        destacados.add(juego);
        
        juego = new Videojuego();
        juego.setNombre("Braid");
        juego.setDescripcion("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. ");
        juego.setImagenUrl("https://static.tvtropes.org/pmwiki/pub/images/braid.png");
        destacados.add(juego);
        
        juego = new Videojuego();
        juego.setNombre("Zelda");
        juego.setDescripcion("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. ");
        juego.setImagenUrl("https://zelda.nintendo.com/assets/icons/share_icon-tw.jpg");
        destacados.add(juego);
        
        juego = new Videojuego();
        juego.setNombre("Donkey Kong");
        juego.setDescripcion("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. ");
        juego.setImagenUrl("https://m.media-amazon.com/images/I/91su-V7b9rL.jpg");
        destacados.add(juego);
        
        juego = new Videojuego();
        juego.setNombre("DOOM Eternal");
        juego.setDescripcion("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. ");
        juego.setImagenUrl("https://image.api.playstation.com/vulcan/ap/rnd/202010/0114/b4Q1XWYaTdJLUvRuALuqr0wP.png");
        destacados.add(juego);
        
        return destacados;
    }
}
