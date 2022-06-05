import java.util.Scanner;

public class EstructuraRepetitivaDoWhileProblema2 {
	public static void main(String[] ar) {
		Scanner teclado=new Scanner(System.in);
		int cuenta;
		float saldo,total;
		total=0;
		do {
			System.out.print("Ingrese numero de cuenta(Finaliza con numero negativo):");
			cuenta=teclado.nextInt();
			if(cuenta>=0) {
				System.out.print("Ingrese su saldo actual:");
				saldo=teclado.nextFloat();
				if(saldo < 0) {
					System.out.print("El estado de la cuenta del cliente es:");
					System.out.println("Deudor");
				}else {
					if(saldo > 0) {
						System.out.print("El estado de la cuenta del cliente es:");
						System.out.println("Acreedor");
						total=total+saldo;
					}else {
						System.out.print("El estado de la cuenta del cliente es:");
						System.out.println("Nulo");
					}
				}
			}
		}while(cuenta>=0);
		System.out.print("La suma total de los clientes Acreedores es:");
		System.out.print(total);
	}
}
