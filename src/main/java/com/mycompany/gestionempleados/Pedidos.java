/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestionempleados;

/**
 *
 * @author teamUAM
 */
public class Pedidos {
    
    private int identificador, idproducto,idcliente,cantidad,estado,idproducto2;
    private String nombreCliente, nombreProducto, direccion;
    private int cantidad2;
    private String prod2;
    int preciototal;
    int precio1,precio2;
    
    public Pedidos(){};
    
    public Pedidos (int identificador){
        this.identificador=identificador;
    }
   public Pedidos (int identificador,int idproducto){
        this.identificador=identificador;
        this.idproducto=idproducto;
    }
    public Pedidos (int identificador,int idproducto, int idcliente){
        this.identificador=identificador;
        this.idproducto=idproducto;
         this.idcliente=idcliente;
    }
    public Pedidos (int identificador,int idproducto, int idcliente,int cantidad){
        this.identificador=identificador;
        this.idproducto=idproducto;
        this.idcliente=idcliente;
        this.cantidad=cantidad;
    }
    public Pedidos (int identificador,int idproducto, int idcliente,int cantidad,int estado){
        this.identificador=identificador;
        this.idproducto=idproducto;
        this.idcliente=idcliente;
        this.cantidad=cantidad;
        this.estado=estado;
    }
    public Pedidos (int identificador,int idproducto, int idcliente,
            int cantidad,int estado,String nombreCliente){
        this.identificador=identificador;
        this.idproducto=idproducto;
        this.idcliente=idcliente;
        this.cantidad=cantidad;
        this.estado=estado;
        this.nombreCliente=nombreCliente;
    }
    public Pedidos (int identificador,int idproducto, int idcliente,
            int cantidad,int estado,String nombreCliente, String nombreProducto){
        this.identificador=identificador;
        this.idproducto=idproducto;
        this.idcliente=idcliente;
        this.cantidad=cantidad;
        this.estado=estado;
        this.nombreCliente=nombreCliente;  
        this.nombreProducto=nombreProducto;
    }
    //total de 1 producto
    public Pedidos (int identificador,int idproducto, int idcliente,
            int cantidad,int estado,String nombreCliente, String nombreProducto,
            String direccion,int preciototal,int precio1){
        this.identificador=identificador;
        this.idproducto=idproducto;
        this.idcliente=idcliente;
        this.cantidad=cantidad;
        this.estado=estado;
        this.nombreCliente=nombreCliente;  
        this.nombreProducto=nombreProducto;
        this.direccion=direccion;
        this.preciototal=preciototal;
        this.precio1 = precio1;

    }
    //total de 2 productos
        public Pedidos (int identificador,int idproducto, int idcliente,
            int cantidad,int estado,String nombreCliente, String nombreProducto, String direccion,
           String prod2, int cantidad2,int preciototal,int idproducto2,int precio1, int precio2){
        this.identificador=identificador;
        this.idproducto=idproducto;
        this.idcliente=idcliente;
        this.cantidad=cantidad;
        this.estado=estado;
        this.nombreCliente=nombreCliente;  
        this.nombreProducto=nombreProducto;
        this.direccion=direccion;
        this.prod2 = prod2;
        this.cantidad2 = cantidad2;
        this.preciototal=preciototal;
        this.idproducto2=idproducto2;
        this.precio1 = precio1;
        this.precio2 = precio2;
    }

    //setters & Getters
    //identificador
    public int getIdentificador(){
        return identificador;
    }
    public void setIdentificador(int identificadorE){
        this.identificador=identificadorE;
    }
    //id producto
    public int getIdProducto(){
        return idproducto;
    }
    public void setIdProducto(int idprodcuto){
        this.idproducto=idprodcuto;
    }
    // id cliente
    public int getIdCliente(){
        return idcliente;
    }
    public void setIdCliente(int idcliente){
        this.idcliente=idcliente;
    }
    // cantidad
    public int getCantidad(){
        return cantidad;
    }
    public void setCantidad(int cantidad){
        this.cantidad=cantidad;
    }
    // estado
    public int getEstado(){
        return estado;
    }
    public void setEstado(int estado){
        this.estado=estado;
    }
    //nombre cliente
    public String getNombreCliente(){
        return nombreCliente;
    }
    public void setNombreCliente(String nombreCliente){
        this.nombreCliente=nombreCliente;
    }
    // nombre producto
    public String getNombreProducto(){
        return nombreProducto;
    }
    public void setNombreProducto(String nombreProducto){
        this.nombreProducto=nombreProducto;
    }
    // direccion
    public String getDireccion(){
        return direccion;
    }
    public void setDireccion(String direccion){
        this.direccion=direccion;
    }
    // mas prod
    public String getProd2(){
        return prod2;
    }
    public void setProd2(String prod2){
        this.prod2=prod2;
    }
    public int getCantidad2(){
        return cantidad2;
    }
    public void setCantidad2(int cantidad2){
        this.cantidad2=cantidad2;
    }
     public int getPrecioTotal(){
        return preciototal;
    }
    public void setPrecioTotal(int preciototal){
        this.preciototal=preciototal;
    }
    public int getIdProducto2(){
        return idproducto2;
    }
    public void setIdProducto2(int idproducto2){
        this.idproducto2=idproducto2;
    }
      public int getPrecio1(){
        return precio1;
    }
    public void setIdPrecio1(int precio1){
        this.precio1=precio1;
    }
      public int getPrecio2(){
        return precio2;
    }
    public void setPrecio2(int precio2){
        this.precio2=precio2;
    }
    //MODIFICACIONES-------------------------------------------------------------------
    public int getNuevaCantidad() {
        return cantidad;
    }
    public void setNuevaCantidad(int nuevaCantidad) {
        this.cantidad = nuevaCantidad;
    }
    
     public int getNuevoPrecioTotal() {
        return preciototal;
    }
    public void setNuevoPrecioTotal(int nuevoprecio) {
        this.preciototal = nuevoprecio;
    }
    public int getNuevaCantidad2() {
        return cantidad2;
    }
    public void setNuevaCantidad2(int nuevaCantidad2) {
        this.cantidad2 = nuevaCantidad2;
    }
    public String getNuevaDireccion() {
        return direccion;
    }
    public void setNuevaDireccion(String nuevaDireccion) {
        this.direccion = nuevaDireccion;
    }
   
}


