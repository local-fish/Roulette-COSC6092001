import java.util.Random;

public class Simulate {
    static final String[] OUR_SPOTS = {
        "green", "red", "black", "red", "black", "red", "black", "red", "black",
        "red", "black", "black", "red", "black", "red", "black", "red", "black",
        "red", "red", "black", "red", "black", "red", "black", "red", "black",
        "red", "black", "black", "red", "black", "red", "black", "red", "black",
        "red", "green"
    };

    public static void main(String[] args) {
        Random rng = new Random();
        rng.setSeed(2907);

        int money = 1000;
        int round = 0;
        StringBuilder inputs = new StringBuilder();

        while (money > 0) {
            int bet = Math.min(10, money);
            String betType = (round % 2 == 0) ? "red" : "black";

            inputs.append(bet).append("\n").append(betType).append("\n");

            int spin = rng.nextInt(OUR_SPOTS.length);
            String color = OUR_SPOTS[spin];

            // check win
            boolean win = color.equals(betType);
            if (win) money += bet;
            else money -= bet;

            round++;
        }

        System.out.print(inputs);
        System.err.println("Total rounds: " + round);
    }
}
