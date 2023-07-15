/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.io.Serializable;

public class Tienda implements Serializable{
    private String nombre;
    private String ruc;
    private String direccion;
    
    private Cliente[] clientes;
    private Categoria[] categorias;
    private Producto[] productos;
    
    public Tienda(String nombre, String ruc, String direccion) {
       this.nombre = nombre;
        this.ruc = ruc;
        this.direccion = direccion;
        this.clientes = new Cliente[0];
        this.categorias = new Categoria[0];
        this.productos = new Producto[0];
    
    }
    
     public void agregarCliente(Cliente cliente) {
     Cliente[] nuevosClientes = new Cliente[clientes.length + 1];
        System.arraycopy(clientes, 0, nuevosClientes, 0, clientes.length);
        nuevosClientes[clientes.length] = cliente;
        clientes = nuevosClientes;
    
        }
    
     public void agregarCategoria(Categoria categoria) {
     Categoria[] nuevasCategorias = new Categoria[categorias.length + 1];
        System.arraycopy(categorias, 0, nuevasCategorias, 0, categorias.length);
        nuevasCategorias[categorias.length] = categoria;
        categorias = nuevasCategorias;
     }
    
     public void agregarProducto(Producto producto) {
    Producto[] nuevosProductos = new Producto[productos.length + 1];
        System.arraycopy(productos, 0, nuevosProductos, 0, productos.length);
        nuevosProductos[productos.length] = producto;
        productos = nuevosProductos;
           }
         
   public Producto[] buscarProductoPorCategoria(Categoria categoria) {
       Producto[] productosEnCategoria = new Producto[0];
        for (Producto producto : productos) {
            if (producto.getCategoria() == categoria) {
                Producto[] nuevosProductos = new Producto[productosEnCategoria.length + 1];
                System.arraycopy(productosEnCategoria, 0, nuevosProductos, 0, productosEnCategoria.length);
                nuevosProductos[productosEnCategoria.length] = producto;
                productosEnCategoria = nuevosProductos;
            }
        }
        return productosEnCategoria;
   }
   
   public Producto[] buscarProductoPorNombre(String nombre) {
              Producto[] productosConNombre = new Producto[0];
        for (Producto producto : productos) {
            if (producto.getNombre().equalsIgnoreCase(nombre)) {
                Producto[] nuevosProductos = new Producto[productosConNombre.length + 1];
                System.arraycopy(productosConNombre, 0, nuevosProductos, 0, productosConNombre.length);
                nuevosProductos[productosConNombre.length] = producto;
                productosConNombre = nuevosProductos;
            }
        }
        return productosConNombre;

   }
   
    public Persona autenticar(String email, String password) {
        
   for (Cliente cliente : clientes) {
            if (cliente.getEmail().equals(email) && cliente.getPassword().equals(password)) {
                return cliente;
            }
        }
        return null;
    }

    public void agregarVenta(Venta venta) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void agregarVenta(Venta venta) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
   
   }