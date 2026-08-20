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
}