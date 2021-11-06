package com.practica.cajanegra;

import com.cajanegra.SingleLinkedListImpl;

public class ProbarAddNTimes {
    public static void main(String args[]){
        SingleLinkedListImpl<Object> miLista = new SingleLinkedListImpl<>();
        System.out.println("Contenido inicial: " + miLista);
        miLista.addNTimes(1, 10);
        System.out.println("Contenido 1: " + miLista);
        miLista.addNTimes("dsfgdfg", 1);
        System.out.println("Contenido 2: " + miLista);
    }
}
