import java.util.Scanner;

public class CondicionalCompuesto7 {
	public static void main(String[] ar) {
		Scanner teclado=new Scanner(System.in);
		int num1,num2,num3;
		System.out.print("Ingrese el primer valor:");
		num1=teclado.nextInt();
		System.out.print("Ingrese el primer valor:");
		 num2=teclado.nextInt();
		System.out.print("Ingrese el primer valor:");
		num3=teclado.nextInt();
		if(num1 < num2 && num1 < num3) {
			System.out.print(num1);
		}else {
			if(num2 < num3) {
				System.out.print(num2);
			}else {
				System.out.print(num3);
			}
		}
		System.out.print(" - ");
		if(num1 > num2 && num1 > num3) {
			System.out.print(num1);
		}else {
			if(num2 > num3) {
				System.out.print(num2);
			}else {
				System.out.print(num3);
			}
		}
	}
}