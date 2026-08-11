package parimpar;

import java.util.Scanner;
/**
 *
 * @author Teacher Krux
 */
public class ParImpar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int num = input.nextInt();
        
        if (num % 2 == 0) {
            System.out.println(num +" es par.");
        } else {
            System.out.println(num +" es impar.");
        }
    }    
}
