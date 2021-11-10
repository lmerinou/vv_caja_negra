package com.practica.cajanegra;

import com.cajanegra.SingleLinkedListImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Iterator;

class PruebaAddFirstEquivalencia {
    SingleLinkedListImpl<Object> myList;
    Iterator<Object> primerElemLista;

    @BeforeEach
    void setUp() {
        myList = new SingleLinkedListImpl<>("primera", "Segunda");
        primerElemLista = myList.iterator();
    }

    @DisplayName("Insertar elemento válido")
    @Test
    public void elemValido() {
        myList.addFirst("A");
        Assertions.assertEquals(primerElemLista.next(),"A");
    }

    @DisplayName("Insertar elemento invalido inferior")
    @Test
    public void elemInvalidoMenos() {
        myList.addFirst("=");
        Assertions.assertThrows(IllegalArgumentException.class, () -> myList.addFirst("="));
    }
    @DisplayName("Insertar elemento invalido superior")
    @Test
    public void elemValidoMas() {
        myList.addFirst("_");
        Assertions.assertThrows(IllegalArgumentException.class, () -> myList.addFirst("_"));
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

    @DisplayName("Insertar elemento invalido inferior")
    @Test
    public void elemInvalidoMenos() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> myList.addFirst("@"));
    }
    @DisplayName("Insertar elemento invalido superior")
    @Test
    public void elemValidoMas() {
        myList.addFirst("_");
        Assertions.assertThrows(IllegalArgumentException.class, () -> myList.addFirst("["));
    }

    @DisplayName("Test parameterizados valor límite")
    @ParameterizedTest
    @CsvSource(value = {"A", "B", "L", "Y", "Z"})
    public void elementoTest(Object element) {
        Assertions.assertEquals(primerElemLista.next(),element);
    }


}



