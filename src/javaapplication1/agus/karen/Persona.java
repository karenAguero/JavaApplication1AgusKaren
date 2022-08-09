/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1.agus.karen;

/**
 *
 * @author KA
 */
public class Persona {
    
    private String SEXO = "hombre";
    
    private String nombre; 
    private int edad; 
    private int dni; 
    private String sexo; 
    private double peso;
    private double altura; 
 
    public Persona () {
        nombre = "";       
        edad = 0;
        dni = 0;
        sexo = SEXO;
        peso = 0.0;
        altura =0.0;
    }     
     public Persona (String valorNombre,int valorEdad,String valorSexo) {
        nombre = valorNombre;       
        edad = valorEdad;
        dni = 0;
        sexo = valorSexo;
        peso = 0.0;
        altura =0.0;                   
    }     
     public Persona (String valorNombre,int valorEdad,String valorSexo, int valorDni, Double valorPeso, Double valorAltura) {
        nombre = valorNombre;       
        edad = valorEdad;
        dni = valorDni;
        sexo = valorSexo;
        peso = valorPeso;
        altura = valorAltura;                   
    }     
    public void setNombre (String valorNombre) {
        nombre = valorNombre; 
    } 
    public void setEdad (int valorEdad) {
        edad = valorEdad; 
    } 
    public void setDni (int valorDni) {
        dni = valorDni; 
    } 
    public void setSexo (String valorSexo) {
        sexo = valorSexo; 
    } 
    public void setPeso (Double valorPeso) {
        peso = valorPeso; 
    } 
    public void setAltura (Double valorAltura) {
        altura = valorAltura; 
    } 
    

    public String getNombre () { return nombre; } 
    public int getEdad () { return edad; } 
    public int getDni () { return dni; }
    public String getSexo () { return sexo; }
    public Double getPeso () { return peso; }
    public Double getAltura () { return altura; }


     
    public int calcularImc() {
        double imc = peso / altura * altura;
        if (imc < 20) {
            return -1;
        } else {
            if (imc < 25) {
                return 0;
            } else {
                return 1;
            }
        }
    }
    
    public char comprobarSexo (char s) {
        if(s!='M' || s!='H'){
            s='H';
        }
        return s;
    }
} 

