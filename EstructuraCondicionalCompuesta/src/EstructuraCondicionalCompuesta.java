import java.util.Scanner;
public class EstructuraCondicionalCompuesta {
	public static void main(String[]ar) {
		Scanner teclado=new Scanner(System.in);
		int valor1,valor2;
		System.out.print("Ingrese un valor:");
		valor1=teclado.nextInt();
		System.out.print("Ingrese un valor:");
		valor2=teclado.nextInt();
		if(valor1>valor2) {
				System.out.print(valor1);
		}else {
				System.out.print(valor2);
		}
	}	
}
