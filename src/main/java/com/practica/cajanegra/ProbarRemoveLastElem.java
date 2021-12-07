package com.practica.cajanegra;

import com.cajanegra.EmptyCollectionException;
import com.cajanegra.SingleLinkedListImpl;

import java.util.NoSuchElementException;

public class ProbarRemoveLastElem {
    public static void main(String[] args) throws EmptyCollectionException, NoSuchElementException {
        SingleLinkedListImpl myList = new SingleLinkedListImpl("B", "A", "A", "C");
        //System.out.println("Elimino la B: ");
        //System.out.println("Elimino: " + myList.removeLast("C" +  "") + " La lista queda: " + myList.toString());
        /*SingleLinkedListImpl myList2 = new SingleLinkedListImpl();
        myList2.removeLast("B");*/
        /*System.out.println("Elimino la F: ");
        System.out.println("Elimino: " + myList.removeLast("F") + " La lista queda: " + myList.toString());*/
        /*System.out.println("Elimino la _: ");
        System.out.println("Elimino: " + myList.removeLast("_") + " La lista queda: " + myList.toString());*/
        /*System.out.println("Elimino la =: ");
        System.out.println("Elimino: " + myList.removeLast("=") + " La lista queda: " + myList.toString());*/
        /*SingleLinkedListImpl myList3 = new SingleLinkedListImpl("B", "B", "M", "M", "Y", "Y");
        myList3.removeLast("M");
        System.out.println(myList3.toString());*/
    }
}