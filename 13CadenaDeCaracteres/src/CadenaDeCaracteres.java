import java.util.Scanner;

public class CadenaDeCaracteres {
	public static void main(String[] ar) {
		Scanner teclado=new Scanner(System.in);
		String nombre1,nombre2;
		int edad1,edad2;
		System.out.print("Ingrese el nombre de la primer persona:");
		nombre1=teclado.next();
		System.out.print("Ingrese la edad de la primer persona:");
		edad1=teclado.nextInt();
		System.out.print("Ingrese el nombre de la segunda persona:");
		nombre2=teclado.next();
		System.out.print("Ingrese la edad de la segunda persona:");
		edad2=teclado.nextInt();
		if(edad1 > edad2) {
			System.out.print("La persona de mayor edad es:");
			System.out.print(nombre1);
		}else {
			System.out.print("La persona de mayor edad es:");
			System.out.print(nombre2);
		}
	}
}
