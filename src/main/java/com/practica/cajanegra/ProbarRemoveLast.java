package com.practica.cajanegra;

import com.cajanegra.EmptyCollectionException;
import com.cajanegra.SingleLinkedListImpl;

public class ProbarRemoveLast {
    public static void main(String args[]) throws EmptyCollectionException {

        //CASOS DE PRUEBA INICIALES

        //PRIMER CASO DE PRUEBA
        SingleLinkedListImpl<Object> miListaLlena1 = new SingleLinkedListImpl<>("A", "BB", "L");
        miListaLlena1.removeLast();
        System.out.println("Contenido 1: " + miListaLlena1);

        //SEGUNDO CASO DE PRUEBA
        SingleLinkedListImpl<Object> miListaLlena2 = new SingleLinkedListImpl<>("A", "BB", "[");
        miListaLlena2.removeLast();
        System.out.println("Contenido 2: " + miListaLlena2);

        //TERCER CASO DE PRUEBA
        SingleLinkedListImpl<Object> miListaLlena3 = new SingleLinkedListImpl<>("A", "BB", "?");
        miListaLlena3.removeLast();
        System.out.println("Contenido 3: " + miListaLlena3);

        //CUARTO CASO DE PRUEBA
        SingleLinkedListImpl<Object> miListaVacia = new SingleLinkedListImpl<>();
        miListaVacia.removeLast();
        System.out.println("Contenido 4: " + miListaVacia);
    }
}
