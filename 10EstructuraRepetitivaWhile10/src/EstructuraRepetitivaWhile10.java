import java.util.Scanner;

public class EstructuraRepetitivaWhile10 {
	public static void main(String[] ar) {
		Scanner teclado=new Scanner(System.in);
		int valor,contador,suma1,suma2;
		contador=1;
		suma1=0;
		while(contador<=15) {
			System.out.print("Ingrese los valores lista 1:");
			valor=teclado.nextInt();
			suma1=suma1+valor;
			contador=contador+1;
		}suma2=0;
		 contador=1;
		while(contador<=15) {
			System.out.print("Ingrese los valores lista 2:");
			valor=teclado.nextInt();
			suma2=suma2+valor;
			contador=contador+1;			
		}if(suma1 > suma2) {
			System.out.print("Lista 1 mayor");
		}else {
			if(suma1 < suma2) {
				System.out.print("Lista 2 mayor");
			}else {
				System.out.print("Listas  iguales");
			}
		}
	}
}
