import java.util.Scanner;

public class EstructuraRepetitivaFor3 {
	public static void main(String[] ar) {
		Scanner teclado=new Scanner(System.in);
		int valor,mult3,mult5,f;
		mult3=0;
		mult5=0;
		for(f=1;f<=10;f++) {
			System.out.print("Ingresar valor:");
			valor=teclado.nextInt();
			if((valor%3==0)) {
				mult3=mult3+1;
			}
			if((valor%5==0)) {
				mult5=mult5+1;
			}
		}System.out.print("Los multiplos de 3 son:");
		 System.out.println(mult3);
		 System.out.print("Los multiplos de 5 son:");
		 System.out.print(mult5);
	}
}
