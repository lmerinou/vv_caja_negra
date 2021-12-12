package com.practica.cajanegra;

import com.cajanegra.SingleLinkedListImpl;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PruebaIndexOfEquivalencia {
    SingleLinkedListImpl<Object> myList;

    @DisplayName("Buscar un elemento ASCII entre 'A'...'Z' que se encuentra en la lista")
    @Test
    public void indexOfLista(){
        myList = new SingleLinkedListImpl<>("A", "B", "C", "B");
        assertEquals(2, myList.indexOf("B"));
    }

    @DisplayName("Buscar elemento ASCII entre 'A'...'Z' que no se encuentra en la lista")
    @Test
    public void indexOfNoLista(){
        myList = new SingleLinkedListImpl<>("A", "B", "C", "B");
        assertThrows(java.util.NoSuchElementException.class, () -> {
                    myList.indexOf("D");
                }
        );
    }

    @DisplayName("Buscar un elemento ASCII entre 'A'...'Z' en una lista vacia")
    @Test
    public void indexOfListaVacia(){
        myList = new SingleLinkedListImpl<>();
        assertThrows(java.util.NoSuchElementException.class, () -> {
                    myList.indexOf("F");
                }
        );
    }

    @DisplayName("Buscar un elemento ASCII < 'A'")
    @Test
    public void indexOfMenorA(){
        myList = new SingleLinkedListImpl<>("A", "B", "C", "B");
        assertThrows(java.lang.IllegalArgumentException.class, () ->{
                    myList.indexOf("=");
                }
        );
    }

    @DisplayName("Buscar un elemento ASCII > 'Z'")
    @Test
    public void indexOfMayorZ(){
        myList = new SingleLinkedListImpl<>("A", "B", "C", "B");
        assertThrows(java.lang.IllegalArgumentException.class, () ->{
                    myList.indexOf("_");
                }
        );
    }
}