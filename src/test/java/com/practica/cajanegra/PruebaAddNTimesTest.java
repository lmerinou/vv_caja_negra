package com.practica.cajanegra;

import com.cajanegra.SingleLinkedListImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Iterator;

import static org.junit.jupiter.api.Assertions.*;

class PruebaAddNTimesTest {

    SingleLinkedListImpl<Object> myList;
    String validElement = "^[A-Z]+$";
    Iterator<Object> primerElemLista;


    @BeforeEach
    void setUp() {
        myList = new SingleLinkedListImpl<>();
        primerElemLista = myList.iterator();
    }

    @DisplayName("TEST GENERAL: Se introducen elementos")
    @Test
    public void seIntroducenElementosTest() {
        myList.addNTimes("A", 5);
        Assertions.assertFalse(myList.isEmpty());
    }

    @DisplayName("TEST GENERAL: Se introducen elementos AL FINAL")
    @Test
    public void seIntroducenElementosAlFinalTest() {
        myList.addNTimes("A", 5);
        Assertions.assertFalse(myList.isEmpty());
    }

    @DisplayName("Se introducen elementos válidos con N válida")
    @Test
    public void elemValidoIntroducidoConNValida() {
        myList.addNTimes("A", 5);
        Assertions.assertTrue(myList.getAtPos(4).toString().matches(validElement));
    }

    @DisplayName("Se introducen elementos válidos con N inválida")
    @Test
    public void elemInvalidoIntroducidoConNInvalida() {
        Assertions.assertThrows(RuntimeException.class, () -> myList.addNTimes("A", -1));
    }

    @DisplayName("Se introducen elementos inválidos < A con N válida")
    @Test
    public void elemInvalidoMenorconNValida() {
        Assertions.assertThrows(RuntimeException.class, () -> myList.addNTimes("[", 5));
    }

    @DisplayName("Se introducen elementos inválidos > Z con N válida")
    @Test
    public void elemInvalidoMenorConNValida() {
        Assertions.assertThrows(RuntimeException.class, () -> myList.addNTimes("?", 5));
    }

    @DisplayName("Se introducen elementos inválidos > Z con N inválida")
    @Test
    public void elemInvalidoMayorConNInvalida() {
        Assertions.assertThrows(RuntimeException.class, () -> myList.addNTimes("?", -1));
    }
}