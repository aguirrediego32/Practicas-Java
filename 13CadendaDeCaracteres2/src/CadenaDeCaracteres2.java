import java.util.Scanner;

public class CadenaDeCaracteres2 {
	public static void main(String[] ar) {
		Scanner teclado=new Scanner(System.in);
		String nomApellido1,nomApellido2;
		int edad1,edad2;
		System.out.print("Ingrese el nombre y apellido:");
		nomApellido1=teclado.nextLine();
		System.out.print("Ingrese la edad:");
		edad1=teclado.nextInt();
		System.out.print("Ingrese el nombre y apellido:");
		teclado.nextLine();
		nomApellido2=teclado.nextLine();
		System.out.print("Ingrese la edad:");
		edad2=teclado.nextInt();
		if(edad1 > edad2) {
			System.out.print("La persona con mayor edad es:");
			System.out.print(nomApellido1);
		}else {
			System.out.print("La persona con mayor edad es:");
			System.out.print(nomApellido2);
		}
	}
}
