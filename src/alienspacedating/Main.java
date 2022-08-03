package alienspacedating;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Game game = new Game();

        System.out.println("\n=== WELCOME TO THE INTERGALACTIC DATING SIMULATOR ===");
        System.out.println("\n[1] START DATING MIMI\n");
        String playerInput = input.nextLine();

        switch (playerInput) {
            case "1" -> {
                Game.dateMimi(input);
                game.theEnd();
            }
        }
    }
}
