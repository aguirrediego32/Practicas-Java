import java.util.Scanner;

public class EstructuraRepetitivaWhile11 {
	public static void main(String[] ar) {
		Scanner teclado=new Scanner(System.in);
		int num,par,impar,contador,valor;
		System.out.print("Ingrese la cantidad de valores:");
		contador=1;
		par=0;
		impar=0;
		num=teclado.nextInt();
		while(contador <= num) {
			System.out.print("Ingrese valor:");
			valor=teclado.nextInt();
			if(valor%2==0) {
				par=par+1;
			}else {
				impar=impar+1;
			}contador=contador+1;
		}System.out.print("Los cantidad de valores pares son:");
		System.out.println(par);
		 System.out.print("Los cantidad de valores impares son:");
		 System.out.print(impar);
	}
}
