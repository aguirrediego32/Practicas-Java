import java.util.Scanner;

public class EstructuraRepetitivaFor1 {
	public static void main(String[] ar) {
		Scanner teclado=new Scanner(System.in);
		int valor,suma,promedio,f;
		suma=0;
		promedio=0;
		for(f=1;f<=10;f++) {
			System.out.print("Ingrese valor:");
			valor=teclado.nextInt();
			suma=suma+valor;
		}
		 promedio=suma/10;
		 System.out.print("La suma es:");
		 System.out.println(suma);
		 System.out.print("El promedio es:");
		 System.out.print(promedio);
	}
}
