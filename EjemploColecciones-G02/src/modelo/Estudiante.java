package modelo;

public class Estudiante implements Comparable<Estudiante> {
    private String nombre, apellido, cc;
    private double nota;

    public Estudiante() {
    }

    public Estudiante(String cc) {
        this.cc = cc;
    }

    public Estudiante(String nombre, String apellido, String cc, double nota) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cc = cc;
        this.nota = nota;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @param apellido the apellido to set
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * @return the cc
     */
    public String getCc() {
        return cc;
    }

    /**
     * @param cc the cc to set
     */
    public void setCc(String cc) {
        this.cc = cc;
    }

    /**
     * @return the nota
     */
    public double getNota() {
        return nota;
    }

    /**
     * @param nota the nota to set
     */
    public void setNota(double nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Estudiante{" + "nombre=" + nombre + ", apellido=" + apellido + ", cc=" + cc + ", nota=" + nota + '}';
    }

    @Override
    public int compareTo(Estudiante e) {
        return this.apellido.compareTo(e.apellido);
        
    }
    
    
}
