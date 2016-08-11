package com.company;

public class Main {
    public static void main(String[] args) {
        Pokemon charmander = new Pokemon("Charmander", 1, 37, 5);
        Pokemon abra = new Pokemon("Abra", 2, 45, 7);

        System.out.println("La vida del pokémon "+ abra.nombre + " es " + abra.vida + "!");
        System.out.println(charmander.nombre + " usa lanzallamas!");
        charmander.atacar(abra);
        System.out.println(abra.nombre + " ha recibido un ataque de " + charmander.nombre + "!");
        System.out.println("Ahora la vida del pokémon "+ abra.nombre + " es " + abra.vida + "!");
        System.out.println("La vida del pokémon "+ charmander.nombre + " es " + charmander.vida + "!");
        System.out.println(abra.nombre + " usa confusión!");
        System.out.println(abra.nombre + " ha fallado el ataque!");
        System.out.println("La vida del pokémon "+ charmander.nombre + " sigue en " + charmander.vida + "!");
    }
}
