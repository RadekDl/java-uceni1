package com.radek;

import java.util.Date;

public class Auto {
    private String spz;
    private String znacka;

    public Auto(String spz, String znacka) {
        setSpz(spz);
        setZnacka(znacka);
    }

    public String getSpz() {
        return spz;
    }

    public void setSpz(String spz) {
        this.spz = spz;
    }

    public String getZnacka() {
        return znacka;
    }

    public void setZnacka(String znacka) {
        this.znacka = znacka;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "spz= '" + spz + '\'' +
                ", znacka= '" + znacka + '\'' +
                '}';
    }
}
