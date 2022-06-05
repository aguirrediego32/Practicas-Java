import java.util.Scanner;

public class EstructuraRepetitivaDoWhileProblema1 {
	public static void main(String[] ar) {
		Scanner teclado=new Scanner(System.in);
		int valor,total;
		total=0;
		do {
			System.out.print("Ingrese valor(Finaliza con 9999):");
			valor=teclado.nextInt();
			if(valor!=9999) {
			total=total+valor;
		}
		}while(valor!=9999);
		if(total < 0) {
			System.out.print("El valor es menor a cero");
		}else {
			if(total > 0) {
				System.out.print("El valor es mayor a cero");
			}else {
				System.out.print("El valor es igual a cero");
			}
		}
	}
}
