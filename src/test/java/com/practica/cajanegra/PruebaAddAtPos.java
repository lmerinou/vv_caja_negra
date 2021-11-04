package com.practica.cajanegra;

import com.cajanegra.SingleLinkedListImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

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
}

class AddAtPosValorLimite{
    SingleLinkedListImpl<Object> myList;

    @BeforeEach
    void setUp() {
        myList = new SingleLinkedListImpl<>();
    }
   /*** PROBAR PARAMETERIZEDTESTS PARA QUE QUEDE MÁS LIMPIO */

    @DisplayName("Valores límite de elemento")
    @Test
    public void elementoTest() {
        myList.addAtPos("A", 5);
    }

}