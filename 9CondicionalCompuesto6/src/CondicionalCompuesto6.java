import java.util.Scanner;

public class CondicionalCompuesto6 {
	public static void main(String[] ar) {
		Scanner teclado=new Scanner(System.in);
		float sueldo;
		int antiguedad;
		System.out.print("Ingrese el sueldo del empleado:");
		sueldo=teclado.nextFloat();
		System.out.print("Ingrese la antiguedad del empleado:");
		antiguedad=teclado.nextInt();
		if(sueldo < 500 && antiguedad>= 10) {
			float aumento= sueldo*0.20f;
			float sueldoTotal= sueldo+aumento;
			System.out.print("El sueldo a pagar es:");
			System.out.print(sueldoTotal);
		}else {
			if(sueldo < 500) {
				float aumento=sueldo*0.05f;
				float sueldoTotal=sueldo+aumento;
				System.out.print("El sueldo a pagar es:");
				System.out.print(sueldoTotal);
			}else {
				System.out.print("El sueldo a pagar es:");
				System.out.print(sueldo);
			}
		}
	}
}
