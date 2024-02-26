package InlämningsUppgift;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;
public class TestConverter {

    @Test

    public void testConvertAToEnglish(){
        Converter1 converter = new Converter1(); //information som behovs för att utföra testfallet
       String testdata = ".-";

       String actual = converter.storBokstavToEnglish(testdata);//hämtar den faktiskt information ifrån vår kod och sparar i actual
       String expected = "A";  //förväntad resultat hämtas ifrån vår kod

       assertEquals(expected, actual); // här jämför vi expected och actual med assertEquals


    }
    @Test
    public void testConvertWordToMorse(){
        Converter1 converter = new Converter1();
        String test = ".... . .-.. .-.. ---";

        String actual = converter.convertWordToMorse(test);
        String expected = "HELLO";

        assertEquals(expected, actual);
    }


    @Test

    public void testConvertSentence(){
        Converter1 converter = new Converter1();
        String test1 = ".... . .-.. .-.. ---  .-- --- .-. .-.. -..";

        String actual = converter.convertSentenceToMorse(test1);
        String expected = "HELLO WORLD";

        assertEquals(expected, actual);
    }

    }


