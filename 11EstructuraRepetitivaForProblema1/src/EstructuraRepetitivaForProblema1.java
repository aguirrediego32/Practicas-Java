import java.util.Scanner;

public class EstructuraRepetitivaForProblema1 {
	public static void main(String[] ar) {
		Scanner teclado=new Scanner(System.in);
		int cantidad,base,altura,superficie,totalTriangulos,f;
		System.out.print("Ingrese la cantidad de triángulos a calcular:");
		cantidad=teclado.nextInt();
		totalTriangulos=0;
		for(f=1;f<=cantidad;f++) {
			System.out.print("Ingrese la base:");
			base=teclado.nextInt();
			System.out.print("Ingrese la altura:");
			altura=teclado.nextInt();
			superficie=0;
			superficie=base*altura/2;
			System.out.print("La superficie del triángulo es:");
			System.out.println(superficie);
			if(superficie>12) {
				totalTriangulos=totalTriangulos + 1;
			}
		}
		System.out.print("La cantidad de triángulos con superficie mayor a 12 son:");
		System.out.print(totalTriangulos);
	}
}
