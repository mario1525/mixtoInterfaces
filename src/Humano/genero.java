
package Humano;

import Interfas.interfaces;
import abstracto.nombres;


public class genero extends nombres implements interfaces {
    private boolean genero;

    public genero() {
    }

    public genero(boolean genero) {
        this.genero = genero;
    }

    public boolean isGenero() {
        return genero;
    }

    public void setGenero(boolean genero) {
        this.genero = genero;
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
        return super.toString()+"genero{" + "genero=" + genero + '}';
    }
    
}
