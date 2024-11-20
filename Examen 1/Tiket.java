package xxx_Ejercicios_repaso_casa;

import java.util.Scanner;

public class Tiket{
	
	public static Scanner sc= new Scanner(System.in);
	public String nombreProducto;
	public int cantidad;
	public double precioUnidad;
	public int iva;
		public double esAlimentacion(){
		    System.out.println("Introduzca el tipo de alimento:");
		    System.out.println("1. Huevos");
		    System.out.println("2. Leche");
		    System.out.println("3. Pan");
		    System.out.println("4. Fruta");
		    System.out.println("5. Verdura");
		    System.out.println("6. Otros");
		    System.out.print("Opcion:");
		    int opcion2 = sc.nextInt();
		    sc.nextLine();
		    double precioTotal;
		
		    double precio=0;
		    System.out.println("Introduzca el nombre del producto:");
		        nombreProducto=sc.nextLine();
		    System.out.println("Introduzca la cantidad de productos:");
		        cantidad=sc.nextInt();
		    System.out.println("Introduzca el precio por unidad del producto:");
		        precioUnidad=sc.nextDouble();
		
		     if (opcion2 >= 1 && opcion2 <= 5) {
		        iva = 4;
		    } else if (opcion2 == 6) {
		        iva = 10;
		    } else{ 
		        System.out.println("Por favor, introduzca un número dentro del rango asignado. Intentelo de nuevo.");
		        return 0;
		    }
		    precioTotal = calcularPrecio(precioUnidad, cantidad, iva);
		    ticketFinal(nombreProducto, cantidad, precioUnidad, precioTotal); 
		    return 0;
		}
		public double calcularPrecio(double precioUnidad, int cantidad, int iva) {
		    return precioUnidad * cantidad * (1 + iva / 100.0);
		}
		public void ticketFinal(String nombreProducto, int cantidad, double precioUnidad, double precioTotal) {
		System.out.println("Factura");
		System.out.println("--------------------");
		System.out.println("Articulo:   " + nombreProducto);
		System.out.println("Precio:     " + precioUnidad + "/unidad");
		System.out.println("Cantidad:   " + cantidad);
		System.out.println("IVA:        " + iva + "%");
		System.out.println("--------------------");
		System.out.println("Total con IVA:  " + precioTotal);
		}
		
		public static void main(String[] args) {
		    Tiket app= new Tiket();
		    System.out.println("Introduzca el tipo de producto:");
		    System.out.println("1. Alimentacion");
		    System.out.println("2. Electronica");
		    System.out.println("3. Farmacia");
		    System.out.println("4. Moda");
		    System.out.print("Opcion:");
		    int opcion1=sc.nextInt();
		    if(opcion1==1){
		        app.esAlimentacion();
		    }
		
		}

}