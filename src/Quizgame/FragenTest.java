package Quizgame;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Locale;

import static org.junit.jupiter.api.Assertions.*;

class FragenTest {

    private static Fragen frage;
    private static Fragen frageDefaultKonstruktor;

    @BeforeEach

    public void instanzierenFuerTest(){
        frage = new Fragen("Hauptstadt von Frankreich?", "paris");
        frageDefaultKonstruktor = new Fragen();
    }

    @Test
    public void getFrage_shouldReturnStringFrage(){
        String quizFrage = "Hauptstadt von Frankreich?";
        String quizFrageFehler = "hauptstadt von Frankreich";

        assertEquals(quizFrage,frage.getFrage());
        assertNotEquals(quizFrageFehler, frage.getFrage());
    }

    @Test
    public void setFrage_shouldReturnGetFrage(){
        frageDefaultKonstruktor.setFrage("Wie heisst du?");
        assertEquals("Wie heisst du?",frageDefaultKonstruktor.getFrage());
        assertNotEquals("wie heisst du?", frageDefaultKonstruktor.getFrage());

    }

    @Test
    public void getAntwort_shouldReturnStringAntwort(){
        String quizAntwort = "paris";
        String quizAntwortFehler = "Paris";
        assertEquals("paris", frage.getAntwort());
        assertNotEquals("Paris", frage.getAntwort());
        assertNotEquals("paris", frageDefaultKonstruktor.getAntwort());

    }

    @Test
    public void setAntwort_shouldReturnWithDefaultKGetAntwort(){
        frageDefaultKonstruktor.setAntwort("Samedan");
        assertEquals("Samedan", frageDefaultKonstruktor.getAntwort());
        assertNotEquals("samedan", frageDefaultKonstruktor.getAntwort());
    }

    @Test
    public void istAntwortRichtig_shouldEqualsAntwortWithUserAntwortLowerCase(){
        String userAntwort = "PARIS";
        userAntwort =userAntwort.toLowerCase(Locale.ROOT);
        assertEquals("paris",frage.getAntwort());
    }

    @Test
    public void istAntwortRichtig_shouldReturnScore(){
        String userAntwort = "paris";
        int score = 0;
        if (frage.getAntwort().equals(userAntwort)){
            score++;
        }
        assertEquals(1,score);
    }

    @Test
    public void istAntwortFalsch_shouldReturnScore(){
        String userAntwort = "Wien";
        int score = 0;
        if (frage.getAntwort().equals(userAntwort)){
            score++;
        }
        assertEquals(0,score);
    }


    @Test
    public void scoreAusgabe_shouldReturnScoreTextAnzahlFragen(){
        int score =0;


        assertEquals("Das Spiel ist nun Beendet. Sie haben " + score + " Punkte von " +
                Fragen.getAnzahlFragen() + " Fragen",Fragen.scoreAusgabe());
    }




}