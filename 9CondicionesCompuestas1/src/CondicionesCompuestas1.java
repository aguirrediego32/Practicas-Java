import java.util.Scanner;

public class CondicionesCompuestas1 {
	public static void main(String[] ar) {
		Scanner teclado=new Scanner(System.in);
		int día,mes,año;
		System.out.print("Ingrese día:");
		día=teclado.nextInt();
		System.out.print("Ingrese mes:");
		mes=teclado.nextInt();
		System.out.print("Ingrese año:");
		año=teclado.nextInt();
		if(día==25 && mes==12) {
			System.out.print("Es navidad!");
		}else {
			System.out.print("No es navidad");
		}
	}
}
