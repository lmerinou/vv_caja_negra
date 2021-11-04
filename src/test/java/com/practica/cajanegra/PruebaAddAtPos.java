package com.practica.cajanegra;

import com.cajanegra.SingleLinkedListImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class AddAtPosTestEquivalencia {

    SingleLinkedListImpl<Object> myList;

    @BeforeEach
    void setUp() {
        myList = new SingleLinkedListImpl<>();
    }

    @DisplayName("Insertar en posición válida")
    @Test
    public void posValidaTest() {
        myList.addAtPos("A", 5);
    }

    @DisplayName("Insertar en posición ínválida")
    @Test
    public void posInvalidaTest() {
        myList.addAtPos("C", -1);
    }

    @DisplayName("Insertar elemento ínválido inferior")
    @Test
    public void elemInvalidoInferiorTest() {
         myList.addAtPos("?", 6);
    }

    @DisplayName("Insertar elemento ínválido inferior en pos inválida")
    @Test
    public void elemInvalidoPosInvalidaTest() {
        myList.addAtPos(">", -2);
    }

    @DisplayName("Insertar elemento ínválido superior")
    @Test
    public void elemInvalidoSuperiorTest() {
        myList.addAtPos("^", 3);
    }

    @DisplayName("Insertar elemento ínválido superior en pos inválida")
    @Test
    public void elemInvalidoSuperiorPosInvalidaTest() {
        myList.addAtPos("]", -6);
    }

    @DisplayName("Test parameterizados clases equivalencia")
    @ParameterizedTest
    @CsvSource(value = {"A:5","C:-1","?:6", ">:-2","^:3","]:-6"}, delimiter = ':')
    public void elementoTest(Object element, int p) {
        myList.addAtPos(element, p);
    }

}

class AddAtPosValorLimite{

    SingleLinkedListImpl<Object> myList;

    @BeforeEach
    void setUp() {
        myList = new SingleLinkedListImpl<>();
    }

    @DisplayName("Test parameterizados valor límite")
    @ParameterizedTest
    @CsvSource(value = {"@:3","A:4","B:5", "L:6","Y:7","Z:8","[:9","C:0","D:1","E:2"}, delimiter = ':')
    public void elementoTest(Object element, int p) {
        myList.addAtPos(element, p);
    }


}