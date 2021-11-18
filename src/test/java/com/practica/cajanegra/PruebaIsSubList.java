package com.practica.cajanegra;

import com.cajanegra.SingleLinkedListImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class PruebaIsSubListEquivalencia {

    SingleLinkedListImpl<Object> myList;

    @BeforeEach
    void setUp() {
        myList = new SingleLinkedListImpl<>("Hola",123, "Gato",45,'P',90,'#',"Adios");
    }

    @DisplayName("IsSubList válido")
    @Test
    public void posInvalidaTest() {
        SingleLinkedListImpl<Object> subList = new SingleLinkedListImpl<>('B',8,'A',6,'X');
        myList.isSubList(subList);
    }
}

class PruebaIsSubListLimite{

    SingleLinkedListImpl<Object> myList;
    SingleLinkedListImpl<Object> subList;

    @BeforeEach
    void setUp() {
        myList = new SingleLinkedListImpl<>("Hola",123, "Gato",45,'P',90,'#',"Adios");
    }

    @DisplayName("SubList 1")
    @Test
    public void SubList1() {
        subList = new SingleLinkedListImpl<>("Hola",123);
        myList.isSubList(subList);
    }

    @DisplayName("SubList 2")
    @Test
    public void SubList2() {
        subList = new SingleLinkedListImpl<>(123,"Gato",45);
        myList.isSubList(subList);
    }

    @DisplayName("SubListMedio")
    @Test
    public void SubListMedio() {
        subList = new SingleLinkedListImpl<>(45);
        myList.isSubList(subList);
    }

    @DisplayName("SubList penúltimo")
    @Test
    public void SubListPenultimo() {
        subList = new SingleLinkedListImpl<>('#',"Adios");
        myList.isSubList(subList);
    }

    @DisplayName("SubList último")
    @Test
    public void SubListUltimo() {
        subList = new SingleLinkedListImpl<>("Adios");
        myList.isSubList(subList);
    }

    @DisplayName("No es sublist")
    @Test
    public void NoSubList() {
        subList = new SingleLinkedListImpl<>('J',78,"No");
        myList.isSubList(subList);
    }

}
