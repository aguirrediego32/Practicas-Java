import java.util.Scanner;

public class CondicionalCompuesta3 {
	public static void main(String[] ar) {
		Scanner teclado=new Scanner(System.in);
		int num1,num2,num3;
		System.out.print("Ingrese el primer valor:");
		num1=teclado.nextInt();
		System.out.print("Ingrese el segundo valor:");
		num2=teclado.nextInt();
		System.out.print("Ingrese el tercer valor:");
		num3=teclado.nextInt();
		if(num1<10 && num2<10 && num3<10) {
			System.out.print("Todos los valores son menores a 10");
		}
	}
}
