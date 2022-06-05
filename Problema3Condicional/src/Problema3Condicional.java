import java.util.Scanner;
public class Problema3Condicional {
	public static void main(String[] ar) {
		Scanner teclado=new Scanner(System.in);
		int valor;
		System.out.print("Ingrese valor entre 1 y 99:");
		valor=teclado.nextInt();
		if(valor <=9 ) {
			System.out.print("El numero tiene 1 digito");
		}else{
			System.out.print("El numero tiene 2 digitos");	
		}
	}
}
