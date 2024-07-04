import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static String Name;
    public static double precio;
    public static int cantidad;
    public static double Total;

    public static Pedidos newpedidos;
    public static Scanner leer = new Scanner(System.in);
    public static ArrayList<Pedidos> lista = new ArrayList<Pedidos>();

    public static void main(String[] args) throws Exception {
       
        boolean Salir = true;
        

        do {
            System.out.println("Bienvenido al sistema del restaurante elija las siguientes opciones ");
            System.out.println("1- Agragar pedido");
            System.out.println("2- mostrar");
            System.out.println("3- eliminar");
            System.out.println("4- Salir");
            int opc = leer.nextInt();
            leer.nextLine();
            switch (opc) {
                case 1:
                Addpedido();              

                    break;
                case 2:
                MostrarCatalogo();


                    break;

                case 3:
                Eliminarlista();
                
                    break;

                case 4:
                System.out.println("gracias por utilizar el programa");
                Salir = false;
                    break;
                default:
                    break;
            }
        } while (Salir);
    }
    public static void Addpedido(){
        //Agregamos un nuevo producto, pidiendole los siguientes datos 
        System.out.println("Ingrese el nombre del producto: ");
        System.out.println("Nombre del pedido: ");
        String Name = leer.nextLine();
        System.out.println("Ingrese el precio del pedido: ");
        double precio = leer.nextDouble();
        System.out.println("Ingrese la cantidad de pedidos: ");
        int cantidad = leer.nextInt();
        Pedidos newPedido = new Pedidos(Name, precio, cantidad);
        lista.add(newPedido);
        Total= precio * cantidad;

        
    }
    
    public static void MostrarCatalogo(){
        //Para mostrar el pedido lo recorremos con un for e
        for(Pedidos pedidos : lista){
            System.out.println("Nombre del producto: " + pedidos.Name);
            System.out.println("Precio: " + pedidos.Getprecio());
            System.out.println("Cantidad: " + pedidos.Getcantidad());
            System.out.println(" Total de su pedido= "+ Total );
            System.out.println("=====================================");
        }
    }
    public static void Eliminarlista(){
        System.out.println("Ingrese el nombre del producto que desea eliminar:");
        String nombre = leer.nextLine();
        Pedidos pedidoAEliminar = null;
        //null tiene el propocito de buscar un producto en una lista

        for (Pedidos pedido : lista) {
            // Si el nombre del pedido es correcto entonces elimina el pedido
            if (pedido.Name.equals(nombre)) {
                pedidoAEliminar = pedido;
                break;
            }
        }

        if (pedidoAEliminar != null) {
            lista.remove(pedidoAEliminar);
            System.out.println("Pedido eliminado.");
        } else {
            System.out.println("Pedido no encontrado.");
        }
        }

}
