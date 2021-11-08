package com.practica.cajanegra;

import com.cajanegra.SingleLinkedListImpl;

/** LA FUNCION ADDFIRST **NO FUNCIONA** CORRECTAMENTE */
public class ProbarAddFirst {
    public static void main(String[] args) {
        SingleLinkedListImpl<Object> miLista2 = new SingleLinkedListImpl<>(new SingleLinkedListImpl<>(3,4),"Hola soy Juan",999,55);
        System.out.println("Contenido inicial: " + miLista2);
        System.out.println();

        int nuevoEntero = 12345;
        miLista2.addFirst(nuevoEntero);
        System.out.println("añadir entero al principio: " + miLista2);

        System.out.println();

        String nuevoString = "Juanito";
        miLista2.addFirst(nuevoString);
        System.out.println("añadir string al principio: " + miLista2);

        System.out.println();

        SingleLinkedListImpl<String> nuevaLista = new SingleLinkedListImpl<>("Pepe", "Juan","Jaime");
        miLista2.addFirst(nuevaLista);
        System.out.println("añadir objeto al principio: " + miLista2);
        System.out.println();
        System.out.println();


    }

}
