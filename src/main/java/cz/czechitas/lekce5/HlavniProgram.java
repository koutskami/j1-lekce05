package cz.czechitas.lekce5;

import cz.czechitas.lekce5.model.Osoba;

import java.util.concurrent.ThreadFactory;

/**
 * Hlaví třída pro lekci 5.
 */
public class HlavniProgram {

    /**
     * Spouštěcí metoda celé aplikace.
     *
     * @param args
     */
    public static void main(String... args) {
        //TODO tady bude náš kód


        System.out.println("Slavnostně přísahám, že jsem připraven ke každé špatnosti.");

        Adresa ceska = new Adresa();
        ceska.setPsc("12345");
        System.out.println(ceska.getPsc());
    }
}
