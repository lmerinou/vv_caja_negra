package com.practica.cajanegra;
import com.cajanegra.SingleLinkedListImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;



import java.util.Iterator;


class PruebaAddLastEquivalencia {
    SingleLinkedListImpl<Object> myList;

    @BeforeEach
    void setUp() {
        myList = new SingleLinkedListImpl<>(123, "Hola");
    }

    @DisplayName("Insertar elemento valido")
    @Test
    public void elemValidoTest() {
        myList.addLast("A");
        Assertions.assertEquals(myList.getAtPos(myList.size()),"A");
    }
    @DisplayName("Insertar elemento invalido inferior")
    @Test
    public void elemInvalidoMenos() {
        myList.addLast(":");
        Assertions.assertThrows(IllegalArgumentException.class, () -> myList.addLast(":"));
    }
    @DisplayName("Insertar elemento invalido superior")
    @Test
    public void elemInvalidoMasTest() {
        myList.addLast("~");
        Assertions.assertThrows(IllegalArgumentException.class, () -> myList.addLast("~"));
    }
}


class PruebaAddLastValorLimite {
    SingleLinkedListImpl<Object> myList;
    Iterator<Object> primerElemLista;

    @BeforeEach
    void setUp() {
        myList = new SingleLinkedListImpl<>("primera", "segunda");
        primerElemLista = myList.iterator();
    }

    @DisplayName("Insertar elemento inválido")
    @Test
    public void elemInvalidoMenos() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> myList.addLast("@"));

    }
    @DisplayName("Insertar elemento inválido")
    @Test
    public void elemInvalidoMas() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> myList.addLast("["));

    }

    @DisplayName("Test parameterizados valor límite")
    @ParameterizedTest
    @CsvSource(value = {"A", "B", "L", "Y", "Z"})
    public void addLastValidTest(Object element) {
        myList.addLast(element);
        Assertions.assertEquals(myList.getAtPos(myList.size()),element);
    }



}