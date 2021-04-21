package modelo;

import java.util.Comparator;

public class OrdenPorNota implements Comparator<Estudiante> {

    @Override
    public int compare(Estudiante t, Estudiante t1) {
        if(t.getNota()>t1.getNota()) return 1;
        else if(t.getNota()<t1.getNota()) return -1;
        else return 0;
    }
    
}
