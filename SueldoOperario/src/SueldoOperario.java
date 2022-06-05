import java.util.Scanner;

public class SueldoOperario {
	
	public static void main(String[]ar) {
		Scanner teclado=new Scanner(System.in);
		int horasTrabajadas;
		float pagoPorHora;
		float sueldo;
		System.out.print("ingrese horas:");
		horasTrabajadas=teclado.nextInt();
		System.out.print("ingresa el valor de la hora:");
		pagoPorHora=teclado.nextFloat();
		sueldo=horasTrabajadas * pagoPorHora;
		System.out.print("El empleado gana:");
		System.out.println(sueldo);
	}
}
