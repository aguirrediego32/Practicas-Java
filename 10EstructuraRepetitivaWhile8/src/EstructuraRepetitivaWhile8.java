import java.util.Scanner;

public class EstructuraRepetitivaWhile8 {
	public static void main(String[] ar) {
		Scanner teclado=new Scanner(System.in);
		int termino,contador;
		termino=11;
		contador=1;
		while(contador<=25) {
			termino=termino+11;
			System.out.print(" - ");
			System.out.print(termino);
			contador=contador+1;
		}
	}
}
