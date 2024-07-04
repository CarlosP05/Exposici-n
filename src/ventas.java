public class ventas {
public String Name;
private double precio;
private int cantidad;


public ventas(String Name, double precio, int cantidad){

this.Name = Name;
this.cantidad = cantidad;
this.precio = precio;
}

public double Getprecio(){
    return precio;
 }
 public int Getcantidad(){
    return cantidad;
 }
 

public void MostrarInfo(){
   System.out.println("nombre del producto: "+ Name);
    System.out.println("Precio: "+Getprecio());
    System.out.println("Cantidad: "+Getcantidad());
    
}
 }

