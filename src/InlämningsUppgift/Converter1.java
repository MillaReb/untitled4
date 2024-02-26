package InlämningsUppgift;

import java.text.NumberFormat;
import java.util.HashMap;
public class Converter1 {

    // En HashMap som lagrar morsekod och motsvarande engelska bokstav
    private static final HashMap<String, Character> morseToEnglish = new HashMap<>();
    // En HashMap som lagrar engelska bokstav och motsvarande morsekod
    private static final HashMap<Character, String> englishToMorse = new HashMap<>();


    // En metod som fyller HashMaps med morsekod och engelska bokstäver
    static {
        morseToEnglish.put(".-", 'A');
        morseToEnglish.put("-...", 'B');
        morseToEnglish.put("-.-.", 'C');
        morseToEnglish.put("-..", 'D');
        morseToEnglish.put(".", 'E');
        morseToEnglish.put("..-.", 'F');
        morseToEnglish.put("--.", 'G');
        morseToEnglish.put("....", 'H');
        morseToEnglish.put("..", 'I');
        morseToEnglish.put(".---", 'J');
        morseToEnglish.put("-.-", 'K');
        morseToEnglish.put(".-..", 'L');
        morseToEnglish.put("--", 'M');
        morseToEnglish.put("-.", 'N');
        morseToEnglish.put("---", 'O');
        morseToEnglish.put(".--.", 'P');
        morseToEnglish.put("--.-", 'Q');
        morseToEnglish.put(".-.", 'R');
        morseToEnglish.put("...", 'S');
        morseToEnglish.put("-", 'T');
        morseToEnglish.put("..-", 'U');
        morseToEnglish.put("...-", 'V');
        morseToEnglish.put(".--", 'W');
        morseToEnglish.put("-..-", 'X');
        morseToEnglish.put("-.--", 'Y');
        morseToEnglish.put("--..", 'Z');
        morseToEnglish.put(".--.-", 'Å');
        morseToEnglish.put(".-.-", 'Ä');
        morseToEnglish.put("---.", 'Ö');



        // Loopa igenom morseToEnglish och lägg till motsatta par i englishToMorse
        for (String key : morseToEnglish.keySet()) {
            englishToMorse.put(morseToEnglish.get(key), key);
        }
    }


    // En metod som tar en sträng av morsekod och returnerar motsvarande engelska text
    public static String translateMorseToEnglish(String morse) {

        StringBuilder result = new StringBuilder();
        // Skapa en StringBuilder för att bygga upp resultatet

        // Dela upp morsekoden vid mellanslag och lägg till varje del i en array
            String[] morseWords = morse.split(" / "); //Dela upp ord
            // Loopar igenom array och letar upp varje del i morseToEnglish
            for (String word : morseWords) {
                String[] myLetters = word.split(" "); //Dela upp bokstäver
                for (String myLetter : myLetters) {
                    if (morseToEnglish.containsKey(myLetter)) {
                        result.append(morseToEnglish.get(myLetter));
                    } else {
                        result.append(" "); //lägger till mellanslag mellan ord
                    }

                }
            }

          //returnera resultat som en sträng
        return result.toString().trim();

    }
    // En metod som tar en sträng av engelska text och returnerar motsvarande morsekod
    public static String translateEnglishToMorse(String english) {

        // Skapar en StringBuilder för att bygga upp resultatet
        StringBuilder result = new StringBuilder();
        // Gör om engelska texten till versaler
           english = english.toUpperCase();

           // Loopar igenom varje tecken i engelska texten
           for (int i = 0; i < english.length(); i++) {
               // Hämtar tecknet vid index i
               char w = english.charAt(i);
               // Om tecknet finns i englishToMorse, lägg till motsvarande morsekod i resultatet
               if (englishToMorse.containsKey(w)) {
                   result.append(englishToMorse.get(w));
                   // Lägg till ett mellanslag efter varje morsekod
                   result.append(" ");
               }
               // läger till mellanslag mellan ord
               else {
                   result.append(" ");
               }
           }
        // Returnerar resultatet som en sträng
        return result.toString();

    }

    public String storBokstavToEnglish(String testdata) {

        return translateMorseToEnglish(testdata);
    }
    public String convertWordToMorse(String test) {
        return translateMorseToEnglish(test);

    }
    public String convertSentenceToMorse(String test1){

        return translateMorseToEnglish(test1);
    }
}
















