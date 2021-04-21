package test;
import java.util.*;
import modelo.Estudiante;

public class GestionColeccion {
    
    
    public static void addElemento(List<Estudiante> lista, Estudiante e){
        lista.add(e);
    }
    
    public static void imprimirElementos(List<Estudiante> lista){
        System.out.println("Listado de estudiantes: ");
        System.out.printf("%-20s %-20s %-20s %s%n", "Cedula", "Nombre", "Apellido", "Nota");
        System.out.println("----------------------------------------------------------------------------------------");
        for (Estudiante e : lista) {
            System.out.printf("%-20s %-20s %-20s %.2f%n", 
                              e.getCc(), 
                              e.getNombre(), 
                              e.getApellido(), 
                              e.getNota());
        }
        System.out.println("----------------------------------------------------------------------------------------\n");
    }
    
    public static void buscarELemento(List<Estudiante> lista, String cc){
        Estudiante encontrado = null;
        System.out.println("Cedula buscada: " + cc);
        for (Estudiante e : lista) {
            if(e.getCc().equals(cc)){
                encontrado=e;
                break;
            }
        }
        if(encontrado == null)
            System.out.println("Estudiante no registrado");
        else{
            System.out.println("Registro encontrado: ");
            System.out.println(encontrado);
        }    
        System.out.println("----------------------------------------------------------\n");
    }
    
    public static void eliminarELemento(List<Estudiante> lista, String cc){
        Estudiante eliminado = null;
        System.out.println("Cedula buscada: " + cc);

        Iterator<Estudiante> it = lista.iterator();
        while (it.hasNext()) {
            Estudiante e = it.next();
            if (e.getCc().equals(cc)) {
                it.remove();
                eliminado = e;
                break;
            }
        }
        if(eliminado == null)
            System.out.println("Estudiante no registrado");
        else{
            System.out.println("Resgitro eliminado: ");
            System.out.println(eliminado);
        }    
        System.out.println("----------------------------------------------------------\n");
    }
    
    public static void ordenarColeccion(List<Estudiante> lista, Comparator orden){
        List<Estudiante> listaOrdenada = new ArrayList(lista);
        if(orden!=null)
            Collections.sort(listaOrdenada, orden);
        else
            Collections.sort(listaOrdenada);
        
        imprimirElementos(listaOrdenada);
    }
    
    public static void ordenarColeccion(List<Estudiante> lista){
        ordenarColeccion(lista, null);
    }
    
}
