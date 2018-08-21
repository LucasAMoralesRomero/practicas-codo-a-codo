/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lucas A. Morales Romero
 */
public class Celular {
    String fabricante;
    String modelo;
    String sistemaOperativo;
    String pantalla;
    String camaraDelantera;
    String camaraTrasera;
    String cpu;
    String gpu;
    int precio;
 
 //el metodo Celular permite cargar los atributos de la clase    
 public Celular(String fabricante, String modelo, String sistemaOperativo, String pantalla, String camaraDelantera, String camaraTrasera, String cpu, String gpu, int precio ){
    this.fabricante = fabricante;
    this.modelo = modelo;
    this.sistemaOperativo = sistemaOperativo;
    this.pantalla = pantalla;
    this.camaraDelantera = camaraDelantera;
    this.camaraTrasera = camaraTrasera;
    this.cpu = cpu;
    this.gpu = gpu;
    this.precio = precio;
  }

 //el metodo MostrarDatos permite mostrar los atributos de la clase
 public void MostrarDatos (){
    System.out.println("Fabricante: " + this.fabricante);
    System.out.println("Modelo: " + this.modelo);
    System.out.println("Sistema Operativo: " + this.sistemaOperativo);
    System.out.println("Pantalla: " + this.pantalla);
    System.out.println("Camara Delantera: " + this.camaraDelantera);
    System.out.println("Camara Trasera: " + this.camaraTrasera);
    System.out.println("CPU del Celular: " + this.cpu);
    System.out.println("GPU del Celular: " + this.gpu);
    System.out.println("Precio del celular: " + this.precio);
 }
 
 //El metodo CalcularCuota permite calcular el precio de el celular en 1 3 6 12 cuotas con tarjetas MasterCard
 //datos obtenidos del simulador de FirstData https://www.firstdata.com.ar/simulador.html
 public void CalcularCuota(int precio, int cuota){
     double precioFinanciado;
     double precioCuota;
     switch(cuota)
     {
     case 1:
     System.out.println("El valor del celular en un pago es: " + precio);
     break;
     
     case 3:
     precioFinanciado = precio * 1.1079;
     precioCuota = precioFinanciado / cuota;
     System.out.println("El precio del producto financiado es: " + precioFinanciado + " a pagar en " + cuota + " cuotas de: " + precioCuota);
     break;
         
     case 6:
     precioFinanciado = precio * 1.1985;
     precioCuota = precioFinanciado / cuota;
     System.out.println("El precio del producto financiado es: " + precioFinanciado + " a pagar en " + cuota + " cuotas de: " + precioCuota);
     break;
     
     case 12:
     precioFinanciado = precio * 1.4326;
     precioCuota = precioFinanciado / cuota;
     System.out.println("El precio del producto financiado es: " + precioFinanciado + " a pagar en " + cuota + " cuotas de: " + precioCuota);
     break;
         
     default:
     System.out.println("Error: Se calculan cuotas en 1,3,6,12 con tarjetas MasterCard ");
     break;
     }
 }
public static void main(String[] args){
Celular celular1 = new Celular("Xiaomi", "Mi 8", "Android", "6.21 AMOLED display", "Camara Delatentera 20 Mpx", "Camara Trasera dual de 12 Mpx", "CPU Qualcomm Snapdragon 845", "GPU Qualcomm Adreno 630 @ 710 mHz", 17623);
celular1.MostrarDatos();
celular1.CalcularCuota(celular1.precio, 12);
}
 
}
