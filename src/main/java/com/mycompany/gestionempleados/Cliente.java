/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestionempleados;

/**
 *
 * @author teamUAM
 */
public class Cliente {
    private String nombre;
    private int identificador;
    
    
    public Cliente(){};
    
    public Cliente (String nombreE){
        this.nombre=nombreE;
    }
    public Cliente(String nombreE,  int identificador){
        this.nombre=nombreE;
        this.identificador=identificador;
    }

   
    //setters & Getters
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombreE){
        this.nombre=nombreE;
    }

    //identificador
        public int getIdentificador(){
        return identificador;
    }
    public void setIdentificador(int identificadorE){
        this.identificador=identificadorE;
    }
}

