/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestionempleados;

/**
 *
 * @author marce
 */
public class Productos {
    
    private String nombre, descripcion, color,modelo;
    private int precio,identificador;
    
    
    public Productos(){};
    
    public Productos (String nombreE){
        this.nombre=nombreE;
    }
    public Productos (String nombreE, String descripcionE){
        this.nombre=nombreE;
        this.descripcion=descripcionE;
    }
    public Productos(String nombreE, String descripcionE , String colorE){
        this.descripcion=descripcionE;
        this.nombre=nombreE;
        this.color=colorE;
    }
    public Productos(String nombreE, String descripcionE , String colorE,String modeloE){
        this.descripcion=descripcionE;
        this.nombre=nombreE;
        this.color=colorE;
        this.modelo=modeloE;
    }
    public Productos(String nombreE, String descripcionE , String colorE,String modeloE,int precioE){
        this.descripcion=descripcionE;
        this.nombre=nombreE;
        this.color=colorE;
        this.modelo=modeloE;
        this.precio=precioE;
    }   
    public Productos(String nombreE, String descripcionE , String colorE,String modeloE,int precioE,int identificadorE){
        this.descripcion=descripcionE;
        this.nombre=nombreE;
        this.color=colorE;
        this.modelo=modeloE;
        this.precio=precioE;
        this.identificador=identificadorE;
    }   
          
  //  Productos(String nombre, String descripcion , String color,String modelo,int precio) {
    //    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    
   // }

   
    //setters & Getters
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombreE){
        this.nombre=nombreE;
    }
    
    //Descipcion
     public String getDescripcion(){
        return descripcion;
    }
    public void setDescripcion(String descripcionE){
        this.descripcion=descripcionE;
    }
    //color
    public String getColor(){
        return color;
    }
    public void setColor(String colorE){
        this.color=colorE;
    }
      //modelo
    public String getModelo(){
        return modelo;
    }
    public void setModelo(String modeloE){
        this.modelo=modeloE;
    }
       //precio
    public int getPrecio(){
        return precio;
    }
    public void setPrecio(int precioE){
        this.precio=precioE;
    }
    //identificador
        public int getIdentificador(){
        return identificador;
    }
    public void setIdentificador(int identificadorE){
        this.identificador=identificadorE;
    }
}

