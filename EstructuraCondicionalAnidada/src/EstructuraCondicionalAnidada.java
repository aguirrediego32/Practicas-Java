import java.util.Scanner;
public class EstructuraCondicionalAnidada {
	public static void main(String[] ar) {
		Scanner teclado=new Scanner(System.in);
		int nota1,nota2,nota3,promedio;
		System.out.print("Ingrese la primer nota:");
		nota1=teclado.nextInt();
		System.out.print("Ingrese la segunda nota:");
		nota2=teclado.nextInt();
		System.out.print("Ingrese la tercer nota:");
		nota3=teclado.nextInt();
		promedio=(nota1+nota2+nota3)/3;
		if(promedio>=7) {
			System.out.print("Promocionado");
		}else{
			if (promedio>=4) {
				System.out.print("Regular");				
			}	else {
					System.out.print("Reprobado");
			}
		}
	}
}
