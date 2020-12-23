/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;

/**
 *
 * @author ferna
 */
public class maestro extends persona implements Serializable{
    private Double sueldo;
    private Boolean rol;  //tambien se puede poner string acceso

    public maestro() {
    }

    public maestro(Double sueldo, Boolean rol) {
        this.sueldo = sueldo;
        this.rol = rol;
    }

    public Double getSueldo() {
        return sueldo;
    }

    public void setSueldo(Double sueldo) {
        this.sueldo = sueldo;
    }

    public Boolean getRol() {
        return rol;
    }

    public void setRol(Boolean rol) {
        this.rol = rol;
    }
    
    
    
    
}
