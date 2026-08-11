
package positivonegativo;

import java.util.Scanner;

/**
 *
 * @author Teacher Krux
 */
public class PositivoNegativo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int num = input.nextInt();
        
        if(num > 0) {
            System.out.println(num +" es positivo. +");
        } else if(num < 0) {
            System.out.println(num +" es negativo. -");
        } else {
            System.out.println("El número es ZERO. 0");
        }
        
    }
    
}
