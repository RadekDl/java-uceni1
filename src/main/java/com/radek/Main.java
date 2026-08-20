package com.radek;

import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.


//Dobrý plán na zítra – zapíšu si to, ať na to hned navážeme. V kostce si to shrnu, ať víš, kde začneme:
//Chceš metodu v ManagerTankovani, která pro dané vozidlo a datum:
//Najde Tankovani s daným datem a vozem → zjistí natankovaneLitryPaliva
//Najde Nadrze se stejným datem (a stejným vozem) → spočítá rozdíl maximum - minimum
//Porovná, jestli se ty dvě hodnoty rovnají (kontrola, že natankované litry odpovídají nárůstu v nádrži)

public class Main {
    static void main() {

        ManagerTankovani managerTankovani = new ManagerTankovani();
        managerTankovani.pridatAuto(new Auto("1BH3454", "Volvo"));
        managerTankovani.pridatAuto(new Auto("4BX6776", "Iveco"));
        managerTankovani.pridatTankovani(new Tankovani(new Auto("1BA1234", "Volvo"), LocalDate.of(2026, 8, 22), 400));
        managerTankovani.vypisVsechnaAuta();
        managerTankovani.vypisVsechnaTankovani();
    }
}
