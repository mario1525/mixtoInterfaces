
package Comida;

import Interfas.interfaces;
import abstracto.nombres;


public class desayuno extends nombres implements interfaces {
    
    private int precio;

    public desayuno() {
    }

    public desayuno(int precio) {
        this.precio = precio;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    

    @Override
    public void asigName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void pesoGramos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void pesoLibra() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return super.toString()+ "desayuno{" + "precio=" + precio + '}';
    }
    
    
    
}
