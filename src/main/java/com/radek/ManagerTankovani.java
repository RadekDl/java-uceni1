package com.radek;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ManagerTankovani {
    private List<Auto> autos = new ArrayList<>();
    private List<Tankovani> tankovaniList = new ArrayList<>();
    private List<Nadrze> nadrzeList = new ArrayList<>();

    public void pridatAuto(Auto auto){
        autos.add(auto);
    }

    public boolean odebratAuto(Auto auto){
        return autos.remove(auto);
    }

    public Auto najdiAutoDleSpz(String spz){
        for (Auto a : autos){
            if(a.getSpz().equalsIgnoreCase(spz)){
                return a;
            }
        }
        System.out.println(" SPZ nenalezena ");
        return null;
    }

    public void vypisVsechnaAuta(){
        for (Auto a : autos){
            System.out.println(a);
        }
    }

    public int pocetAut(){
        return autos.size();
    }

    public void pridatTankovani(Tankovani tankovani){
        tankovaniList.add(tankovani);
    }

    public boolean odebratTankovani(Tankovani tankovani){
        return tankovaniList.remove(tankovani);
    }

    public Tankovani najdiTankovaniDleDatumu(LocalDate datumTankovani){
        for (Tankovani t : tankovaniList){
            if (t.getDatumTankovani().equals(datumTankovani)){
                return t;
            }
        }
        return null;
    }
    public void vypisVsechnaTankovani(){
        for (Tankovani t : tankovaniList){
            System.out.println(t);
        }
    }

    public void pridatStavNadrze(Nadrze nadrze){
        nadrzeList.add(nadrze);
    }

    public boolean odebratStavNadrze(Nadrze nadrze){
        return nadrzeList.remove(nadrze);
    }

    public  void vypisVsechnyStavyNadrzi(){
        for(Nadrze n :nadrzeList){
            System.out.println(n);
        }
    }

    public double zjistiMinimum(Auto auto, LocalDate datum){
        double min = Double.MAX_VALUE;
        for (Nadrze n : nadrzeList){
            if (n.getAuto().getSpz().equals(auto.getSpz()) && n.getDatumAktualnihoStavuNadrze().equals(datum)){
                if (n.getAktualniStavNadrze() < min){
                    min = n.getAktualniStavNadrze();
                }
            }
        }
        return min;
    }

    public double zjistiMaximum(Auto auto,LocalDate datum){
        double max = 0;
        for (Nadrze n : nadrzeList){
            if (n.getAuto().getSpz().equals(auto.getSpz()) && n.getDatumAktualnihoStavuNadrze().equals(datum)){
                if (n.getAktualniStavNadrze()> max){
                    max = n.getAktualniStavNadrze();
                }
            }
        }
        return max;
    }

    public boolean overTankovani(Tankovani tankovani){
        double min = zjistiMinimum(tankovani.getAuto(), tankovani.getDatumTankovani());
        double max = zjistiMaximum(tankovani.getAuto(), tankovani.getDatumTankovani());
        double rozdil = max - min;
        return Math.abs(rozdil - tankovani.getNatankovaneLitryPaliva()) < 0.01;
    }

    public double zjistiPrirustek(Auto auto, LocalDate datum){
        double min = zjistiMinimum(auto, datum);
        double max = zjistiMaximum(auto, datum);
        return max - min;
    }

}