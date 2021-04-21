package modelo;

import java.util.Comparator;


public class OrdenPorNombre implements Comparator<Estudiante> {

    @Override
    public int compare(Estudiante t, Estudiante t1) {
        return t.getNombre().compareTo(t1.getNombre());
    }
    
}
