package com.radek;

import java.time.LocalDate;

public class Nadrze extends Auto {
    private double minimum;
    private double maximum;
    private LocalDate datumMinimaAMaxima;

    public Nadrze(String spz, String znacka, double minimum, double maximum, LocalDate datumMinimaAMaxima) {
        super(spz, znacka);
        setMinimum(minimum);
        setMaximum(maximum);
        setDatumMinimaAMaxima(datumMinimaAMaxima);
    }

    public double getMinimum() {
        return minimum;
    }

    public void setMinimum(double minimum) {
        this.minimum = minimum;
    }

    public double getMaximum() {
        return maximum;
    }

    public void setMaximum(double maximum) {
        this.maximum = maximum;
    }

    public LocalDate getDatumMinimaAMaxima() {
        return datumMinimaAMaxima;
    }

    public void setDatumMinimaAMaxima(LocalDate datumMinimaAMaxima) {
        this.datumMinimaAMaxima = datumMinimaAMaxima;
    }

    @Override
    public String toString() {
        return super.toString() + " Nadrze{" +
                " minimum= " + minimum +
                ", maximum= " + maximum +
                ", datumMinimaAMaxima= " + datumMinimaAMaxima +
                '}';
    }
}