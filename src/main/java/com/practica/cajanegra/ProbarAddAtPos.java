package com.practica.cajanegra;

import com.cajanegra.SingleLinkedListImpl;
public class ProbarAddAtPos {
    public static void main(String[] args) {
        SingleLinkedListImpl<Object> miLista = new SingleLinkedListImpl<>(new SingleLinkedListImpl<>(3,4),"Hola soy Juan",999,55);
        // 1 forma de imprimir contenido de la lista

       /* for (Object element: miLista) {
            System.out.print(element+ " ");
        }
        */

        //2º forma de imprimir el contenido de la lista
        System.out.println("Contenido inicial: " + miLista);

        int nuevoEntero = 12345;
        miLista.addAtPos(nuevoEntero,1);
        System.out.println("Contenido modificado: " + miLista);
      /*  miLista.addAtPos(nuevoEntero,-1);
        System.out.println("Contenido modificado: " + miLista);*/
        miLista.addAtPos(nuevoEntero,3);
        System.out.println("Contenido modificado: " + miLista);
        miLista.addAtPos(nuevoEntero,999); // no salta excepcion
        System.out.println("Contenido modificado: " + miLista);

        System.out.println();

        SingleLinkedListImpl<String> nuevaLista = new SingleLinkedListImpl<>("Pepe", "Juan","Jaime");
        miLista.addAtPos(nuevaLista,2);
        System.out.println("Contenido modificado: " + miLista);
      /*  miLista.addAtPos(nuevoEntero,-1);
        System.out.println("Contenido modificado: " + miLista);*/
        miLista.addAtPos(nuevaLista,3);
        System.out.println("Contenido modificado: " + miLista);
        miLista.addAtPos(nuevaLista,999); // no salta excepcion
        System.out.println("Contenido modificado: " + miLista);

    }
}
