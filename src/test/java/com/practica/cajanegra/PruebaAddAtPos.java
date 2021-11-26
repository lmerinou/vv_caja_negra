package com.practica.cajanegra;

import com.cajanegra.SingleLinkedListImpl;
import junit.framework.AssertionFailedError;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.api.Assertions.*;

import java.util.Iterator;


class AddAtPosTestEquivalencia {

    SingleLinkedListImpl<Object> myList;
    Iterator<Object> elemLista;



    @BeforeEach
    void setUp() {
        myList = new SingleLinkedListImpl<>(123, "Hola");
        elemLista = myList.iterator();
    }

    @DisplayName("Insertar en posición válida")
    @Test
    public void posValidaTest() {
        myList.addAtPos("A", 2);
        Assertions.assertEquals(myList.getAtPos(2),"A");
    }

    @DisplayName("Insertar en posición ínválida")
    @Test
    public void posInvalidaTest() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> myList.addAtPos("C", -1));
    }

    @DisplayName("Insertar elemento ínválido inferior")
    @Test
    public void elemInvalidoInferiorTest() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> myList.addAtPos("?", 6));

    }

    @DisplayName("Insertar elemento ínválido inferior en pos inválida")
    @Test
    public void elemInvalidoPosInvalidaTest() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> myList.addAtPos(">", -2));

    }

    @DisplayName("Insertar elemento ínválido superior")
    @Test
    public void elemInvalidoSuperiorTest() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> myList.addAtPos("^", 3));

    }

    @DisplayName("Insertar elemento en pos inválida superior")
    @Test
    public void elemPosInvalidaTest() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> myList.addAtPos("E", 1000000));

    }

    @DisplayName("Test parameterizados clases equivalencia")
    @ParameterizedTest
    @CsvSource(value = {"C:-1", "?:6", ">:-2", "^:3", "]:-6","E:1000000","<:1000000","|:1000000"}, delimiter = ':')
    public void elementoTest(Object element, int p) {
        Assertions.assertThrows(IllegalArgumentException.class, () -> myList.addAtPos(element, p));
    }

}

class AddAtPosValorLimite {

    SingleLinkedListImpl<Object> myList;
    Iterator<Object> elemLista;

    @BeforeEach
    void setUp() {
        myList = new SingleLinkedListImpl<>(123, "Hola");
        elemLista = myList.iterator();
    }

    @DisplayName("Insertar elemento inválido inferior")
    @Test
    public void elemInvalidoMenos() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> myList.addAtPos("@", 3));

    }
    @DisplayName("Insertar elemento inválido superior")
    @Test
    public void elemInvalidoMas() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> myList.addAtPos("[", 9));

    }


    @DisplayName("Test parameterizados valor límite")
    @ParameterizedTest
    @CsvSource(value = {"A:4", "B:5", "L:6", "Y:7", "Z:8", "C:0", "D:1", "E:1000000"}, delimiter = ':')
    public void elementoTest(Object element, int p) {
        myList.addAtPos(element,p);
        if(p < myList.size()){
            Assertions.assertEquals(myList.getAtPos(p),element);
        }
        else{
            Assertions.assertEquals((myList.getAtPos(myList.size())),element);
        }

    }

}