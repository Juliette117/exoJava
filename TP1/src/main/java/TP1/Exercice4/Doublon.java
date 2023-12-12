package TP1.Exercice4;

import java.util.Arrays;
import java.util.HashMap;

public class Doublon {

    public static boolean estUnDoublon(int[] nombres) {
        // On déclare le hashmap
        HashMap<Integer, Integer> vues = new HashMap<>();

        // Puis, on parcourt le tableau de nombres
        // --> Ici c'est une syntaxe for-each, plus rapide à écrire,
        // et préférable car ici nous n'avons pas besoin de l'index
        for (int nombre : nombres) {
            // Si le nombres est déjà présent dans le tableau
            if (vues.containsKey(nombre) && vues.get(nombre) >= 1) {
                // On return true
                return true;
            }
            // Si non, on l'ajoute avec une valeur par défaut à 1.
            vues.put(nombre, vues.getOrDefault(nombre, 0) + 1);
        }

        return false;
    }

}
