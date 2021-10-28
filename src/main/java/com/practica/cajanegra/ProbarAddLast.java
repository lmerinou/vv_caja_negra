package com.practica.cajanegra;

import com.cajanegra.SingleLinkedListImpl;

public class ProbarAddLast {
    public static void main(String[] args) {
        SingleLinkedListImpl<Object> miLista3 = new SingleLinkedListImpl<>(new SingleLinkedListImpl<>(3,4),"Hola soy Juan",999,55);
        System.out.println("Contenido inicial: " + miLista3);
        System.out.println();

        int nuevoEntero = 12345;
        miLista3.addLast(nuevoEntero);
        System.out.println("añadir entero al final: " + miLista3);

        System.out.println();

        String nuevoString = "Juanito";
        miLista3.addLast(nuevoString);
        System.out.println("añadir string al final: " + miLista3);

        System.out.println();

        SingleLinkedListImpl<String> nuevaLista = new SingleLinkedListImpl<>("Pepe", "Juan","Jaime");
        miLista3.addLast(nuevaLista);
        System.out.println("añadir objeto al final: " + miLista3);
        System.out.println();
        System.out.println();


    }
}
