package com.practica.cajanegra;

import com.cajanegra.EmptyCollectionException;
import com.cajanegra.SingleLinkedListImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.Iterator;

import static org.junit.jupiter.api.Assertions.*;

class ProbarMetodosAux {

	SingleLinkedListImpl<Object> myList;
    // String validElement = "^[A-Z]+$";


    @BeforeEach
    void setUp() {
        myList = new SingleLinkedListImpl<>();
    }

    @Nested
    	@DisplayName("metodo reverse()")
 		class reverse{
	 		@Test
	 		public void seDevuelveElReversoDeListaVacia() {
	 			Assertions.assertEquals("[]", myList.reverse().toString());
	 		}
	 		@Test
	 		public void seDevuelveElReversoDeListaConUnElemento() {
	 			SingleLinkedListImpl<Object> listaConUnElemento = new SingleLinkedListImpl<>("P");
	 			Assertions.assertEquals("[P]", listaConUnElemento.reverse().toString());
	 		}
	 		@Test
	 		public void seDevuelveElReversoDeListaLlena() {
	 			SingleLinkedListImpl<Object> listaLlena = new SingleLinkedListImpl<>("K", "F", "C");
	 			Assertions.assertEquals("[C, F, K]", listaLlena.reverse().toString());
	 		}
    	}
    
    @Nested
	@DisplayName("metodo isEmpty()")
		class isEmpty{
 		@Test
 		public void isEmptyListaVacia() {
 			Assertions.assertTrue(myList.isEmpty());
 		}
 		@Test
 		public void isEmptyListaConUnElemento() {
 			SingleLinkedListImpl<Object> listaConUnElemento1 = new SingleLinkedListImpl<>("R");
 			Assertions.assertFalse(listaConUnElemento1.isEmpty());
 		}
 		@Test
 		public void isEmptyListaLlena() {
 			SingleLinkedListImpl<Object> listaLlena1 = new SingleLinkedListImpl<>("O", "I", "U");
 			Assertions.assertFalse(listaLlena1.isEmpty());
 		}
	}
    
    @Nested
	@DisplayName("metodo size()")
		class size{
 		@Test
 		public void seCuentaBienUnElemento() {
 			SingleLinkedListImpl<Object> listaConUnElemento2 = new SingleLinkedListImpl<>("D");
 			Assertions.assertEquals(1, listaConUnElemento2.size());
 		}
 		@Test
 		public void seCuentaBienListaLlena() {
 			SingleLinkedListImpl<Object> listaLlena2 = new SingleLinkedListImpl<>("A", "S", "D", "F");
 			Assertions.assertEquals(4, listaLlena2.size());
 		}
 		@Test
 		public void excepcionListaVacia() throws EmptyCollectionException{
 			Assertions.assertThrows(com.cajanegra.EmptyCollectionException.class, myList::size);
 		}
	}
    
    @Nested
	@DisplayName("metodo toString()")
		class toString{
 		@Test
 		public void seDevuelveCadenaDeListaVacia() {
 			Assertions.assertEquals("[]", myList.toString());
 		}
 		@Test
 		public void seDevuelveCadenaDeListaConUnElemento() {
 			SingleLinkedListImpl<Object> listaConUnElemento3 = new SingleLinkedListImpl<>("L");
 			Assertions.assertEquals("[L]", listaConUnElemento3.toString());
 		}
 		@Test
 		public void seDevuelveCadenaDeListaLlena() {
 			SingleLinkedListImpl<Object> listaLlena3 = new SingleLinkedListImpl<>("L", "A", "H");
 			Assertions.assertEquals("[L, A, H]", listaLlena3.toString());
 		}
	}
}
