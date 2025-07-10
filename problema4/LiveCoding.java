package com.generation;

// 1. Se importa la clase Scanner
import java.util.Scanner;

public class Codigo4 {

    // 2. El código se engloba en un método main
    public static void main(String[] args) {

        // 3. Se crea un unico objeto Scanner para toda la ejecución
        Scanner s = new Scanner(System.in);

        System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
        String j1 = s.nextLine();

        // Se elimina la creación redundante de Scanners
        System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijeras): ");
        String j2 = s.nextLine();

        // 4. Se usa .equals() para comparar el contenido de los strings
        if (j1.equals(j2)) {
            System.out.println("Empate");
        } else {
            int g = 2; // Se acepta que el ganador es el jugador 2 por defecto
            switch (j1) {
                case "piedra":
                    // Se usa .equals() para la comparación
                    if (j2.equals("tijeras")) {
                        g = 1;
                    }
                    break; // 5. Se añade break para salir del switch

                case "papel":
                    if (j2.equals("piedra")) {
                        g = 1;
                    }
                    break; // 5. Se añade break

                case "tijera":
                    // Esta línea ya usaba .equals() correctamente
                    if (j2.equals("papel")) {
                        g = 1;
                    }
                    break; // 5. Se añade break
                
            }
            System.out.println("Gana el jugador " + g);
        }
        

        s.close();
    }
}