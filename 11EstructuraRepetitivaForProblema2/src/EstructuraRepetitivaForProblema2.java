import java.util.Scanner;

public class EstructuraRepetitivaForProblema2 {
	public static void main(String[] ar) {
		Scanner teclado=new Scanner(System.in);
		int valor,suma,f;
		System.out.println("Ingrese 10 valores");
		suma=0;
		for(f=1;f<=10;f++) {
			System.out.print("Ingrese valor:");
			valor=teclado.nextInt();
			if(f>=6) {
				suma=suma+valor;
			}
		}System.out.print("La suma total de los ultimos 5 valores es:");
		 System.out.print(suma);
	}
}
