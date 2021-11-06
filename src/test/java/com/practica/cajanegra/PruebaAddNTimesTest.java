package com.practica.cajanegra;

import com.cajanegra.SingleLinkedListImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PruebaAddNTimesTest {

    SingleLinkedListImpl<Object> myList;
    String validElement = "^[A-Z]+$";

    @BeforeEach
    void setUp() {
        myList = new SingleLinkedListImpl<>();
    }

    @DisplayName("Se introducen elementos")
    @Test
    public void seIntroducenElementosTest() {
        myList.addNTimes("A", 5);
        Assertions.assertFalse(myList.isEmpty());
    }
    @DisplayName("Se introducen elementos válidos")
    @Test
    public void elemValidoIntroducido() {
        myList.addNTimes("A", 5);
        Assertions.assertTrue(myList.getAtPos(4).toString().matches(validElement));
    }

    @DisplayName("Se introducen elementos inválidos y se dispara la excepción")
    @Test
    public void elemInvalidoIntroducido() {
        Assertions.assertThrows(RuntimeException.class, () ->{
            myList.addNTimes("1", 5);});
    }

    @DisplayName("Se introducen un N inválido y se dispara la excepción")
    @Test
    public void numeroNInvalidoIntroducido() {
        Assertions.assertThrows(RuntimeException.class, () ->{
            myList.addNTimes("1", -1);});
    }
}