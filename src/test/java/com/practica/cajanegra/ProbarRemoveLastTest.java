package com.practica.cajanegra;

import com.cajanegra.EmptyCollectionException;
import com.cajanegra.SingleLinkedListImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Iterator;

import static org.junit.jupiter.api.Assertions.*;

class ProbarRemoveLastTest {

    SingleLinkedListImpl<Object> myList;
    String validElement = "^[A-Z]+$";


    @BeforeEach
    void setUp() {
        myList = new SingleLinkedListImpl<>();
    }

    @DisplayName("SE ELIMINA EL ÚLTIMO ELEMENTO CON VALORES < 122000")
    @Test
    public void seEliminaElementoFinalTest() throws EmptyCollectionException {
        SingleLinkedListImpl<Object> miListaLlena1 = new SingleLinkedListImpl<>("A", "A", "A");
        miListaLlena1.removeLast();
        Assertions.assertEquals(2, miListaLlena1.size());
    }
    @DisplayName("NO SE ELIMINA ÚLTIMO ELEMENTO MAYOR 1000000")
    @Test
    public void noSeEliminaElementoFinalGrandeTest() throws EmptyCollectionException {
        SingleLinkedListImpl<Object> miListaLlena2 = new SingleLinkedListImpl<>();
        miListaLlena2.addNTimes("A", 1000001);
        Assertions.assertEquals(1000000, miListaLlena2.size());
    }

    @DisplayName("No se elimina elemento final en lista vacía")
    @Test
    public void noSeEliminaElementoFinalInexistenteTest() throws EmptyCollectionException {
        SingleLinkedListImpl<Object> miListaVacia = new SingleLinkedListImpl<>();
        Assertions.assertThrows(com.cajanegra.EmptyCollectionException.class, miListaVacia::removeLast);
    }
}