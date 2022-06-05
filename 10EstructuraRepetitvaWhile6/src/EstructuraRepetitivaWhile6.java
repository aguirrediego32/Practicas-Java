import java.util.Scanner;

public class EstructuraRepetitivaWhile6 {
	static public void main(String[] ar) {
		Scanner teclado=new Scanner(System.in);
		int contador, n;
		float altura,promedio,suma;
		System.out.print("Ingrese la cantidad de personas a calcular:");
		n=teclado.nextInt();
		contador = 1;
		suma=0;
		while(contador <= n) {
		System.out.print("Ingrese la altura:");
		altura=teclado.nextFloat();
		suma= suma + altura;
		contador= contador + 1;
		}promedio= suma / n;
		System.out.print(promedio);
	}	
}