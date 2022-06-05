import java.util.Scanner;
public class CondicionalAnidada3 {
	public static void main(String[] ar) {
		Scanner teclado=new Scanner(System.in);
		int valor;
		System.out.print("Ingrese valor de 3 digitos :");
		valor=teclado.nextInt();
		if(valor > 999) {
			System.out.print("Error, ingresaste un numero de mas de 3 cifras");
		}else {
			if(valor > 99) {
				System.out.print("Ingresaste un valor de 3 cifras");
			} else {
				if(valor > 9) {
					System.out.print("Ingresaste un valor de 2 cifras");
				}else {
					System.out.print("Ingresaste un valor de 1 cifra");
				}
			}
		}
	}
}
