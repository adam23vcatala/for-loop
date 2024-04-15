package app;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        String texto = "No debería abusar de nadie por su aspecto";
        System.out.println("Introduce un número: ");
        if (!sc.hasNextInt()) {
            System.err.println("Tiene que ser un número entero");
        } else if (num < 0){
            System.err.println("Tiene que ser positivo");
        }
        num = sc.nextInt(); 
        
        for (int i = 1; i <= num; i++) {
            System.out.println(i + ". " + texto);
        }
        
    }
    
}
