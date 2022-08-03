package alienspacedating;
import java.util.Scanner;

public class Game implements ImyInterface {

    public static void dateMimi(Scanner input) {

        Alien alien1 = new Alien();
        alien1.setAlienName("Mimi");
        alien1.alienAge = 967;

        Player player = new Player(20, 0); //start values
        //only these 4 methods below are called on since you can't win or lose during them, so they will always run
        strangeCoinSequence(player);
        shopSequence(input, player);

            datingSequence1(player, alien1, input);
            datingSequence2(player, alien1, input);
        }

    public static void strangeCoinSequence(Player player){

        player.randomCoin();
        System.out.println("\nOn the way to the restaurant you spot something shiny on the ground.");
        System.out.println("Turns out its a strange coin, you walk into the nearest shop to ask how much the coin is worth.");
        System.out.println("\n* You show the strange coin to the shopkeeper *");
        System.out.println("\nShopkeeper: Ah, its worth " + player.getCoin() + " in intergalactic currency.");
    }

    public static void shopSequence(Scanner input, Player player){
        //the items give extra charm points when you start the game
        System.out.println("Shopkeeper: Please trade your coin for one of my items.");
        System.out.println("\n[1] Perfume | Cost: 200 | Extra charm: 10");
        System.out.println("\n[2] Flowers | Cost: 300 | Extra charm: 15");
        System.out.println("\n[3] Instant muscles | Cost: 400 | Extra charm: 20");
        System.out.println("\n[4] Cute dog | Cost: 500 | Extra charm: 25");
        System.out.println("\n[5] Rolex watch | Cost: 800 | Extra charm: 30");
        System.out.println("\n[6] Leave the shop\n");
        String playerInput = input.nextLine();

            switch (playerInput) {
                case "1" -> {
                    player.setCoin(player.getCoin() - 200); //set coin after the price has been subtracted from get coin
                    player.charm += 10;
                    System.out.println("\nCoins left: " + player.getCoin());
                }
                case "2" -> {
                    player.setCoin(player.getCoin() - 300);
                    player.charm += 15;
                    System.out.println("\nCoins left: " + player.getCoin());
                }
                case "3" -> {
                    player.setCoin(player.getCoin() - 400);
                    player.charm += 20;
                    System.out.println("\nCoins left: " + player.getCoin());
                }
                case "4" -> {
                    player.setCoin(player.getCoin() - 500);
                    player.charm += 25;
                    System.out.println("\nCoins left: " + player.getCoin());
                }
                case "5" -> {
                    player.setCoin(player.getCoin() - 800);
                    player.charm += 30;
                    System.out.println("\nCoins left: " + player.getCoin());
                }
                case "6" -> {
                }
            }

        System.out.println("\nYou left the shop.\n");
    }

    public static void datingSequence1(Player player, Alien alien1, Scanner input) {

            System.out.println("=== SOME TIME LATER ===\n");
            System.out.println("Charm meter: " + player.charm + "/100\n");
            System.out.println("You're sitting down at a restaurant table, twiddling your thumbs.");
            System.out.println("In rushes " + alien1.getAlienName() + ", shes green, slimey, tall and slender... with tentacles for arms and legs. She apologizes for being late.");
            System.out.println("You tell " + alien1.getAlienName() + " its okay and push out the chair for her. She sits down...");
            System.out.println(alien1.getAlienName() + ": So... your ad didn't say your age. How old are you?\n");
            String playerInput = input.nextLine();
            System.out.println("\n" + alien1.getAlienName() + ": " + playerInput + " years old... I'm " + (alien1.getAlienAge() + playerInput) + " years old. How do you feel about the age gap?\n");
            // ^ the string that was put in is added together with aliens age, example: 10+20 = 1020.
            System.out.println("[1] GOD you're old, I'm sure your ad did NOT disclose that\n");
            System.out.println("[2] Age is just a number baby\n");
            System.out.println("[3] * Fall off the chair from pure shock *\n");
            playerInput = input.nextLine();

            switch (playerInput) {
                case "1" -> {
                    player.charm -= 15;
                    System.out.println("\nCharm meter: " + player.charm);
                    System.out.println(alien1.getAlienName() + " looks devastated from your answer. ");
                    System.out.println("You just want to go home at this point but try to salvage the situation by continuing like nothing happened...\n");
                }
                case "2" -> {
                    player.charm += 25;
                    System.out.println("\nCharm meter: " + player.charm);
                    System.out.println(alien1.getAlienName() + " gives you a flirty look. ");
                    System.out.println("You blink at her and continue the conversation.\n");
                }
                case "3" -> {
                    player.charm -= 15;
                    System.out.println("\nCharm meter: " + player.charm);
                    System.out.println(alien1.getAlienName() + " is shocked and embarrassed from the scene you just created.");
                    System.out.println("You climb on up again and try to salvage the situation by continuing like nothing happened...\n");
                }
            }
        }


    public static void datingSequence2(Player player, Alien alien1, Scanner input) {

            System.out.println("Soooo " + alien1.getAlienName() + "... what do you do in your spare time?");
            System.out.println(alien1.getAlienName() + ": I really like going on safaris to less advanced planets. It's such an eye-opener.");
            System.out.println(alien1.getAlienName() + ": What about you, what do you enjoy doing in your spare time?\n");

            System.out.println("[1] I go on A LOT of dates, like all the time.\n");
            System.out.println("[2] I enjoy drinking mayonnaise straight out of the jar.\n");
            System.out.println("[3] I enjoy cooking and visiting my sick grandma.\n");
            String playerInput = input.nextLine();

            switch (playerInput) {
                case "1" -> {
                    player.charm -= 25;
                    System.out.println("\nCharm meter: " + player.charm);
                    System.out.println(alien1.getAlienName() + " looks angry.\n");
                }
                case "2" -> {
                    player.charm -= 25;
                    System.out.println("\nCharm meter: " + player.charm);
                    System.out.println(alien1.getAlienName() + " looks like she's about to puke.\n");
                }
                case "3" -> {
                    player.charm += 20;
                    System.out.println("\nCharm meter: " + player.charm);
                    System.out.println(alien1.getAlienName() + " puts her hand on yours and looks deep into your eyes.\n");
                }
            }
        if (player.charm < 100 && player.charm > 0) { //if the conditions are met dating sequence 3 gets called
            datingSequence3(player, alien1, input);
        }
        else{ //if the condition is not met we go straight to calling the end stats-method
            endStats(player, alien1);
        }
    }

    public static void datingSequence3(Player player, Alien alien1, Scanner input) {

            System.out.println("It suddenly starts raining heavily, what do you do?\n");

            System.out.println("[1] Curse and yell at the rainy clouds like a crazy person.\n");
            System.out.println("[2] Suggest to " + alien1.getAlienName() + " that you continue the date inside instead.\n");
            System.out.println("[3] Open up the umbrella you brought.\n");
            String playerInput = input.nextLine();

            switch (playerInput) {
                case "1" -> {
                    player.charm -= 25;
                    System.out.println("\nCharm meter: " + player.charm);
                    System.out.println(alien1.getAlienName() + " looks uncomfortable.\n");
                }
                case "2" -> {
                    player.charm += 15;
                    System.out.println("\nCharm meter: " + player.charm);
                    System.out.println(alien1.getAlienName() + " agrees and walks inside the restaurant with you.\n");
                }
                case "3" -> {
                    player.charm += 5;
                    System.out.println("\nCharm meter: " + player.charm);
                    System.out.println(alien1.getAlienName() + " appreciates the gesture but the umbrella is not big enough for both of you.\n");
                }

            }

        if (player.charm < 100 && player.charm > 0) {
            datingSequence4(player, alien1, input);
        }
         else{
            endStats(player, alien1);
        }
    }

    public static void datingSequence4(Player player, Alien alien1, Scanner input) {

            System.out.println("You feel slightly awkward and notice " + alien1.getAlienName() + " has taken out her phone.\n");

            System.out.println("[1] Continue sitting in awkward silence.\n");
            System.out.println("[2] Start doing bad magic tricks with your napkin\n");
            System.out.println("[3] Take out your phone to play Snake\n");
            String playerInput = input.nextLine();

            switch (playerInput) {
                case "1" -> {
                    player.charm -= 20;
                    System.out.println("\nCharm meter: " + player.charm);
                    System.out.println("You're feeling uncomfortable. Will the date be over soon?\n");
                }
                case "2" -> {
                    player.charm += 25;
                    System.out.println("\nCharm meter: " + player.charm);
                    System.out.println("You manage to get " + alien1.getAlienName() + "s attention again. Phew!\n");
                }
                case "3" -> {
                    player.charm -= 10;
                    System.out.println("\nCharm meter: " + player.charm);
                    System.out.println("* Yawn *\n");
                }
            }
        endStats(player, alien1); //the end stats-method is always called once the last dating sequence is through
        }


    public static void endStats(Player player, Alien alien1) {
        if (player.charm >= 100) { //you win!
            System.out.println(alien1.getAlienName() + " gives you an appreciative look and asks if you wanna get out of here.");
            System.out.println("You walk out of the restaurant and into the sunset, holding hands.");
            System.out.println("\nYour final charm score: " + player.charm + "\n");
        }
        else if (player.charm >= 50) { //you did a bit so-so
            System.out.println(alien1.getAlienName() + " says its getting late, you walk out of the restaurant together and go your separate ways. ");
            System.out.println("You're not entirely sure how the date went, you're hoping shes gonna text first.");
            System.out.println("\nYour final charm score: " + player.charm + "\n");
        } else { //you failed!
            System.out.println(alien1.getAlienName() + " is disgusted by you. She throws her drink in your face and leaves the restaurant.");
            System.out.println("\n\nYour final charm score: " + player.charm + "\n");
        }
    }

    @Override
    public void theEnd() {
        System.out.println("\n=== THE END ==="); //my interface
    }
}