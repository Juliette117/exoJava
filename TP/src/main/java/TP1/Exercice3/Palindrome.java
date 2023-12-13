package TP1.Exercice3;

public class Palindrome {

    /**
     * Verifie si le nombre est un palindrome ou non
     * @param nombre long : Nombre à vérifier
     * @return Boolean [True ou False]
     */

        public static boolean estUnPalindrome(long nombre) {

            verifierSiNbreADeuxChiffres(nombre);

            long inverse = inverserNombre(nombre);

            return nombre == inverse;
        }

    /**
     * Inverse le nombre donné
     * Ex 123 devient 321
     * @param nombre long : Nombre à inverser
     * @return long [Le nombre inversé]
     */


    private static long inverserNombre(long nombre) {

        long nombreInverse = 0;
        long decompte = nombre;

        while (decompte != 0) {
            long reste = decompte % 10;

            nombreInverse = nombreInverse * 10 + reste;

            decompte /= 10;
        }

        return nombreInverse;
    }

    private static void verifierSiNbreADeuxChiffres(long nombre) {

        if(nombre < 9) {
            throw new IllegalArgumentException("Il faut deux chiffres pour avoir un nombre");
        }

    }
}
