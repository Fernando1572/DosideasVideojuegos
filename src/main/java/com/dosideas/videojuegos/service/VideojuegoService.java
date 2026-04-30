/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dosideas.videojuegos.service;

import com.dosideas.videojuegos.domain.Videojuego;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import com.dosideas.videojuegos.repository.VideojuegoRepository;

/**
 *
 * @author fer_g
 */
@Service
public class VideojuegoService {

    private final VideojuegoRepository videojuegoRepository;

    public VideojuegoService(VideojuegoRepository videojuegoRepository) {
        this.videojuegoRepository = videojuegoRepository;
    }

    public List<Videojuego> buscarDestacados() {
        return videojuegoRepository.buscarTodos();
    }
}
