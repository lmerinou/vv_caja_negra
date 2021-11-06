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
    Iterator<Object> primerElemLista;


    @BeforeEach
    void setUp() {
        myList = new SingleLinkedListImpl<>();
        primerElemLista = myList.iterator();
    }
    //METODO PARA COMPROBAR SI ES ASCII
    public void seEliminaElementoASCIITest(SingleLinkedListImpl<Object> miLista) throws EmptyCollectionException {
        Object a = miLista.getAtPos(3);
        Assertions.assertTrue(miLista.removeLast().toString().matches(validElement));
        miLista.addLast(a);
        System.out.println(miLista);
    }
    @DisplayName("Se elimina elemento correcto final")
    @Test
    public void seEliminaElementoFinalTest() throws EmptyCollectionException {
        SingleLinkedListImpl<Object> miListaLlena2 = new SingleLinkedListImpl<>("A", "BB", "L");
        seEliminaElementoASCIITest(miListaLlena2);
        Assertions.assertEquals("L", miListaLlena2.removeLast());
    }
    @DisplayName("Se elimina elemento final menor que A")
    @Test
    public void seEliminaElementoFinalMenorTest() throws EmptyCollectionException {
        SingleLinkedListImpl<Object> miListaLlena3 = new SingleLinkedListImpl<>("A", "BB", "]");
        seEliminaElementoASCIITest(miListaLlena3);
        Assertions.assertEquals("]", miListaLlena3.removeLast());
    }

    @DisplayName("Se elimina elemento final mayor que Z")
    @Test
    public void seEliminaElementoFinalMayorTest() throws EmptyCollectionException {
        SingleLinkedListImpl<Object> miListaLlena4 = new SingleLinkedListImpl<>("A", "BB", "?");
        seEliminaElementoASCIITest(miListaLlena4);
        Assertions.assertEquals("]", miListaLlena4.removeLast());
    }

    @DisplayName("No se elimina elemento final en lista vacía")
    @Test
    public void noSeEliminaElementoFinalInexistenteTest() throws EmptyCollectionException {
        SingleLinkedListImpl<Object> miListaVacia = new SingleLinkedListImpl<>();
        Assertions.assertThrows(com.cajanegra.EmptyCollectionException.class, () -> miListaVacia.removeLast());
    }
}