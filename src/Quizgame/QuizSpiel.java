package Quizgame;

public class QuizSpiel {
    public static void main(String[] args) {
        Fragen frage1 = new Fragen("Hauptstadt von Holland?", "amsterdam");
        Fragen frage2 = new Fragen("Hauptstadt von der Schweiz?", "bern");
        Fragen frage3 = new Fragen("Hauptstadt von Italien?", "rom");
        Fragen frage4 = new Fragen("Hauptstadt von England?", "london");




        boolean ende = true;

        while (ende) {

            QuizFragenStarten(frage1, frage2, frage3, frage4);


            ende = Fragen.spielWiederholen();
        }

    }

    private static void QuizFragenStarten(Fragen frage1, Fragen frage2, Fragen frage3, Fragen frage4) {
        System.out.println(frage1.getFrage());
        System.out.println(frage1.inputUser());
        System.out.println(frage1.istAntwortRichtig(frage1.getUserantwort()));

        System.out.println(frage2.getFrage());
        System.out.println(frage2.inputUser());
        System.out.println(frage2.istAntwortRichtig(frage2.getUserantwort()));

        System.out.println(frage3.getFrage());
        System.out.println(frage3.inputUser());
        System.out.println(frage3.istAntwortRichtig(frage3.getUserantwort()));

        System.out.println(frage4.getFrage());
        System.out.println(frage4.inputUser());
        System.out.println(frage4.istAntwortRichtig(frage4.getUserantwort()));

        System.out.println(Fragen.scoreAusgabe());

    }
}
