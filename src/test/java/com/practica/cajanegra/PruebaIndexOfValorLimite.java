package com.practica.cajanegra;

import com.cajanegra.SingleLinkedListImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PruebaIndexOfValorLimite {
    SingleLinkedListImpl<Object> myList;

    @BeforeEach
    public void setUp(){
        myList = new SingleLinkedListImpl<>("@", "A", "B", "M", "Y", "Z", "[");
    }

    @DisplayName("Buscamos el elemento anterior al minimo")
    @Test
    public void indexOfAnteriorMinimo(){
        assertThrows(java.lang.IllegalArgumentException.class, () -> {
                    myList.indexOf("@");
                }
        );
    }

    @DisplayName("Buscamos el elemento minimo")
    @Test
    public void indexOfMinimo(){
        assertEquals(2, myList.indexOf("A"));
    }

    @DisplayName("Buscamos el elemento posterior al minimo")
    @Test
    public void indexOfPosteriorMinimo(){
        assertEquals(3, myList.indexOf("B"));
    }

    @DisplayName("Buscamos un elemento nominal")
    @Test
    public void indexOfNominal(){
        assertEquals(4, myList.indexOf("M"));
    }

    @DisplayName("Buscamos el elemento anterior al maximo")
    @Test
    public void indexOfAnteriorMaximo(){
        assertEquals(5, myList.indexOf("Y"));
    }

    @DisplayName("Buscamos el elemento máximo")
    @Test
    public void indexOfMaximo(){
        assertEquals(6, myList.indexOf("Z"));
    }

    @DisplayName("Buscamos el elemento posterior al maximo")
    @Test
    public void indexOfPosteriorMaximo(){
        assertThrows(java.lang.IllegalArgumentException.class, () -> {
                    myList.indexOf("[");
                }
        );
    }
}