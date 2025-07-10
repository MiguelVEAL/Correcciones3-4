package liveCodingTres;

import java.util.Scanner;

public class LiveCoding {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
        String j1 = scanner.nextLine().trim().toLowerCase();

        System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijeras): ");
        String j2 = scanner.nextLine().trim().toLowerCase();

        if (j1.equals(j2)) {
            System.out.println("Empate");
        } else {
            int ganador = determinarGanador(j1, j2);
            System.out.println("Gana el jugador " + ganador);
        }

        scanner.close();
    }

    /**
     * Devuelve 1 si j1 gana, 2 si j2 gana.
     */
    private static int determinarGanador(String j1, String j2) {
        if (j1.equals("piedra"))    return j2.equals("tijeras") ? 1 : 2;
        if (j1.equals("papel"))     return j2.equals("piedra")   ? 1 : 2;
        if (j1.equals("tijeras"))   return j2.equals("papel")    ? 1 : 2;
        return 2; // entrada no válida
    }
}