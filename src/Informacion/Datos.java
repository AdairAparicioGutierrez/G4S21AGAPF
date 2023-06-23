/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Informacion;

/**
 *
 * @author tesoem
 */
public class Datos {
    INombre nombres;
    String Fechadenacimiento;
    String Correo;
    String RFC;
    IDireccion direccion;
    

    public Datos(INombre nombres, String Fechadenacimiento, String correo, String rfc, IDireccion direccion) {
        this.nombres = nombres;
        this.Fechadenacimiento = Fechadenacimiento;
        this.Correo = correo;
        this.RFC = rfc;
        this.direccion = direccion;
      
     
    }
    
    public Datos() {
    }

   public INombre getNombres() {
        return nombres;
        
    }

    public void setNombres(INombre nombres) {
        this.nombres = nombres;
    }

    

    public String getFechadenacimiento() {
        return Fechadenacimiento;
    }

    public void setFechadenacimiento(String fechadenacimiento) {
        this.Fechadenacimiento = fechadenacimiento;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String correo) {
        this.Correo = correo;
    }

    public String getRfc() {
        return RFC;
    }

    public void setRfc(String rfc) {
        this.RFC = rfc;
    }

    public IDireccion getDireccion() {
        return direccion;
    }

    public void setDireccion(IDireccion direccion) {
        this.direccion = direccion;
    }

  
 
    
}
