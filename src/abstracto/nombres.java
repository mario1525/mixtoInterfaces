
package abstracto;


public abstract class nombres {
    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public abstract void asigName();

    @Override
    public String toString() {
        return "nombres{" + "nombre=" + nombre + '}';
    }
    
    
}
