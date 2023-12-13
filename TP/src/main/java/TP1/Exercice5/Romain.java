package TP1.Exercice5;

import java.util.HashMap;
import java.util.Map;

public class Romain {
    public static int romainToNombres(String nombreAConvertir) {

        if(nombreAConvertir.length() > 15) {
            throw new IllegalArgumentException("Le nombre romain ne doit pas excéder 15 caractères");
        }

        Map<Character, Integer> nombresRomains = new HashMap<>();

        nombresRomains.put('I', 1);
        nombresRomains.put('V', 5);
        nombresRomains.put('X', 10);
        nombresRomains.put('L', 50);
        nombresRomains.put('C', 100);
        nombresRomains.put('D', 500);
        nombresRomains.put('M', 1000);

        int chiffreArabe = 0;

        for (int i =0; i < nombreAConvertir.length(); i++){


        }


        return chiffreArabe;


    }

}
