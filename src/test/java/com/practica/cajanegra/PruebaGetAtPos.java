package com.practica.cajanegra;

import com.cajanegra.SingleLinkedListImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class GetAtPosEquivalencia {

    SingleLinkedListImpl<Object> myList;

    @BeforeEach
    void setUp() {
        myList = new SingleLinkedListImpl<>(123, "Hola",'P',90,"Adios");
    }

    @DisplayName("Get en posición válida")
    @Test
    public void posValidaTest() { Assertions.assertEquals('P',myList.getAtPos(3)); }

    @DisplayName("Get en posición menor que 0")
    @Test
    public void posMenor0Test() { Assertions.assertThrows(IllegalArgumentException.class,
            () -> {myList.getAtPos(-2);} ) ;}

    @DisplayName("Get en posición mayor que size")
    @Test
    public void posMayorSizeTest() { Assertions.assertThrows(IllegalArgumentException.class,
            () -> {myList.getAtPos(8);} ) ; }

}



class GetAtPosValorLimite {
    SingleLinkedListImpl<Object> myList;

    @BeforeEach
    void setUp() {
        myList = new SingleLinkedListImpl<>("Hola",123, "Gato",45,'P',90,'#',"Adios");
    }

    @DisplayName("Get en posición inválida inferior")
    @Test
    public void posInvalidaTest() { Assertions.assertThrows(IllegalArgumentException.class,
            () -> {myList.getAtPos(0);} ) ; }

    @DisplayName("Get en posición válida límite inferior")
    @Test
    public void posLimInfTest() { Assertions.assertEquals("Hola",myList.getAtPos(1)); }

    @DisplayName("Get en posición válida superior")
    @Test
    public void posValidaSupTest() { Assertions.assertEquals(123,myList.getAtPos(2)); }

    @DisplayName("Get en posición válida nominal")
    @Test
    public void posValidaNominalTest() { Assertions.assertEquals('P',myList.getAtPos(5)); }

    @DisplayName("Get en posición válida inferior")
    @Test
    public void posValidaInfTest() { Assertions.assertEquals('#',myList.getAtPos(7)); }

    @DisplayName("Get en posición válida límite superior")
    @Test
    public void posLimSupTest() {Assertions.assertEquals("Adios",myList.getAtPos(8)); }

    @DisplayName("Get en posición inválida superior")
    @Test
    public void posInvalidaSupTest() { Assertions.assertThrows(IllegalArgumentException.class,
            () -> {myList.getAtPos(9);} ) ; }


}


