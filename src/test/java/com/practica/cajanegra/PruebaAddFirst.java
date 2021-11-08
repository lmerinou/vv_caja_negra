package com.practica.cajanegra;

import com.cajanegra.SingleLinkedListImpl;
import org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Iterator;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PruebaAddFirstEquivalencia {
    SingleLinkedListImpl<Object> myList;
    Iterator<Object> primerElemLista;

    @BeforeEach
    void setUp() {
        myList = new SingleLinkedListImpl<>("primera", "Segunda");
        primerElemLista = myList.iterator();
    }

    @DisplayName("Test parameterizados clases equivalencia")
    @ParameterizedTest
    @CsvSource(value = {"A", "=", "_"})
    public void elementoTest(Object element) {
        myList.addFirst(element);
        assertEquals(primerElemLista.next(), element);
    }
}

class PruebaAddFirstValorLimite {
    SingleLinkedListImpl<Object> myList;
    Iterator<Object> primerElemLista;


    @BeforeEach
    void setUp() {
        myList = new SingleLinkedListImpl<>("primera", "segunda");
        primerElemLista = myList.iterator();

    }



}



