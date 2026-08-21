package com.radek;

import java.time.LocalDate;


public class Nadrze  {
    private Auto auto;
    private double aktualniStavNadrze;
    private LocalDate datumAktualnihoStavuNadrze;

    public Nadrze(Auto auto, double aktualniStavNadrze, LocalDate datumAktualnihoStavuNadrze) {
        setAuto(auto);
        setAktualniStavNadrze(aktualniStavNadrze);
        setDatumAktualnihoStavuNadrze(datumAktualnihoStavuNadrze);
    }

    public Auto getAuto() {
        return auto;
    }

    public void setAuto(Auto auto) {
        this.auto = auto;
    }

    public void setAktualniStavNadrze(double aktualniStavNadrze) {
        this.aktualniStavNadrze = aktualniStavNadrze;
    }

    public double getAktualniStavNadrze() {
        return aktualniStavNadrze;
    }

    public LocalDate getDatumAktualnihoStavuNadrze() {
        return datumAktualnihoStavuNadrze;
    }

    public void setDatumAktualnihoStavuNadrze(LocalDate datumAktualnihoStavuNadrze) {
        this.datumAktualnihoStavuNadrze = datumAktualnihoStavuNadrze;
    }



    @Override
    public String toString() {
        return " Nadrze{"+
        " auto= " + auto.getSpz() +
                ", aktuální stav v nádrži= "+ aktualniStavNadrze +
                ", datum aktuálního stavu nádrže = " + datumAktualnihoStavuNadrze +
                '}';
    }
}