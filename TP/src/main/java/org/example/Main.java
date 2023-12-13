package org.example;

import TP1.Exercice1.Moyenne;
import TP1.Exercice2.prixTTC;
import TP1.Exercice3.Palindrome;
import TP1.Exercice4.Doublon;
import TP1.Exercice5.Romain;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) throws IllegalAccessException {

     double[] notes = {10, 12, 17};

     int[] nombres = {1, 2, 3, 2};


        System.out.println(Moyenne.getMoyenne(notes));
        System.out.println(prixTTC.calculerTaxes(10));
        System.out.println(Palindrome.estUnPalindrome(121));
        System.out.println(Doublon.estUnDoublon(nombres));
        System.out.println(Romain.romainToNombres("V"));
        System.out.println();

    }
}



