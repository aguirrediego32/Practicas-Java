import java.util.Scanner;
public class CondicionalAnidada2 {
	public static void main(String[] ar) {
		Scanner teclado=new Scanner(System.in);
		int valor;
		System.out.print("Ingrese valor entero:");
		valor=teclado.nextInt();
		if(valor > 0) {
			System.out.print("Es numero positivo");
		}else {
			if(valor < 0) {
				System.out.print("El valor es negativo");
			}else {
				System.out.print("El valor es nulo");
			}
		}
	}
}
