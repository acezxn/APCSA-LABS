import java.util.Scanner;

/*
A greak akinator game for our solar system
*/


public class Akinator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String obj;

        // questions
        String[] questions = new String[]{
            "Is it a star?",
            "Is it a gas giant?",
            "Are there a big ring?",
            "Is it blue?",
            "Is its rotational axis 97.77 degrees?",
            "Is life on it?",
            "Is the surface temperature over 400 degrees celsius?",
            "Are there an atmosphere?",
            "Is it dwarf?",
            "Is it the Earth's satellite?"
        };

        // user response
        String[] ans = new String[questions.length];
        for (int i = 0; i < questions.length; i++) { // create an array full of "-"
            ans[i] = "-";
        }

        // Header
        System.out.println("Let's play 20 questions. Choose a celestial object in our solar system and I will try to guess it!");

        // ask questions
        for (int i = 0; i < questions.length; i++) {
            String q = questions[i];
            System.out.print(q + " (y/n): ");
            String res = input.nextLine();
            ans[i] = res;
            if ((i == 0 || i == 2 || i == 4 || i == 5 || i == 6 || i == 7 || i == 8) && res.equals("y")) {
                break; // end of logic tree with yes
            }
            else if ((i == 3 || i == 4) && !res.equals("y")) {
                break; // end of logic tree with no
            }
            if (i == 1 && !res.equals("y")) {
                i += 3; // Jump to the 5th question
            }


        }

        String id = String.join("", ans); // id for objects

        // look for the corresponding object
        if (id.equals("y---------")) {
            obj = "the Sun";
        }
        else if (id.equals("nyy-------")) {
            obj = "Saturn";
        }
        else if (id.equals("nynn------")) {
            obj = "Jupiter";
        }
        else if (id.equals("nynyy-----")) {
            obj = "Uranus";
        }
        else if (id.equals("nynyn-----")) {
            obj = "Neptune";
        }
        else if (id.equals("nn---y----")) {
            obj = "Earth";
        }
        else if (id.equals("nn---ny---")) {
            obj = "Venus";
        }
        else if (id.equals("nn---nny--")) {
            obj = "Mars";
        }
        else if (id.equals("nn---nnnny")) {
            obj = "the Moon";
        }
        else if (id.equals("nn---nnny-")) {
            obj = "Pluto";
        }
        else if (id.equals("nn---nnnnn")) {
            obj = "Mercury";
        }
        else {
            // the code should'nt run to here
            obj = "I don't know";
        }

        System.out.println(String.format("Is it %s?", obj));
    }
}
