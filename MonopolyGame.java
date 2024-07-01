import java.util.*;

public class MonopolyGame {
    class Player {
        String name;
        int cash;
        int position;
        int timesPassedStart;
        List<String> properties;
        int rentEarned;
        int cashPaidToBank;
        int cashReceivedFromBank;

        // constructor to initialise player attributes
        Player(String name) {
            this.name = name;
            this.cash = 15000; // Starting cash
            this.position = 0;
            this.timesPassedStart = 0;
            this.properties = new ArrayList<>();
            this.rentEarned = 0;
            this.cashPaidToBank = 0;
            this.cashReceivedFromBank = 0;
        }
    }

    // Add positions and names according to the board
    public void initializeBoard() {
        board.put(0, "Start");
        board.put(1, "Guwahati");
        board.put(2, "Community Chest");
        board.put(3, "Bhubaneshwar");
        board.put(4, "Income Tax");
        board.put(5, "Chennai Central Railway Station");
        board.put(6, "Panji");
        board.put(7, "Chance");
        board.put(8, "Agra");
        board.put(9, "Vadodara");
        board.put(10, "Jail");
        board.put(11, "Ludhiana");
        board.put(12, "Electric Company");
        board.put(13, "Patna");
        board.put(14, "Bhopal");
        board.put(15, "Howrah Railway Station");
        board.put(16, "Indore");
        board.put(17, "Community Chest");
        board.put(18, "Nagpur");
        board.put(19, "Kochi");
        board.put(20, "Free Parking");
        board.put(21, "Lucknow");
        board.put(22, "Chance");
        board.put(23, "Chandigarh");
        board.put(24, "Jaipur");
        board.put(25, "New Delhi Railway Station");
        board.put(26, "Pune");
        board.put(27, "Heydrabad");
        board.put(28, "Water Works");
        board.put(29, "Ahmedabad");
        board.put(30, "Jail");
        board.put(31, "Kolkata");
        board.put(32, "Chennai");
        board.put(33, "Community Chest");
        board.put(34, "Bengaluru");
        board.put(35, "Chhatrapati Shivaji Terminus");
        board.put(36, "Chance");
        board.put(37, "Delhi");
        board.put(38, "Luxary Tax");
        board.put(39, "Mumbai");
    }

    public void initializeProperties() {
        // Initialize property prices
        propertyPrices.put("Guwahati", 60);
        propertyPrices.put("Bhubaneshwar", 60);
        propertyPrices.put("Income Tax", 50);
        propertyPrices.put("", 60);
        propertyPrices.put("Chennai Central Railway Station", 200);
        propertyPrices.put("Panji", 100);
        propertyPrices.put("Agra", 120);
        propertyPrices.put("Ludhiana", 140);
        propertyPrices.put("Electric Company", 150);
        propertyPrices.put("Patna", 140);
        propertyPrices.put("Bhopal", 160);
        propertyPrices.put("Howrah Railway Station", 200);
        propertyPrices.put("Indore", 180);
        propertyPrices.put("Nagpur", 180);
        propertyPrices.put("Kochi", 200);
        propertyPrices.put("Free Parking", 0);
        propertyPrices.put("Lucknow", 220);
        propertyPrices.put("Chandigarh", 220);
        propertyPrices.put("Jaipur", 240);
        propertyPrices.put("New Delhi Railway Station", 200);
        propertyPrices.put("Pune", 260);
        propertyPrices.put("Heydrabad", 260);
        propertyPrices.put("water works", 150);
        propertyPrices.put("Ahemdabad", 280);
        propertyPrices.put("Kolkata", 300);
        propertyPrices.put("Chennai", 300);
        propertyPrices.put("Bengaluru", 320);
        propertyPrices.put("Chhatrapati  Shivaji Terminus", 200);
        propertyPrices.put("Delhi", 350);
        propertyPrices.put("Luxary tax", 75);
        propertyPrices.put("Mumbai", 400);

        // Initialize rent prices
        rentPrices.put("Guwahati", 2);
        rentPrices.put("Bhubaneshwar", 4);
        rentPrices.put("Income Tax", 50);
        rentPrices.put("", 60);
        rentPrices.put("Chennai Central Railway Station", 25);
        rentPrices.put("Panji", 6);
        rentPrices.put("Agra", 6);
        rentPrices.put("Ludhiana", 10);
        rentPrices.put("Patna", 10);
        rentPrices.put("Bhopal", 12);
        rentPrices.put("Howrah Railway Station", 25);
        rentPrices.put("Indore", 14);
        rentPrices.put("Nagpur", 14);
        rentPrices.put("Kochi", 16);
        rentPrices.put("Free Parking", 0);
        rentPrices.put("Lucknow", 18);
        rentPrices.put("Chandigarh", 18);
        rentPrices.put("Jaipur", 20);
        rentPrices.put("New Delhi Railway Station", 25);
        rentPrices.put("Pune", 22);
        rentPrices.put("Heydrabad", 22);
        rentPrices.put("Ahemdabad", 24);
        rentPrices.put("Kolkata", 26);
        rentPrices.put("Chennai", 26);
        rentPrices.put("Bengaluru", 28);
        rentPrices.put("Chhatrapati  Shivaji Terminus", 25);
        rentPrices.put("Delhi", 35);
        rentPrices.put("Luxary tax", 75);
        rentPrices.put("Mumbai", 50);
    }

    public void printInitialStatus(Player[] players) {
        System.out.println("Initial Status:");
        for (Player player : players) {
            System.out.println(player.name + ": " + player.cash + " INR");
        }
    }

    static Map<Integer, String> board = new HashMap<>();
    static Map<String, Integer> propertyPrices = new HashMap<>();
    static Map<String, Integer> rentPrices = new HashMap<>();
    static Map<String, Player> propertyOwners = new HashMap<>();

    public void sellProperty(Scanner scanner, Player player) {
        System.out.println("Properties owned by " + player.name + ": " + player.properties);
        System.out.println("Enter the name of the property to sell:");
        String property = scanner.nextLine();
        if (player.properties.contains(property)) {
            int saleAmount = propertyPrices.get(property) / 2;
            player.cash += saleAmount;
            player.cashReceivedFromBank += saleAmount;
            player.properties.remove(property);
            propertyOwners.remove(property);
            System.out.println(player.name + " sold " + property + " for " + saleAmount + " INR");
        } else {
            System.out.println("Invalid property name.");
        }
    }

    public void handlePosition(Player player, Player[] players) {
        String positionName = board.get(player.position);
        System.out.println(player.name + " landed on " + positionName);

        if (propertyPrices.containsKey(positionName)) {
            if (propertyOwners.containsKey(positionName)) {
                Player owner = propertyOwners.get(positionName);
                if (!owner.equals(player)) {
                    int rent = rentPrices.get(positionName);
                    System.out.println(player.name + " pays rent of " + rent + " INR to " + owner.name);
                    player.cash -= rent;
                    owner.cash += rent;
                    player.cashPaidToBank += rent;
                    owner.rentEarned += rent;
                }
            } else {
                System.out.println(player.name + " can purchase " + positionName + " for "
                        + propertyPrices.get(positionName) + " INR or pay a fine of 1000 INR.");
                if (player.cash >= propertyPrices.get(positionName)) {
                    System.out.println("Press 'p' to purchase or 'f' to pay fine:");
                    Scanner scanner = new Scanner(System.in);
                    String choice = scanner.nextLine();
                    scanner.close();
                    if (choice.equalsIgnoreCase("p")) {
                        player.cash -= propertyPrices.get(positionName);
                        propertyOwners.put(positionName, player);
                        player.properties.add(positionName);
                        System.out.println(player.name + " purchased " + positionName);
                    } else {
                        player.cash -= 1000;
                        player.cashPaidToBank += 1000;
                        System.out.println(player.name + " paid a fine of 1000 INR");
                    }
                } else {
                    System.out.println("Not Enough cash to buy the property!!");
                    player.cash -= 1000;
                    player.cashPaidToBank += 1000;
                    System.out.println(player.name + " paid a fine of 1000 INR");
                }
            }
        }

        if (positionName.equalsIgnoreCase("Jail")) {
            System.out.println("Paid bail amount of 1500 INR");
            player.cash -= 1500;
            player.cashPaidToBank += 1500;
        }

        // Community chest
        if (positionName.equalsIgnoreCase("Community Chest")) {
            int cardNumber = (int) Math.random() * 10 + 1;
            System.out.println("Follow Instructions according to card " + cardNumber);

            if (cardNumber == 1) {
                System.out.println("Life Insurance Matures, You get 1000 INR");
                player.cash += 1000;
                player.cashReceivedFromBank += 1000;
            }
            if (cardNumber == 2) {
                System.out.println("Pay School Tax of 1500 INR");
                player.cash -= 1500;
                player.cashPaidToBank += 1500;
            }
            if (cardNumber == 3) {
                System.out.println("Doctors Fee: 500INR");
                player.cash -= 500;
                player.cashPaidToBank += 500;
            }
            if (cardNumber == 4) {
                System.out.println("XMAS Fund Matures, you get 1000 INR");
                player.cash += 1000;
                player.cashReceivedFromBank += 1000;
            }
            if (cardNumber == 5) {
                System.out.println("Profit earned of 1500 INR from stocks");
                player.cash += 1500;
                player.cashReceivedFromBank += 1500;
            }
            if (cardNumber == 6) {
                System.out.println("Income Tax Refund of 2000 INR");
                player.cash += 2000;
                player.cashReceivedFromBank += 2000;
            }
            if (cardNumber == 7) {
                System.out.println("Bank Error in your favour, you get 2000 INR");
                player.cash += 2000;
                player.cashReceivedFromBank += 2000;
            }
            if (cardNumber == 8) {
                System.out.println("Pay Hospital bill of 1000 INR");
                player.cash -= 1000;
                player.cashPaidToBank += 1000;
            }
            if (cardNumber == 9) {
                System.out.println("Pay 1000 INR for community Services");
                player.cash -= 1000;
                player.cashPaidToBank += 1000;
            }
            if (cardNumber == 10) {
                System.out.println("You Lost 2500 in stock market");
                player.cash -= 2500;
                player.cashPaidToBank += 2500;
            }
        }

        // chance
        if (positionName.equalsIgnoreCase("Chance")) {
            int cardNumber = (int) Math.random() * 10 + 1;

            if (cardNumber == 1) {
                System.out.println("You have been elected Chairman of the board, pay 500 INR to bank as security");
                player.cash -= 500;
                player.cashPaidToBank += 500;
            }
            if (cardNumber == 2) {
                System.out.println("Go back 3 spaces");
                player.position = (player.position - 3);
            }
            if (cardNumber == 3) {
                System.out.println("Take ride to Chennai Central Station");
                player.position = 5;
            }
            if (cardNumber == 4) {
                System.out.println("Bank pays you dividend of 500 INR");
                player.cash += 500;
                player.cashReceivedFromBank += 500;
            }
        }
    }

    public void printPlayerStatus(Player player) {
        System.out.println(player.name + " has " + player.cash + " INR");
    }

    public void showGameStatus(Player[] players) {
        for (Player player : players) {
            System.out.println(player.name + ":");
            System.out.println("Cash: " + player.cash + " INR");
            System.out.println("Properties: " + player.properties);
            System.out.println("Times Passed Start: " + player.timesPassedStart);
            System.out.println("Rent Earned: " + player.rentEarned + " INR");
            System.out.println("Cash Paid to Bank: " + player.cashPaidToBank + " INR");
            System.out.println("Cash Received from Bank: " + player.cashReceivedFromBank + " INR");
        }
    }

    public static void main(String[] args) {

        MonopolyGame game = new MonopolyGame();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of players (2-4):");
        int numPlayers = scanner.nextInt();
        scanner.nextLine(); // consume newline

        if (numPlayers < 2 || numPlayers > 4) {
            System.exit(0);
        }

        Player[] players = new Player[numPlayers];
        for (int i = 0; i < numPlayers; i++) {
            System.out.println("Enter name of player " + (i + 1) + ":");
            String player = scanner.nextLine();
            players[i] = game.new Player(player);
        }
        scanner.close();

        game.initializeBoard();
        game.initializeProperties();
        game.printInitialStatus(players);

        // game starts
        boolean gameOn = true;
        int currentPlayerIndex = 0;

        while (gameOn) {
            Player currentPlayer = players[currentPlayerIndex];
            System.out.println(
                    currentPlayer.name + "'s turn, press enter to throw the dice or type 'sell' to sell a property:");
            String command = scanner.nextLine();

            if (command.equalsIgnoreCase("sell")) {
                game.sellProperty(scanner, currentPlayer);
            } else {
                int dice1 = (int) Math.random() * 6 + 1;
                int dice2 = (int) Math.random() * 6 + 1;
                int move = dice1 + dice2;
                System.out.println("Rolled: " + dice1 + " and " + dice2 + " (Total: " + move + ")");

                currentPlayer.position = (currentPlayer.position + move) % 40;
                game.handlePosition(currentPlayer, players);

                game.printPlayerStatus(currentPlayer);

                if (move >= 10 && move <= 12) {
                    // Player scored double-digit, starts moving
                    currentPlayer.position = move % 40;
                    game.handlePosition(currentPlayer, players);
                }

                currentPlayerIndex = (currentPlayerIndex + 1) % numPlayers;
            }

            System.out.println("Enter 'show' to show the game status or press enter to continue:");
            String option = scanner.nextLine();
            if (option.equalsIgnoreCase("show")) {
                game.showGameStatus(players);
            }
        }
    }

}
