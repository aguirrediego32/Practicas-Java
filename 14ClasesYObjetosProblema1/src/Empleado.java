import java.util.Scanner;

public class Empleado {
	private Scanner teclado;
	private String nombre;
	private int sueldo;
	
	public void inicializar() {
		teclado=new Scanner(System.in);
		System.out.print("Ingrese el nombre del empleado:");
		nombre=teclado.next();
		System.out.print("Ingrese el sueldo:");
		sueldo=teclado.nextInt();
	}
	public void imprimirDatos() {
		System.out.println("El nombre del empleado es:" + nombre);
		System.out.println("El sueldo del empleado es:" + sueldo);
	}
	public void debePagar() {
		if(sueldo>3000) {
			System.out.print("Debe pagar impuestos");
		}else {
			System.out.print("No debe pagar impuestos");
		}
	}
	
	public static void main(String[] ar) {
		Empleado empleado1=new Empleado();
		empleado1.inicializar();
		empleado1.imprimirDatos();
		empleado1.debePagar();
	}
}
