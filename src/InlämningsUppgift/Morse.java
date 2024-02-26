package InlämningsUppgift;
import java.util.Scanner;

import static InlämningsUppgift.Converter1.*;


public class Morse {
    public static void main(String[] args) {
        // Skapar en Scanner för att läsa inmatning från användaren
        Scanner scanner = new Scanner(System.in);
      try{
            boolean xx = false;
            // Loopar så länge användaren inte väljer att avsluta
            do {

                System.out.println("Choose from meny!");
                System.out.println("-------------------------------------------");
                System.out.println("(1) Translate from morse code to english!");
                System.out.println("(2) Translate from english to morse code!");
                System.out.println("(3) Exit the program!");
                System.out.println("----------------------------------------------");
                // Läser in användarens val som en int
                int myChoice = Integer.parseInt(scanner.nextLine());
                switch (myChoice) {


                    case 1:
                        System.out.println("Translate from morse code to english!");
                        String morse = scanner.nextLine();         //använder sout för att skriva ut text

                        System.out.println("English: " + translateMorseToEnglish(morse));
                        break;
                    case 2:
                        System.out.println("Translate from english to morse code!");
                        String english = scanner.nextLine();
                        System.out.println("Morse code: " + translateEnglishToMorse(english));
                        break;

                    case 3:
                        xx = true;
                        System.out.println("Thank you for using Morse translator!");
                        break;

                }

            } while (!xx);
            System.out.println(xx);


        } catch(NumberFormatException e){
                System.out.println("Write down number 1-3 to chose from meny!");
            }
        }

    }
