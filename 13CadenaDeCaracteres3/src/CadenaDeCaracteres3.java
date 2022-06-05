import java.util.Scanner;

public class CadenaDeCaracteres3 {
	public static void  main(String[] ar) {
		Scanner teclado=new Scanner(System.in);
		String apellido1,apellido2;
		System.out.print("Ingrese el apllido:");
		apellido1=teclado.next();
		System.out.print("Ingrese el apllido:");
		apellido2=teclado.next();		
		if(apellido1.equals(apellido2)) {
			System.out.print("Son apellidos iguales");
		}else {
			System.out.print("Son apellidos distintos");
		}
	}
}
