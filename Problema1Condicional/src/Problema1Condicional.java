import java.util.Scanner;
public class Problema1Condicional {
	public static void main(String[]ar) {
		Scanner teclado=new Scanner(System.in);
		int num1,num2,suma,diferencia,producto;
		float division;
		System.out.print("Ingrese el primer valor:");
		num1=teclado.nextInt();
		System.out.print("Ingrese el segundo valor:");
		num2=teclado.nextInt();
		if(num1>num2) {
			suma=num1+num2;
			diferencia=num1-num2;
			System.out.print("La suma es:");
			System.out.println(suma);
			System.out.print("La diferencia es:");
			System.out.print(diferencia);
		}else {
				producto=num1*num2;
				division=num1/num2;
				System.out.print("El producto es:");
				System.out.println(producto);
				System.out.print("La division es:");
				System.out.print(division);
		}
	}
}
