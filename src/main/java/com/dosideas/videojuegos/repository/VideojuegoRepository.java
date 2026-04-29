/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.dosideas.videojuegos.repository;

import com.dosideas.videojuegos.domain.Videojuego;
import org.springframework.data.jpa.repository.JpaRepository;



/**
 *
 * @author fer_g
 */
public interface VideojuegoRepository extends JpaRepository <Videojuego, Integer> {
    
}
