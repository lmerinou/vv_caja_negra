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
        int tamI = myList.size();
        myList.addNTimes("B", 2);

        Assertions.assertEquals(tamI + 1, myList.indexOf("B"));
    }

    @DisplayName("Se introducen elementos válidos con N válida")
    @Test
    public void elemValidoIntroducidoConNValida() {
        myList.addNTimes("A", 5);
        Assertions.assertTrue(myList.getAtPos(4).toString().matches(validElement));
    }

    @DisplayName("Se introducen elementos válidos con N inválida")
    @Test
    public void elemValidoIntroducidoConNInvalidaTest() {
        Assertions.assertThrows(RuntimeException.class, () -> myList.addNTimes("A", -1));
    }
    @DisplayName("Se introducen elementos válidos con N > 1000000")
    @Test
    public void elemValidoIntroducidoConNMayorMillonTest() {
        myList.addNTimes("A", 1000001);
        Assertions.assertThrows(StackOverflowError.class, () -> myList.addNTimes("A", 1000001));
    }

    @DisplayName("Se introducen elementos inválidos < A con N válida")
    @Test
    public void elemInvalidoMenorconNValidaTest() {
        Assertions.assertThrows(RuntimeException.class, () -> myList.addNTimes("[", 5));
    }

    @DisplayName("Se introducen elementos inválidos < A con N inválida")
    @Test
    public void elemInvalidoMenorconNInvalidaTest() {
        Assertions.assertThrows(RuntimeException.class, () -> myList.addNTimes("[", -1));
    }

    @DisplayName("Se introducen elementos inválidos < A con N > 1000000")
    @Test
    public void elemInvalidoMenorconNMayorMillonTest() {
        myList.addNTimes("A", 1000001);
        Assertions.assertThrows(StackOverflowError.class, () -> myList.addNTimes("[", 1000001));
    }

    @DisplayName("Se introducen elementos inválidos > Z con N válida")
    @Test
    public void elemInvalidoMenorConNValidaTest() {
        Assertions.assertThrows(RuntimeException.class, () -> myList.addNTimes("?", 5));
    }

    @DisplayName("Se introducen elementos inválidos > Z con N inválida")
    @Test
    public void elemInvalidoMayorConNInvalidaTest() {
        Assertions.assertThrows(RuntimeException.class, () -> myList.addNTimes("?", -1));
    }

    @DisplayName("Se introducen elementos inválidos > Z con N > 1000000")
    @Test
    public void elemInvalidoMayorConNMayorMillonTest() {
        myList.addNTimes("?", 1000001);
        Assertions.assertThrows(StackOverflowError.class, () -> myList.addNTimes("?", 1000001));
    }
}