/**
 * 
 */

/**
 * @author gustavo
 *
 */
import java.util.Scanner;
public class T {

	/**
	 * @param args
	 * Es un programa que imprime la cantidad de texto ingresado
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Ingrese un texto: ");
		Taman taman2 =  new Taman();
		Scanner sc = new Scanner(System.in);
		String text = sc.nextLine();
		taman2.taman(text);
	}

}
