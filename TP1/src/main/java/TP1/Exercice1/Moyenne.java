package TP1.Exercice1;

public class Moyenne {

    public static double getMoyenne(double[] notes) throws IllegalAccessException {

        verifierSi3Notes(notes);

        verifierSiNotesComprisesEntre0et20(notes);

        return calculerMoyenne(notes);
    }

    /**
     * Calcule la moyenne en fonction des notes saisies
     * @param notes double - notes
     * @return double - la moyenne de l'élève
     */
    private static double calculerMoyenne(double[] notes) {
        double moyenne = 0;

        for (double note: notes) {
            moyenne += note;
        }

        return moyenne / notes.length;
    }

    /**
     * Vérifie si toutes les notes sont bien comprises entre 0 et 20
     * @param notes double : les notes
     */
    private static void verifierSiNotesComprisesEntre0et20(double[] notes) throws IllegalArgumentException {
        for (double note: notes) {
            if (note < 0 || note > 20) {
                throw new IllegalArgumentException("Les notes doivent être comprises entre 0 et 20 !");
            }
        }
    }

    /**
     * Lève une exception si le nombre de notes est différent de trois.
     * @param notes double : Le carnet de notes de l'élève
     */
    private static void verifierSi3Notes(double[] notes) throws IllegalArgumentException {
        if (notes.length != 3) {
            throw new IllegalArgumentException("Il doit y avoir 3 notes");
        }
    }
}