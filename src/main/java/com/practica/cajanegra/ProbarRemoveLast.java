package com.practica.cajanegra;

import com.cajanegra.EmptyCollectionException;
import com.cajanegra.SingleLinkedListImpl;

public class ProbarRemoveLast {
    public static void main(String args[]) throws EmptyCollectionException {

        //CASOS DE PRUEBA INICIALES

        //PRIMER CASO DE PRUEBA
        SingleLinkedListImpl<Object> miListaLlena1 = new SingleLinkedListImpl<>();
        miListaLlena1.addNTimes("A", 122000);
        System.out.println("Contenido 2: " + miListaLlena1.size());
        miListaLlena1.removeLast();
        System.out.println("Contenido 1: " + miListaLlena1.size());
/*
        //SEGUNDO CASO DE PRUEBA
        SingleLinkedListImpl<Object> miListaLlena2 = new SingleLinkedListImpl<>();
        miListaLlena2.addNTimes("A", 1000000);
        System.out.println("Contenido 2: " + miListaLlena2.size());
        //miListaLlena2.removeLast();
        //System.out.println("Contenido 2: " + miListaLlena2.size());

        //TERCER CASO DE PRUEBA
        SingleLinkedListImpl<Object> miListaVacia = new SingleLinkedListImpl<>();
        System.out.println("Contenido 4: " + miListaVacia.size());
        miListaVacia.removeLast();
        System.out.println("Contenido 4: " + miListaVacia.size());
        */

    }
}
