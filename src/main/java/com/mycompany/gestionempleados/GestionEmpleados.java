/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gestionempleados;

import static java.lang.reflect.Array.set;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author teamUAM
 */
public class GestionEmpleados {

public static void main(String[] args) {
           // Se crean los productos quemados
        List<Productos> productos = new ArrayList<>();
        productos.add(new Productos("Refrigeradora", "Dos puertas" , 
                "Gris","Samsung",360,123));
        productos.add(new Productos("Refrigeradora", "Una puerta" , 
                "Blanca","LG",234,124));
        productos.add(new Productos("Microondas", "multi función" , 
                "Gris","LG",84,125));
        productos.add(new Productos("Microondas", "multi función" , 
                "Blanco","Samsung",104,126));
        productos.add(new Productos("Laptop", "Vostro 14 3000" , 
                "Negro","DELL",430,127));
        productos.add(new Productos("Freidora de aire", "Power XL" , 
                "Blanco","Oster",60,128));
        productos.add(new Productos("Freidora de aire", "Acero" , 
                "Gris","OSter",40,129));
        productos.add(new Productos("Horno", "Tostador" , 
                "Blanco","Black & Decker",93,131));
        productos.add(new Productos("Tostadora", "2 rebanadas" , 
                "Gris","DELL",40,132));
        // Crear cliente
          List<Cliente> clientes= new ArrayList<>();
        clientes.add(new Cliente("Distribuidora ABS",11221));
        clientes.add(new Cliente("Monge",11981));
        clientes.add(new Cliente("Minicreditos",11231));
        clientes.add(new Cliente("Distribucion caribe",17721));
        clientes.add(new Cliente("Ventas la central",11217));
        clientes.add(new Cliente("Electrodomésticos al instante",24612));
        clientes.add(new Cliente("El Hueco",16617));
        clientes.add(new Cliente("Distribución al instante",26717));
        clientes.add(new Cliente("Importación pacifico",21297));
        clientes.add(new Cliente("Gollo",11757));
        
        List<Pedidos> pedidos= new ArrayList<>();
        
       Menu(productos,clientes,pedidos);
    }
public static void Menu(List<Productos> productos,List<Cliente> clientes,List<Pedidos> pedidos) {
        boolean termino = true;
        while (termino == true) {
            Scanner myObj = new Scanner(System.in);
            System.out.println("""
                               BIENVENIDO (a)
                               1- Informaci\u00f3n de Productos
                               2- Agregar un nuevo pedido
                               3- Eliminar un pedido
                               4- Editar pedidos
                               5- Mostrar pedidos
                               6- Informaci\u00f3n de Clientes
                               7- Salir""");
            //Le pido al usuario un digito
            String seleccion = myObj.nextLine();
            int select = 0;
            //Me permite filtrar todo lo que no sea número
            if (seleccion.matches("^[0-9]*$")) {
                select = Integer.parseInt(seleccion);
            } else {
                select = 0;
            }
            switch (select) {
                case 1:
                    MostrarProductos(productos,clientes,pedidos);
                    break;
                case 2:
                    agregarPedidos(productos,clientes,pedidos);
                    break;
                case 3:
                     eliminarPedido(productos,pedidos,clientes);
                    break;
                case 4:
                  modificarPedidos(productos,pedidos,clientes);
                    break;
                case 5:
                  MostrarPedidos(productos,pedidos,clientes);
                    break;
                case 6:
                     MostrarClientes(productos,clientes,pedidos);
                    break;
                case 7:
                    System.exit(0);
                default:
                    System.err.println("Opción no valida\n");
            }
        }

    }
public static void MostrarProductos(List<Productos> productos,List<Cliente> clientes,List<Pedidos> pedidos) {
 System.out.println("Lista de Productos:");
        for (Productos producto : productos) {
            System.out.println("Nombre: " + producto.getNombre() 
                    + ", Descripción: " + producto.getDescripcion()
                    + ", Color: " + producto.getColor()
                    + ", Modelo: " + producto.getModelo()
                    + ", Precio: $" + producto.getPrecio()
                    + ", Identificador: " + producto.getIdentificador()+"\n"
                    +"------------------------------------------------------------------------------------------------------------------"
            
            );
        }
        System.out.println("");
        System.out.println("");
         Scanner myObj = new Scanner(System.in);
        System.out.println("""
                           \u00bfDesea volver al men\u00fa principal?
                           1- SI
                           2- NO, Salir
                           """);
            //Le pido al usuario un digito
            String seleccion = myObj.nextLine();
            int select = 0;
            //Me permite filtrar todo lo que no sea número
            if (seleccion.matches("^[0-9]*$")) {
                select = Integer.parseInt(seleccion);
            } else {
                select = 0;
            }
            switch (select) {
                case 1:
                    Menu(productos,clientes,pedidos);
                    break;
                case 2:
                    System.exit(0);
                default:
                    System.err.println("Opción no valida\n");
                    System.exit(0);
            }
        }
public static void MostrarClientes(List<Productos> productos,List<Cliente> clientes,List<Pedidos> pedidos) {
 System.out.println("Lista de Clientes:");
        for (Cliente cliente : clientes) {
            System.out.println("Nombre: " + cliente.getNombre() 
                    + ", Identificador: " + cliente.getIdentificador()+"\n"
                    +"------------------------------------------------------------------"
            );
        }
        System.out.println("");
        System.out.println("");
         Scanner myObj = new Scanner(System.in);
        System.out.println("""
                           \u00bfDesea volver al men\u00fa principal?
                           1- SI
                           2- NO, Salir
                           """);
            //Le pido al usuario un digito
            String seleccion = myObj.nextLine();
            int select = 0;
            //Me permite filtrar todo lo que no sea número
            if (seleccion.matches("^[0-9]*$")) {
                select = Integer.parseInt(seleccion);
            } else {
                select = 0;
            }
            switch (select) {
                case 1:
                    Menu(productos,clientes,pedidos);
                    break;
                case 2:
                    System.exit(0);
                default:
                    System.err.println("Opción no valida\n");
                    System.exit(0);
            }
        }
public static void agregarPedidos(List<Productos> productos,List<Cliente> clientes,List<Pedidos> pedidos) {
    
//SE TIENE QUE CREAR UN IDENTIFICADOR UNICO PARA LOS PEDIDOS--------------------------------------
        Scanner cli = new Scanner(System.in);
        System.out.print("Por favor, Ingresa el ID del pedido \n");
        while (!cli.hasNextInt()) {
            System.out.println("¡Error! Debes ingresar un número entero.");
            System.out.print("Por favor, intenta nuevamente: ");
            cli.next();
        }
        int identificadorunico = cli.nextInt();
//SE BUSCA EL CLIENTE-----------------------------------------------------------------------------
        String nombreCli = "";
        int identificaCliente = 0;
        int m = 0;
        while(m == 0){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Por favor, ingresa el número IDENTIFICADOR del cliente \n");
        while (!scanner.hasNextInt()) {
            System.out.println("¡Error! Debes ingresar un número entero.");
            System.out.print("Por favor, intenta nuevamente: ");
            scanner.next();
        }
        int idcliente = scanner.nextInt();
        if (clientes.size()!=0){
                for (int x = 0; x < clientes.size(); x++) {
                    if (clientes.get(x).getIdentificador()==idcliente){
                        System.out.println("Se ha encontrado el cliente -> "
                                +clientes.get(x).getNombre()+" <- con éxito \n");
//SE AGREGAN LOS VALORES A LAS VARIABLES----------------------------------------------------------
                        identificaCliente = clientes.get(x).getIdentificador();
                        nombreCli = clientes.get(x).getNombre();
//SE CAMBIA EL VALOR DE M PARA QUE SALGA DEL CICLO WHILE------------------------------------------
                         m=m+1; 
                    }
                    
                }
            }
        if(m != 1){
            System.out.println("No se encontró el cliente indicado \n");
        }
        }  
//SE BUSCA EL PRIMER PRODUCTO---------------------------------------------------------------------
        String nombreProd = "";
        int identificadorProducto = 0;
        int cantidadSolicitada = 0;
        int precioProducto1 = 0;
        int k = 0;
        while(k == 0){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Por favor, ingresa el número IDENTIFICADOR del Producto \n");
        while (!scanner.hasNextInt()) {
            System.out.println("¡Error! Debes ingresar un número entero.");
            System.out.print("Por favor, intenta nuevamente: ");
            scanner.next();
        }
        int idproducto = scanner.nextInt();
        if (productos.size()!=0){
                for (int j = 0; j < productos.size(); j++) {
                    if (productos.get(j).getIdentificador()==idproducto){
                        System.out.println("Se ha encontrado el Producto: "+productos.get(j).getNombre()+
                                " Descripción: " +productos.get(j).getDescripcion()+"\n");
// SE HACE LA CONSULTA DE LA CANTIDAD DE PRODUCTOS QUE DESEAN----------------------------------------                    
                          Scanner CANT = new Scanner(System.in);
                            System.out.print("Por favor, Ingresa la cantidad deseada del producto: " 
                                    +productos.get(j).getNombre()+"\n");
                            while (!CANT.hasNextInt()) {
                                System.out.println("¡Error! Debes ingresar un número entero.");
                                System.out.print("Por favor, intenta nuevamente: \n");
                                CANT.next();
                            }
                            int Cantid = CANT.nextInt();
                            cantidadSolicitada = Cantid;
// SE AGREGAN LOS VALORES A LAS VARIABLES-------------------------------------------------------------
                        nombreProd = productos.get(j).getNombre();
                        identificadorProducto = productos.get(j).getIdentificador();
                        precioProducto1 = productos.get(j).getPrecio();
                         k=k+1; 
                    }
                    
                }
            }
        if(k != 1){
            System.out.println("No se encontró el producto indicado \n");
        }
        }  
//SE HACE LA CONSULTA PARA AGREGAR UN PRODUCTO 2------------------------------------------------------
            Scanner myObj = new Scanner(System.in);
            System.out.println("""
                               \u00bfDesea agregar un nuevo producto?
                               1- SI 
                               2- NO 
                               3- Salir""");
            String seleccio = myObj.nextLine();
            int select = 0;
            if (seleccio.matches("^[0-9]*$")) {
                select = Integer.parseInt(seleccio);
            } else {
                select = 0;
            }
            switch (select) {
// SOLO SERÁ POSIBLE AGREGAR 2 PRODUCTOS AL PEDIDO---------------------------------------------------
                case 1:
                    String nombreProd2 = "";
                    int identificadorProducto2 = 0;
                    int cantidadSolicitada2 = 0;
                    int precioProducto2 = 0;
                    int l = 0;
                    int precioindividual2=0;
                       while(l == 0){
                        Scanner scanner = new Scanner(System.in);
                        System.out.print("Por favor, ingresa el número IDENTIFICADOR del nuevo producto \n");
                        while (!scanner.hasNextInt()) {
                            System.out.println("¡Error! Debes ingresar un número entero.");
                            System.out.print("Por favor, intenta nuevamente: ");
                            scanner.next();
                        }
                    int idproducto = scanner.nextInt();
                if (productos.size()!=0){
                        for (int j = 0; j < productos.size(); j++) {
                            if (productos.get(j).getIdentificador()==idproducto){
                                System.out.println("Se ha encontrado el Producto: "+productos.get(j).getNombre()+
                                        " Descripción: " +productos.get(j).getDescripcion()+"\n");
// SE HACE LA CONSULTA DE LA CANTIDAD DE PRODUCTOS QUE DESEAN----------------------------------------                    
                                  Scanner CANT = new Scanner(System.in);
                                    System.out.print("Por favor, Ingresa la cantidad deseada del producto: " 
                                            +productos.get(j).getNombre()+"\n");
                                    while (!CANT.hasNextInt()) {
                                        System.out.println("¡Error! Debes ingresar un número entero.");
                                        System.out.print("Por favor, intenta nuevamente: \n");
                                        CANT.next();
                                    }
                            int Cantid = CANT.nextInt();
                            cantidadSolicitada2 = Cantid;
// SE AGREGAN LOS VALORES A LAS VARIABLES-------------------------------------------------------------
                        nombreProd2 = productos.get(j).getNombre();
                        identificadorProducto2 = productos.get(j).getIdentificador();
                        precioProducto2 = productos.get(j).getPrecio();
                         l=l+1; 
                    }
                    
                }
            }
        if(l != 1){
            System.out.println("No se encontró el producto indicado \n");
        }
        } 
//SE GUARDA EL PEDIDO--------------------------------------------------------------------------------- 
                       
        Scanner scanner2 = new Scanner(System.in);
        System.out.print("Por favor, Ingrese la Dirección de Entrega \n\n");
        String DireccionEntrega2 = scanner2.nextLine();
        int preciototal2 = (precioProducto1 * cantidadSolicitada) + (precioProducto2 * cantidadSolicitada2);            
        pedidos.add(new Pedidos(identificadorunico,identificadorProducto,
                        identificaCliente,cantidadSolicitada,1,nombreCli, nombreProd, 
                        DireccionEntrega2,nombreProd2, cantidadSolicitada2,
                       preciototal2,identificadorProducto2,
                          precioProducto1,precioProducto2));
        
//SE HACE LA MUESTRA DEL PEDIDO CUANDO SON 2 PRODUCTOS-------------------------------------------------
        
                System.out.print("\033[H\033[2J");
                System.out.print("\n---SE HA AÑADIDO EL PEDIDO CON ÉXITO--- \n");
                System.out.print("----------------RESUMEN---------------- \n\n");
                System.out.print("Su Número de pedido es: "+ identificadorunico + "\n");
                System.out.print("--------------------------------------------------- \n");
                System.out.print("El ID del producto 1 es: "+ identificadorProducto + "\n");
                System.out.print("El Nombre del Producto 1 es: "+ nombreProd + "\n");
                System.out.print("El Costo del Producto 1 es: $"+ precioProducto1 + "\n");
                System.out.print("La Cantidad solicitada del producto 1 es: "+ cantidadSolicitada + "\n");
                System.out.print("--------------------------------------------------- \n");
                System.out.print("El ID del producto 2 es: "+ identificadorProducto2 + "\n");
                System.out.print("El Nombre del Producto 2 es: "+ nombreProd2 + "\n");
                System.out.print("El Costo del Producto 2 es: $"+ precioProducto2 + "\n");
                System.out.print("La Cantidad solicitada del producto 2 es: "+ cantidadSolicitada2 + "\n");
                System.out.print("--------------------------------------------------- \n");
                 System.out.print("El ID del Cliente es: "+ identificaCliente + "\n");
                System.out.print("El Nombre del Cliente es: "+ nombreCli + "\n");
                System.out.print("El Costo total del Pedido es: $"+ preciototal2 + "\n");
                System.out.print("La Dirección de Entrega es: "+ DireccionEntrega2 + "\n\n");
                  Scanner myObj3 = new Scanner(System.in);
                  
// CONSULTA PARA VOLVER AL MENÚ PRINCIPAL------------------------------------------------------------
        System.out.println("""
                           \u00bfDesea volver al men\u00fa principal?
                           1- SI
                           2- NO, Salir
                           """);
            String seleccion4 = myObj3.nextLine();
            int select3 = 0;
            //Me permite filtrar todo lo que no sea número
            if (seleccion4.matches("^[0-9]*$")) {
                select3 = Integer.parseInt(seleccion4);
            } else {
                select3 = 0;
            }
            switch (select3) {
                case 1:
                    Menu(productos,clientes,pedidos);
                    break;
                case 2:
                    System.exit(0);
                default:
                    System.err.println("Opción no valida\n");
                    System.exit(0);
            }
                    break;
                    
//CUANDO SOLO DESEA INGRESAR 1 PRODUCTO---------------------------------------------------------------
                    
                case 2:
         Scanner scanner = new Scanner(System.in);
        System.out.print("Por favor, Ingrese la Dirección de Entrega \n\n");
        String DireccionEntrega = scanner.nextLine();
        int preciototal = precioProducto1 * cantidadSolicitada;

                pedidos.add(new Pedidos(identificadorunico,identificadorProducto, identificaCliente,
            cantidadSolicitada,1,nombreCli, nombreProd, 
                        DireccionEntrega,preciototal,precioProducto1));
        
//SE HACE LA MUESTRA DEL PEDIDO CUANDO SON 2 PRODUCTOS-------------------------------------------------
                        
                System.out.print("\033[H\033[2J");
                System.out.print("\n---SE HA AÑADIDO EL PEDIDO CON ÉXITO--- \n");
                System.out.print("----------------RESUMEN---------------- \n\n");
                System.out.print("Su Número de pedido es: "+ identificadorunico + "\n");
                System.out.print("--------------------------------------------------- \n");
                System.out.print("El ID del producto es: "+ identificadorProducto + "\n");
                System.out.print("El Nombre del Producto es: "+ nombreProd + "\n");
                System.out.print("El Costo del Producto es: $"+ precioProducto1 + "\n");
                System.out.print("La Cantidad solicitada es: "+ cantidadSolicitada + "\n");
                System.out.print("--------------------------------------------------- \n");
                System.out.print("El ID del Cliente es: "+ identificaCliente + "\n");
                System.out.print("El Nombre del Cliente es: "+ nombreCli + "\n");
                System.out.print("El Costo total del Pedido es: $"+ preciototal + "\n");
                System.out.print("La Dirección de Entrega es: "+ DireccionEntrega + "\n\n");
                
// CONSULTA PARA VOLVER AL MENÚ PRINCIPAL------------------------------------------------------------

                  Scanner myObj2 = new Scanner(System.in);
            System.out.println("""
                               \u00bfDesea volver al men\u00fa principal?
                               1- SI
                               2- NO, Salir
                               """);
            String seleccion3 = myObj2.nextLine();
            int select2 = 0;
            if (seleccion3.matches("^[0-9]*$")) {
                select2 = Integer.parseInt(seleccion3);
            } else {
                select2 = 0;
            }
            switch (select2) {
                case 1:
                    Menu(productos,clientes,pedidos);
                    break;
                case 2:
                    System.exit(0);
                default:
                    System.err.println("Opción no valida\n");
                    System.exit(0);
            }
                    break;
                case 3:
                    System.exit(0);
                default:
                    System.err.println("Opción no valida\n");
            }
    }
public static void MostrarPedidos(List<Productos> productos,List<Pedidos> pedidos,List<Cliente> clientes) {

//RECORRE LA LISTA DE PEDIDOS-------------------------------------------------------------------------

        System.out.println("----------------LISTA DE PEDIDOS----------------");
        for (Pedidos pedido : pedidos) {
            System.out.println("Identificador: " + pedido.getIdentificador()+"\n"
                    + "Nombre Cliente: " + pedido.getNombreCliente()+"\n"
                    + "Nombre producto 1: " + pedido.getNombreProducto()+"\n"
                    + "Cantidad Prod 1: " + pedido.getCantidad()+"\n"
                    + "Nombre Producto 2: " + pedido.getProd2()+"\n"
                    + "Cantidad Prod 2: " + pedido.getCantidad2()+"\n"
                    + "Precio Total: " + pedido.getPrecioTotal()+"\n"
                    + "Dirección: " + pedido.getDireccion()+"\n"
                    +"-------------------------------------------------------------"
            );
        }
        
// DESEA VOLVER AL MENU PRINCIPAL----------------------------------------------------------------------

        System.out.println("");
        System.out.println("");
         Scanner myObj = new Scanner(System.in);
        System.out.println("""
                           \u00bfDesea volver al men\u00fa principal?
                           1- SI
                           2- NO, Salir
                           """);
            
            String seleccion = myObj.nextLine();
            int select = 0;
            if (seleccion.matches("^[0-9]*$")) {
                select = Integer.parseInt(seleccion);
            } else {
                select = 0;
            }
            switch (select) {
                case 1:
                    Menu(productos,clientes,pedidos);
                    break;
                case 2:
                    System.exit(0);
                default:
                    System.err.println("Opción no valida\n");
                    System.exit(0);
            }
        }
public static void eliminarPedido(List<Productos> productos,List<Pedidos> pedidos,List<Cliente> clientes){

//SE CONSULTA EL IDENTIFICADOR DEL PEDIDO PARA ELIMINARLO----------------------------------------------

        Scanner scanner = new Scanner(System.in);
        System.out.print("Por favor, ingresa el número identificador del Pedido a Eliminar \n");
        while (!scanner.hasNextInt()) {
            System.out.println("¡Error! Debes ingresar un número entero.");
            System.out.print("Por favor, intenta nuevamente: ");
            scanner.next();
        }
        int identificador = scanner.nextInt();

//SE BUSCA EL PEDIDO Y SE PROCEDE A ELIMINAR------------------------------------------------------------

    for (int i = 0; i < pedidos.size(); i++) {
        if (identificador == pedidos.get(i).getIdentificador()){
            pedidos.remove(i);
            System.out.println("¡SI! Se eliminó el pedido con éxito.");
        }else{
            System.out.println("¡Error! El Pedido no existe");
            
        }
        
    }

//MENU PARA VOLVER AL MENU PRINCIPAL-------------------------------------------------------------------

    Scanner myObj3 = new Scanner(System.in);
        System.out.println("""
                           \u00bfDesea volver al men\u00fa principal?
                           1- SI
                           2- NO, Salir
                           """);
            //Le pido al usuario un digito
            String seleccion4 = myObj3.nextLine();
            int select3 = 0;
            //Me permite filtrar todo lo que no sea número
            if (seleccion4.matches("^[0-9]*$")) {
                select3 = Integer.parseInt(seleccion4);
            } else {
                select3 = 0;
            }
            switch (select3) {
                case 1:
                    Menu(productos,clientes,pedidos);
                    break;
                case 2:
                    System.exit(0);
                default:
                    System.err.println("Opción no valida\n");
                    System.exit(0);
            }
    

}
public static void modificarPedidos(List<Productos> productos,List<Pedidos> pedidos,List<Cliente> clientes){
 
//SE BUSCA EL PEDIDO POR MEDIO DEL ID-----------------------------------------------------------------

    Scanner scanner = new Scanner(System.in);
        System.out.print("Por favor, ingresa el número IDENTIFICADOR del Pedido a Modificar \n");
        while (!scanner.hasNextInt()) {
            System.out.println("¡Error! Debes ingresar un número entero.");
            System.out.print("Por favor, intenta nuevamente: \n");
            scanner.next();
        }
        int identificador = scanner.nextInt();
        for (int i = 0; i < pedidos.size(); i++) {
        if (pedidos.get(i).getIdentificador()==identificador){
            System.out.print("¡¡Se encontró el pedido que desea modificar!! \n\n");
 //CONSULTA LO QUE SE DESEA MODIFICAR----------------------------------------------------------------
            Scanner myObj3 = new Scanner(System.in);
            System.out.println("""
                               Digite la opci\u00f3n de lo que desea modificar del pedido
                               
                               1- Cantidad producto 1
                               2- Cantidad producto 2
                               3- Direcci\u00f3n
                               """);
            String seleccion4 = myObj3.nextLine();
            int select3 = 0;
            //Me permite filtrar todo lo que no sea número
            if (seleccion4.matches("^[0-9]*$")) {
                select3 = Integer.parseInt(seleccion4);
            } else {
                select3 = 0;
            }
            switch (select3) {
                
//MODIFICACIÓN DE LA CANTIDAD DEL PRODUCTO 1----------------------------------------------------------
                
                case 1:
                    
        Scanner scan= new Scanner(System.in);
        System.out.print("Por favor, Ingrese la cantidad nueva del producto: "+
                pedidos.get(i).getNombreProducto()+"\n");
        while (!scan.hasNextInt()) {
            System.out.println("¡Error! Debes ingresar un número entero.");
            System.out.print("Por favor, intenta nuevamente: ");
            scan.next();
        }
        int nuevcantidad1 = scan.nextInt();
        updatePedidoCant1(pedidos,identificador,nuevcantidad1,clientes,productos);
                    
                break;
                case 2:
                          
        Scanner scan2= new Scanner(System.in);
        System.out.print("Por favor, Ingrese la cantidad nueva del producto: "+ pedidos.get(i).getProd2()+"\n");

        int nuevcantidad2 = scan2.nextInt();
        updatePedidoCant2(pedidos,identificador,nuevcantidad2,clientes,productos);
                      break;
                case 3:
                                 
        Scanner scan3= new Scanner(System.in);
        System.out.print("Por favor, Ingrese la nueva Direccion a Registrar: \n");
        String nuevaDireccion = scan3.next();
        updatePedidoDir(pedidos,identificador,nuevaDireccion,clientes,productos);
                      
                      break;
                default:
                    System.err.println("Opción no valida\n");
                    System.exit(0);
            }
            
             
        }else{ 
             System.out.print("");
        }
     
        
    }
    
}
static void updatePedidoCant1(List<Pedidos> listaPedidos, int idActualizar, int nuevacantidad,List<Cliente> clientes,List<Productos> productos) {
        int nuevoprecio1 = 0;
        int nuevoprecio2 = 0;
        int total = 0;
    for (Pedidos pedido : listaPedidos) {
            if (pedido.getIdentificador() == idActualizar) {
                nuevoprecio1 = pedido.getPrecio1() * nuevacantidad;
                nuevoprecio2 = pedido.getPrecio2() * pedido.getCantidad2();
                total = nuevoprecio1 + nuevoprecio2;
                pedido.setNuevoPrecioTotal(total);
                pedido.setNuevaCantidad(nuevacantidad);
                break; 
            }
        }
        System.out.println("¡Se ha actualizado con éxito!\n\n");
          Scanner myObj = new Scanner(System.in);
        System.out.println(
                     "¿Desea volver al menú principal?\n"
                    + "1- SI\n"
                    + "2- NO, Salir\n");
            //Le pido al usuario un digito
            String seleccion = myObj.nextLine();
            int select = 0;
            //Me permite filtrar todo lo que no sea número
            if (seleccion.matches("^[0-9]*$")) {
                select = Integer.parseInt(seleccion);
            } else {
                select = 0;
            }
            switch (select) {
                case 1:
                    Menu(productos,clientes,listaPedidos);
                    break;
                case 2:
                    System.exit(0);
                default:
                    System.err.println("Opción no valida\n");
                    System.exit(0);
            }
    }
static void updatePedidoCant2(List<Pedidos> listaPedidos, int idActualizar, int nuevacantidad,List<Cliente> clientes,List<Productos> productos) {
      
        int nuevoprecio1 = 0;
        int nuevoprecio2 = 0;
        int total = 0;
    
        for (Pedidos pedido : listaPedidos) {
            if (pedido.getIdentificador() == idActualizar) {
                nuevoprecio1 = pedido.getPrecio1() * pedido.getCantidad();
                nuevoprecio2 = pedido.getPrecio2() * nuevacantidad;
                total = nuevoprecio1 + nuevoprecio2;
                pedido.setNuevoPrecioTotal(total);
                pedido.setNuevaCantidad2(nuevacantidad);
                break; 
            }
        }
        System.out.println("¡Se ha actualizado con éxito!\n\n");
          Scanner myObj = new Scanner(System.in);
        System.out.println(
                     "¿Desea volver al menú principal?\n"
                    + "1- SI\n"
                    + "2- NO, Salir\n");
            //Le pido al usuario un digito
            String seleccion = myObj.nextLine();
            int select = 0;
            //Me permite filtrar todo lo que no sea número
            if (seleccion.matches("^[0-9]*$")) {
                select = Integer.parseInt(seleccion);
            } else {
                select = 0;
            }
            switch (select) {
                case 1:
                    Menu(productos,clientes,listaPedidos);
                    break;
                case 2:
                    System.exit(0);
                default:
                    System.err.println("Opción no valida\n");
                    System.exit(0);
            }
    }
static void updatePedidoDir(List<Pedidos> listaPedidos, int idActualizar, String nuevaDireccion,List<Cliente> clientes,List<Productos> productos) {
        for (Pedidos pedido : listaPedidos) {
            if (pedido.getIdentificador() == idActualizar) {
                pedido.setNuevaDireccion(nuevaDireccion);
                break; 
            }
        }
        System.out.println("¡Se ha actualizado con éxito!\n\n");
          Scanner myObj = new Scanner(System.in);
        System.out.println(
                     "¿Desea volver al menú principal?\n"
                    + "1- SI\n"
                    + "2- NO, Salir\n");
            //Le pido al usuario un digito
            String seleccion = myObj.nextLine();
            int select = 0;
            //Me permite filtrar todo lo que no sea número
            if (seleccion.matches("^[0-9]*$")) {
                select = Integer.parseInt(seleccion);
            } else {
                select = 0;
            }
            switch (select) {
                case 1:
                    Menu(productos,clientes,listaPedidos);
                    break;
                case 2:
                    System.exit(0);
                default:
                    System.err.println("Opción no valida\n");
                    System.exit(0);
            }
    }
}