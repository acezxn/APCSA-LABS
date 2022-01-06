// a number guessing game with OOP

public class GG_OOP {
    public static void main(String[] args) {
        Game g = new Game(0, 10);
        int upper = 0;
        int lower = 10;
        while (upper != lower) {
            System.out.println(upper + " " + lower);
            int guess = (upper + lower) / 2;
            if (g.verifyAnswer(guess) == 0) {
                upper = guess;
                lower = guess;
            } else if (g.verifyAnswer(guess) > 0) {
                lower = guess;
            } else {
                upper = guess;
            }
        }
        System.out.println("The answer is " + upper);
    }
}

class Game {
    private int secret;
    private int attempts;

    public Game(int min, int max) {
        secret = (int) (Math.random() * (max - min + 1)) + min;
        attempts = 0;
    }

    public Game(int secret) {
        this.secret = secret;
        attempts = 0;
    }

    public int verifyAnswer(int res) {
        attempts++;
        if (res == secret) {
            return 0;
        } else if (res > secret) {
            return 1;
        }
        return -1;
    }

    public void compare(Game other) {
        if (secret == other.secret) {
            System.out.println("Same secret!");
        } else if (attempts == other.attempts) {
            System.out.println("Same attempts!");
        }
    }
}
