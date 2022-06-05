import java.util.Scanner;

public class EstructuraRepetitivaWhile7 {
	public static void main(String[] ar) {
		Scanner teclado=new Scanner(System.in);
		int empleados,contador,sueldoMayor,sueldoMenor;
		float sueldo,gastos;
		System.out.print("Ingrese la cantidad de empleados: ");
		empleados=teclado.nextInt();
		contador=1;
		sueldoMenor=0;
		sueldoMayor=0;
		gastos= 0;
		while(contador <= empleados) {
			System.out.print("Ingrese el sueldo del empleado:");
			sueldo=teclado.nextFloat();
			if(sueldo >= 100 && sueldo <= 300) {
				sueldoMenor= sueldoMenor + 1;
				gastos=gastos + sueldo;
				contador=contador + 1;
			}else {
				if(sueldo > 300) {
					sueldoMayor=sueldoMayor + 1;
					gastos= gastos + sueldo;
					contador=contador + 1;
				}
			}
		}	System.out.print("Los empleados de menor sueldo son:");
			System.out.println(sueldoMenor);
			System.out.print("Los empleados de mayor sueldo son:");
			System.out.println(sueldoMayor);
			System.out.print("Los gastos de la empresa son:");
			System.out.print(gastos);
	}
}
