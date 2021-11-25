package com.practica.cajanegra;

import com.cajanegra.SingleLinkedListImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class PruebaIsSubListEquivalencia {

    SingleLinkedListImpl<Object> myList;

    @BeforeEach
    void setUp() {
        myList = new SingleLinkedListImpl<>("Hola",123, "Gato",45,'P',90,'#',"Adios");
    }

    @DisplayName("IsNotSubList válido")
    @Test
    public void NoSubListTest() {
        SingleLinkedListImpl<Object> subList = new SingleLinkedListImpl<>('B',8,'A',6,'X');
        Assertions.assertTrue(myList.isSubList(subList) == -1);
    }

    @DisplayName("IsSubList válido")
    @Test
    public void SubListTest() {
        SingleLinkedListImpl<Object> subList = new SingleLinkedListImpl<>("Gato",45,'P');
        Assertions.assertTrue(myList.isSubList(subList) == 3);
    }
}

class PruebaIsSubListLimite{

    SingleLinkedListImpl<Object> myList;
    SingleLinkedListImpl<Object> subList;

    @BeforeEach
    void setUp() {
        myList = new SingleLinkedListImpl<>("Hola",123, "Gato",45,'P',90,'#',"Adios");
    }

    @DisplayName("SubList 0")
    @Test
    public void SubList1() {
        subList = new SingleLinkedListImpl<>();
        Assertions.assertTrue(myList.isSubList(subList) == 0 );
    }

    @DisplayName("SubList 1")
    @Test
    public void SubList2() {
        subList = new SingleLinkedListImpl<>('#');
        Assertions.assertTrue(myList.isSubList(subList) == 7 );
    }

    @DisplayName("SubListMedio")
    @Test
    public void SubListMedio() {
        subList = new SingleLinkedListImpl<>("Hola",123,'P',99);
        Assertions.assertTrue(myList.isSubList(subList) == -1 );
    }

    @DisplayName("SubList 7")
    @Test
    public void SubListPenultimo() {
        subList = new SingleLinkedListImpl<>(123, "Gato",45,'P',90,'#',"Adios");
        Assertions.assertTrue(myList.isSubList(subList) == 2 );
    }

    @DisplayName("SubList último")
    @Test
    public void SubListUltimo() {
        subList = new SingleLinkedListImpl<>(123,"Hola","Gato",45,'P',90,'#',"Adios");
        Assertions.assertTrue(myList.isSubList(subList) == -1 );
    }

    @DisplayName("No es sublist")
    @Test
    public void NoSubList() {
        subList = new SingleLinkedListImpl<>('J',123,"Hola","Gato",45,'P',90,'#',"Adios");
        Assertions.assertTrue(myList.isSubList(subList) == -1 );
    }

}
