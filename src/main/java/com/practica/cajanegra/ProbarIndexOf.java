package com.practica.cajanegra;

import com.cajanegra.SingleLinkedListImpl;

public class ProbarIndexOf {
    public static void main(String[] args){
        SingleLinkedListImpl<Object> myList = new SingleLinkedListImpl<>("A", "B", "C", "B","=", "_");
        SingleLinkedListImpl<Object> myList2 = new SingleLinkedListImpl<>();
        SingleLinkedListImpl<Object> myList3 = new SingleLinkedListImpl<>("A","B","C");
        System.out.println("Lista inicial: " + myList);
        System.out.println("Busco un elemento que se encuentra en la lista: " + myList.indexOf("B"));
        System.out.println("Busco un elemento que no se encuentra en la lista: " + myList.indexOf("D"));
        System.out.println("Busco un elemento en una lista vacia: " + myList2.indexOf("D"));
        System.out.println("Busco un elemento < 'A': " + myList.indexOf("="));
        System.out.println("Busco un elemento > 'Z': " + myList.indexOf("_"));
        System.out.println("Busco un elemento en la primera posicion: " + myList3.indexOf("A"));
        System.out.println("Busco un elemento en la segunda posicion: " + myList3.indexOf("B"));
        System.out.println("Busco un elemento en la ultima posicion: " + myList3.indexOf("C"));
    }
}