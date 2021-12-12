package com.practica.cajanegra;

import com.cajanegra.EmptyCollectionException;
import com.cajanegra.SingleLinkedListImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.SortedMap;

import static org.junit.jupiter.api.Assertions.*;

class PruebaRemoveLastElemEquivalencia {
    SingleLinkedListImpl<Object> myList, listExpected;

    @DisplayName("Borrar elemento ASCII entre 'A'...'Z' que se encuentre en la lista")
    @Test
    public void removeLastLista() throws EmptyCollectionException {
        myList = new SingleLinkedListImpl<>("A", "B", "C", "B");
        assertEquals("B", myList.removeLast("B"));
        listExpected = new SingleLinkedListImpl<>("A", "B", "C");
        assertEquals(listExpected, myList);
    }

    @DisplayName("Borrar elemento ASCII entre 'A'...'Z' de una lista vacia")
    @Test
    public void removeLastListaVacia(){
        myList = new SingleLinkedListImpl<>();
        assertThrows(com.cajanegra.EmptyCollectionException.class, () -> {
                    myList.removeLast("B");
                }
        );
    }

    @DisplayName("Borrar elemento ASCII entre 'A'...'Z' que no se encuentre en la lista")
    @Test
    public void removeLastNoLista(){
        myList = new SingleLinkedListImpl<>("A","B","C", "B");
        assertThrows(java.util.NoSuchElementException.class, () -> {
                    myList.removeLast("F");
                }
        );
    }

    @DisplayName("Borrar elemento ASCII < 'A'")
    @Test
    public void removeLastMenorA(){
        myList = new SingleLinkedListImpl<>("A","B","C", "B");
        assertThrows(java.lang.IllegalArgumentException.class, () -> {
                    myList.removeLast("=");
                }
        );
    }

    @DisplayName("Borrar elemento ASCII > 'Z'")
    @Test
    public void removeLastMayorZ(){
        myList = new SingleLinkedListImpl<>("A","B","C", "B");
        assertThrows(java.lang.IllegalArgumentException.class, () -> {
                    myList.removeLast("_");
                }
        );
    }
}