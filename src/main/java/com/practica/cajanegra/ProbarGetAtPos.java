package com.practica.cajanegra;

import com.cajanegra.SingleLinkedListImpl;

public class ProbarGetAtPos {
    public static void main(String[] args){
        SingleLinkedListImpl<Object> miLista = new SingleLinkedListImpl<>(new SingleLinkedListImpl<>(3,4),"Hola",999,'R','#',55,"Adios");
        System.out.println("Contenido lista: " + miLista);

        //PRIMER CASO DE PRUEBA
        System.out.println("El primer elemento de la lista es: " + miLista.getAtPos(1));

        //SEGUNDO CASO DE PRUEBA
        System.out.println("El tercer elemento de la lista es: " + miLista.getAtPos(3));

        //TERCER CASO DE PRUEBA
        System.out.println("El quinto elemento de la lista es: " + miLista.getAtPos(5));

        //CUARTO CASO DE PRUEBA
        System.out.println("El último elemento de la lista es: " + miLista.getAtPos(7));
    }

}
