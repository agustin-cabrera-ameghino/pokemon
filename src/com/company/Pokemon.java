package com.company;

/**
 * Created by alumno on 11/08/16.
 */
public class Pokemon {
    String nombre;
    int numero;
    int vida;
    int daño;

    public Pokemon(String nombre, int numero, int vida, int daño) {
        this.nombre = nombre;
        this.numero = numero;
        this.vida = vida;
        this.daño = daño;
    }

    public void atacar(Pokemon poke) {
        poke.vida = poke.vida - this.daño;
    }
}