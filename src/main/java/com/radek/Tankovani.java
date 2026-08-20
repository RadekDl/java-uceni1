package com.radek;

import java.time.LocalDate;

public class Tankovani {
    private Auto auto;
    private LocalDate datumTankovani;
    private double natankovaneLitryPaliva;

    public Tankovani(Auto auto, LocalDate datumTankovani, double natankovaneLitryPaliva) {
        setAuto(auto);
        setDatumTankovani(datumTankovani);
        setNatankovaneLitryPaliva(natankovaneLitryPaliva);
    }

    public Auto getAuto() {
        return auto;
    }

    public void setAuto(Auto auto) {
        this.auto = auto;
    }

    public LocalDate getDatumTankovani() {
        return datumTankovani;
    }

    public void setDatumTankovani(LocalDate datumTankovani) {
        this.datumTankovani = datumTankovani;
    }

    public double getNatankovaneLitryPaliva() {
        return natankovaneLitryPaliva;
    }

    public void setNatankovaneLitryPaliva(double natankovaneLitryPaliva) {
        this.natankovaneLitryPaliva = natankovaneLitryPaliva;
    }

    @Override
    public String toString() {
        return "Tankovani{" +
                "auto= " + auto.getSpz() +
                ", datum tankovani= " + datumTankovani +
                ", natankované litry paliva= " + natankovaneLitryPaliva +
                '}';
    }
}