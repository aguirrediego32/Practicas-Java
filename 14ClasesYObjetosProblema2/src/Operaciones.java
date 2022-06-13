import java.util.Scanner;
public class Operaciones {
	private Scanner teclado;
	private int valor1;
	private int valor2;
	
	public void inicializar() {
		teclado=new Scanner(System.in);
		System.out.print("Ingrese el primer valor:");
		valor1=teclado.nextInt();
		System.out.print("Ingrese el segundo valor:");
		valor2=teclado.nextInt();
	}
	public void suma() {
		int total=valor1 +valor2;
		System.out.println("La suma es:" +total);		
	}
	public void resta() {
		int total=valor1 - valor2;
		System.out.println("La resta es:" +total);		
	}
	public void multiplicacion() {
		int total=valor1 * valor2;
		System.out.println("La multiplicacion es:" +total);		
	}
	public void division() {
		int total=valor1 / valor2;
		System.out.println("La division es:" +total);		
	}
	
	public static void main(String[] ar) {
		Operaciones operacion1=new Operaciones();
		operacion1.inicializar();
		operacion1.suma();
		operacion1.resta();
		operacion1.multiplicacion();
		operacion1.division();
	}
}
