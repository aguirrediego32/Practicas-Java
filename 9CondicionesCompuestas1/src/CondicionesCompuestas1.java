import java.util.Scanner;

public class CondicionesCompuestas1 {
	public static void main(String[] ar) {
		Scanner teclado=new Scanner(System.in);
		int d�a,mes,a�o;
		System.out.print("Ingrese d�a:");
		d�a=teclado.nextInt();
		System.out.print("Ingrese mes:");
		mes=teclado.nextInt();
		System.out.print("Ingrese a�o:");
		a�o=teclado.nextInt();
		if(d�a==25 && mes==12) {
			System.out.print("Es navidad!");
		}else {
			System.out.print("No es navidad");
		}
	}
}
