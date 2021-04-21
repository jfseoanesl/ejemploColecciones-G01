package test;

import java.util.*;
import modelo.*;

public class Test {

    public static void main(String[] args) {

        List<Estudiante> listado = new ArrayList(); // crea la coleccion
        
        Estudiante jairo = new Estudiante("Jairo", "Seoanes", "123", 5);
        Estudiante rua = new Estudiante("Fabian", "Rua", "234", 2);
        Estudiante ana = new Estudiante("Ana", "Patino", "456", 3);
        
        // adiciona elementos a la coleccion 
        GestionColeccion.addElemento(listado, jairo);
        GestionColeccion.addElemento(listado, rua);
        GestionColeccion.addElemento(listado, ana);
        
        System.out.println("** Imprime contenido de la coleccion ** ");
        GestionColeccion.imprimirElementos(listado);
        
        System.out.println("** Imprime contenido de la coleccion ordenado por apellido ** ");
        GestionColeccion.ordenarColeccion(listado);
        
        System.out.println("** Imprime contenido de la coleccion ordenado por nombre ** ");
        GestionColeccion.ordenarColeccion(listado, new OrdenPorNombre());
        
        System.out.println("** Imprime contenido de la coleccion ordenado por notas** ");
        GestionColeccion.ordenarColeccion(listado, new OrdenPorNota());
        
        System.out.println("** Busca un elemento en la coleccion ** ");
        GestionColeccion.buscarELemento(listado, "234");
        
        System.out.println("** Elimina un elemento de la coleccion ** ");
        GestionColeccion.eliminarELemento(listado, "234");
        
        System.out.println("** Imprime contenido de la coleccion (Final) ** ");
        GestionColeccion.imprimirElementos(listado);
    }
}
