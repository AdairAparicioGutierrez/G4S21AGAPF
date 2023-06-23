/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Informacion;

/**
 *
 * @author hugo4295
 */
public class INombre {
String nombres;
String ApellidoP;
String ApellidoM;


    public INombre(String nombres, String ApellidoP, String ApellidoM) {
        this.nombres = nombres;
        this.ApellidoP = ApellidoP;
        this.ApellidoM = ApellidoM;
    }

    public INombre() {
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidoP() {
        return ApellidoP;
    }

    public void setApellidoP(String ApellidoP) {
        this.ApellidoP = ApellidoP;
    }

    public String getApellidoM() {
        return ApellidoM;
    }

    public void setApellidoM(String ApallidoM) {
        this.ApellidoM = ApallidoM;
    }



}
