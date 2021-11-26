package com.practica.cajanegra;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import com.cajanegra.SingleLinkedListImpl;


class TestSingleList {
	
	@Test
	   public void miTestDeEjemplo(){
	       SingleLinkedListImpl<String> mylist = new SingleLinkedListImpl<String>("A", "B");
	       assertEquals(2,mylist.size());
	   }

	SingleLinkedListImpl<String> mylist = new SingleLinkedListImpl<String>();

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() {
		miTestDeEjemplo();
	}

}
