package com.radek;

import java.time.LocalDate;



public class Main {
    static void main() {

        ManagerTankovani managerTankovani = new ManagerTankovani();
        managerTankovani.pridatAuto(new Auto("1BH3454", "Volvo"));
        managerTankovani.pridatAuto(new Auto("4BX6776", "Iveco"));



        Tankovani t = new Tankovani(new Auto("11111", "Volvo"), LocalDate.of(2026, 1, 6), 400);
        managerTankovani.pridatTankovani(t);
        Tankovani t2 = new Tankovani(new Auto("22222", "Volvo"), LocalDate.of(2026, 1, 6), 400);
        managerTankovani.pridatTankovani(t2);


        managerTankovani.vypisVsechnaAuta();
        managerTankovani.vypisVsechnaTankovani();

        managerTankovani.pridatStavNadrze(new Nadrze(new Auto("11111","Volvo"),500,LocalDate.of(2026,1,6)));
        managerTankovani.pridatStavNadrze(new Nadrze(new Auto("11111","Volvo"),400,LocalDate.of(2026,1,6)));
        managerTankovani.pridatStavNadrze(new Nadrze(new Auto("11111","Volvo"),300,LocalDate.of(2026,1,6)));
        managerTankovani.pridatStavNadrze(new Nadrze(new Auto("11111","Volvo"),150,LocalDate.of(2026,1,6)));
        managerTankovani.pridatStavNadrze(new Nadrze(new Auto("11111","Volvo"),500,LocalDate.of(2026,1,6)));
        managerTankovani.pridatStavNadrze(new Nadrze(new Auto("11111","Volvo"),200,LocalDate.of(2026,1,6)));
        managerTankovani.pridatStavNadrze(new Nadrze(new Auto("11111","Volvo"),320,LocalDate.of(2026,1,6)));
        managerTankovani.pridatStavNadrze(new Nadrze(new Auto("11111","Volvo"),480,LocalDate.of(2026,1,6)));
        managerTankovani.pridatStavNadrze(new Nadrze(new Auto("11111","Volvo"),550,LocalDate.of(2026,1,6)));

        managerTankovani.pridatStavNadrze(new Nadrze(new Auto("22222","Volvo"),500,LocalDate.of(2026,1,6)));
        managerTankovani.pridatStavNadrze(new Nadrze(new Auto("22222","Volvo"),400,LocalDate.of(2026,1,6)));
        managerTankovani.pridatStavNadrze(new Nadrze(new Auto("22222","Volvo"),300,LocalDate.of(2026,1,6)));
        managerTankovani.pridatStavNadrze(new Nadrze(new Auto("22222","Volvo"),150,LocalDate.of(2026,1,6)));
        managerTankovani.pridatStavNadrze(new Nadrze(new Auto("22222","Volvo"),500,LocalDate.of(2026,1,6)));
        managerTankovani.pridatStavNadrze(new Nadrze(new Auto("22222","Volvo"),200,LocalDate.of(2026,1,6)));
        managerTankovani.pridatStavNadrze(new Nadrze(new Auto("22222","Volvo"),320,LocalDate.of(2026,1,6)));
        managerTankovani.pridatStavNadrze(new Nadrze(new Auto("22222","Volvo"),480,LocalDate.of(2026,1,6)));
        managerTankovani.pridatStavNadrze(new Nadrze(new Auto("22222","Volvo"),550,LocalDate.of(2026,1,6)));

        double prirustek = managerTankovani.zjistiPrirustek(t.getAuto(), t.getDatumTankovani());
        System.out.println("Přírůstek v nádrži: " +t.getAuto()+" "+ prirustek);

        System.out.println("Tankování sedí: " + (managerTankovani.overTankovani(t) ? "ano" : "ne"));

        double prirustek1 = managerTankovani.zjistiPrirustek(t2.getAuto(), t2.getDatumTankovani());
        System.out.println("Přírůstek v nádrži: " +t2.getAuto()+" "+ prirustek1);

        System.out.println("Tankování sedí: " + (managerTankovani.overTankovani(t2) ? "ano" : "ne"));

    }

}