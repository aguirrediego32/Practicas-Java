import java.util.Scanner;

public class EstructuraRepetitivaFor4 {
	public static void main(String[] ar) {
		Scanner teclado=new Scanner(System.in);
		int cantidad,contador,valor,f;
		System.out.print("Ingrese la cantidad a clasificar:");
		cantidad=teclado.nextInt();
		contador=0;
		for(f=1;f<=cantidad;f++) {
			System.out.print("Ingrese valor:");
			valor=teclado.nextInt();
			if(valor >=1000) {
				contador=contador + 1;
			}
		}System.out.print("La cantidad de valores mayores o iguales a 1000 son:");
		 System.out.print(contador);
	}
}
