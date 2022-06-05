import java.util.Scanner;

public class Triangulo {
	private Scanner teclado;
	private int lado1,lado2,lado3;
	
	public void inicializar() {
		teclado=new Scanner(System.in);
		System.out.print("Ingrese la medida del primer lado:");
		lado1=teclado.nextInt();
		System.out.print("Ingrese la medida del segundo lado:");
		lado2=teclado.nextInt();
		System.out.print("Ingrese la medida del tercer lado:");
		lado3=teclado.nextInt();
	}
	public void elLadoMayor() {
		if(lado1>lado2 && lado1>lado3) {
			System.out.print("La medida del lado mayor es:");
			System.out.println(lado1);
		}else {
			if(lado2 > lado3) {
				System.out.print("La medida del lado mayor es:");
				System.out.println(lado2);
			}else {
				System.out.print("La medida del lado mayor es:");
				System.out.println(lado3);
			}
		}
	}
	public void esEquilatero() {
		if(lado1==lado2 && lado1==lado3) {
			System.out.print("Es triangulo equilatero");
		}else {
			System.out.print("No es triangulo equilatero.");
		}
	}
	
	public static void main(String[]ar) {
		Triangulo triangulo1=new Triangulo();
		triangulo1.inicializar();
		triangulo1.elLadoMayor();
		triangulo1.esEquilatero();
	}
}
