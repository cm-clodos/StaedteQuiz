package Quizgame;

import java.util.Locale;
import java.util.Objects;

public class Fragen {
    private static int score;
    private static int anzahlFragen = 0;



    private String frage;
    private String antwort;
    private String userantwort;

    public Fragen(){
        this.frage = "";
        this.antwort = "";
        this.userantwort = "";
        anzahlFragen++;
    }


// Konstruktor Ueberladen
    public Fragen(String frage, String antwort) {
        this.frage = frage;
        this.antwort = antwort;
        this.userantwort = "";
        anzahlFragen++;

    }

    public static int getAnzahlFragen() {
        return anzahlFragen;
    }

    public String getFrage() {
        return frage;
    }

    public void setFrage(String frage) {
        this.frage = frage;
    }

    public String getAntwort() {
        return antwort;
    }

    public String getUserantwort(){return userantwort;}



    public void setAntwort(String antwort) {
        this.antwort = antwort;
    }

    public String istAntwortRichtig(String userantwort){
        userantwort = userantwort.toLowerCase(Locale.ROOT);
        if (this.antwort.equals(userantwort)){
            score++;
            return "Richtig! Sie haben " + score + " Punkte";
        } else {
            return " Falsch! Sie haben " + score + " Punkte";
        }

    }
    public String inputUser(){
        userantwort = Prog1Tools.IOTools.readString("Wie lautet ihre Antwort?");
        return " Ihre Antwort lautet " + userantwort;
    }

    public static boolean spielWiederholen(){
        boolean ende = Prog1Tools.IOTools.readBoolean("Möchten Sie nochmals spielen?" +
                "true/ja, false/nein");
        score = 0;
        return ende;

    }

    public  static String scoreAusgabe(){
        return "Das Spiel ist nun Beendet. Sie haben " + score +
                " Punkte von " + anzahlFragen + " Fragen";
    }




}

