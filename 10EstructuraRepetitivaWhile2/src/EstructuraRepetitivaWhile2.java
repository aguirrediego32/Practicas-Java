import java.util.Scanner;

public class EstructuraRepetitivaWhile2 {
	public static void main(String[] ar) {
		Scanner teclado=new Scanner(System.in);
		int valor,x;
		System.out.print("Ingrese valor:");
		valor=teclado.nextInt();
		x=1;
		while(x <= valor ) {
			System.out.print(x);
			System.out.print(" - ");
			x= x + 1;
		}
	}
}
