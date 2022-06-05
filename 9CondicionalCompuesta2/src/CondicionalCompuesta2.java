import java.util.Scanner;

public class CondicionalCompuesta2 {
	public static void main(String[] ar) {
		Scanner teclado=new Scanner(System.in);
		int valor1,valor2,valor3;
		int resultado;
		System.out.print("Ingrese el primer valor:");
		valor1=teclado.nextInt();
		System.out.print("Ingrese el segundo valor:");
		valor2=teclado.nextInt();
		System.out.print("Ingrese el tercer valor:");
		valor3=teclado.nextInt();
		if(valor1==valor2 && valor1==valor3) {
			resultado=(valor1+valor2)*valor3;
			System.out.print(resultado);
		}
	}
}
