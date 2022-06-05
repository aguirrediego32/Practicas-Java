package cliente;
import java.util.Scanner;

public class cliente {
	public static void main(String[] ar) {
		Scanner teclado=new Scanner(System.in);
		float precioArticulo;
		int cantidad;
		float abonar;
		System.out.print("Ingrese el precio del articulo:");
		precioArticulo=teclado.nextFloat();
		System.out.print("Ingrese la cantidad que lleva:");
		cantidad=teclado.nextInt();
		abonar=precioArticulo*cantidad;
		System.out.print("El precio total es:");
		System.out.print(abonar);
	}
}
