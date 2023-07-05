package recursividadpalindromas;

import java.util.Scanner;

public class RecursividadPalindromas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String palabra;
        
        System.out.print("Ingrese una palabra: ");
        palabra = sc.nextLine();
        
        if(palindroma(palabra) == true) {
            System.out.println("La palabra es palindroma");
        } else {
            System.out.println("La palabra no es palindroma");
        }

        
    }
    public static boolean palindroma(String p) {
        if (p.length() == 0 || p.length() == 1) {
            return true;
        }
        if (p.charAt(0) == p.charAt(p.length()-1)) { //Comprueba si la primera letra es igual a la ultima del String
            return palindroma(p.substring(1,p.length()-1));
        }
        return false;
    }
}
