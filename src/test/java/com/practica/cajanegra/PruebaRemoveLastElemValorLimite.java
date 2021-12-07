package com.practica.cajanegra;

import com.cajanegra.EmptyCollectionException;
import com.cajanegra.SingleLinkedListImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PruebaRemoveLastElemValorLimite {
    SingleLinkedListImpl<Object> myList, listExpected;

    @BeforeEach
    public void setUp(){
        myList = new SingleLinkedListImpl<>("A","B", "M", "B", "Y", "M", "Y", "Z");
    }

    @DisplayName("Buscamos el elemento anterior al minimo")
    @Test
    public void removeLastAnteriorMinimo(){
        assertThrows(java.lang.IllegalArgumentException.class, () -> {
                    myList.removeLast("@");
                }
        );
    }

    @DisplayName("Buscamos el elemento minimo")
    @Test
    public void removeLastMinimo() throws EmptyCollectionException {
        assertEquals("A", myList.removeLast("A"));
        listExpected = new SingleLinkedListImpl<>("B","M","B","Y","M","Y","Z");
        assertEquals(listExpected, myList);
    }

    @DisplayName("Buscamos el elemento posterior al minimo")
    @Test
    public void removeLastPosteriorMinimo() throws EmptyCollectionException {
        assertEquals("B", myList.removeLast("B"));
        listExpected = new SingleLinkedListImpl<>("A","B","M","Y","M","Y","Z");
        assertEquals(listExpected, myList);
    }

    @DisplayName("Buscamos un elemento nominal")
    @Test
    public void removeLastNominal() throws EmptyCollectionException {

        assertEquals("M", myList.removeLast("M"));
        listExpected = new SingleLinkedListImpl<>("A","B","M","B","Y","Y","Z");
        assertEquals(listExpected, myList);
    }

    @DisplayName("Buscamos el elemento anterior al maximo")
    @Test
    public void removeLastAnteriorMaximo() throws EmptyCollectionException {
        assertEquals("Y", myList.removeLast("Y"));
        listExpected = new SingleLinkedListImpl<>("A","B","M","B","Y","M","Z");
        assertEquals(listExpected, myList);
    }

    @DisplayName("Buscamos el elemento maximo")
    @Test
    public void removeLastMaximo() throws EmptyCollectionException {
        assertEquals("Z", myList.removeLast("Z"));
        listExpected = new SingleLinkedListImpl<>("A","B","M","B","Y","M","Y");
        assertEquals(listExpected, myList);
    }

    @DisplayName("Buscamos el elemento posterior al maximo")
    @Test
    public void removeLastPosteriorMaximo(){
        assertThrows(java.lang.IllegalArgumentException.class, () -> {
                    myList.removeLast("[");
                }
        );
    }
}