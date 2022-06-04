package Nasledjivanje;

import java.util.ArrayList;
import java.util.List;

public class Recept {
    String nazivRecepta;
    int  tezinaRecepta;
    List<SastojakRecepta> sastojakRecepata;

    public Recept(String nazivRecepta, int tezinaRecepta, List<SastojakRecepta> sastojakRecepata) {
        this.nazivRecepta = nazivRecepta;
        this.tezinaRecepta = tezinaRecepta;
        this.sastojakRecepata = sastojakRecepata;
    }

    public Recept() {
        this.nazivRecepta = "";
        this.tezinaRecepta = 0;
        sastojakRecepata = new ArrayList();
    }

    public String getNazivRecepta() {
        return nazivRecepta;
    }

    public void setNazivRecepta(String nazivRecepta) {
        this.nazivRecepta = nazivRecepta;
    }

    public int getTezinaRecepta() {
        return tezinaRecepta;
    }

    public void setTezinaRecepta(int tezinaRecepta) {
        this.tezinaRecepta = tezinaRecepta;
    }

    public List<SastojakRecepta> getSastojakRecepata() {
        return sastojakRecepata;
    }

    public void setSastojakRecepata(List<SastojakRecepta> sastojakRecepata) {
        this.sastojakRecepata = sastojakRecepata;
    }

    public String tezinaSastojka(){

        switch (this.tezinaRecepta){
            case 1: return "Pocetnik Nivo";
            case 2: return "Lak Nivo";
            case 3: return "Srednji Nivo";
            case 4: return "Tezak Nivo";
            case 5: return "Majstorski Nivo";
        }
       return "Kategorija ne postoji";
    }


    public void dodajSastojak(SastojakRecepta sr){
        this.sastojakRecepata.add(sr);
    }
    //Kroz listu nisam prolazio jer ocekujem da sastojak bude samo jednom spomenut
    public void ukloniSastojak(SastojakRecepta sr){
                sastojakRecepata.remove(sr);

    }

    public double ukupnaCenaRecepta(){
            double cena=0;
            for (SastojakRecepta sasRec : sastojakRecepata){
                cena+=sasRec.getCena()* sasRec.getKolicinaSastojka();
            }
        return cena;
    }

    public static ArrayList<Recept> filtrirajRecepte(ArrayList<Recept> recepts, int tezinaRecepta){
        ArrayList<Recept> list = new ArrayList<>();
        for (Recept r : recepts){
            if (r.getTezinaRecepta() == tezinaRecepta){
                list.add(r);
            }
        }
        return list;
    }

    public static ArrayList<Recept> filtrirajRecepte(ArrayList<Recept> recepts, int[] tezineRecepta){
        ArrayList<Recept> list = new ArrayList<>();
        for (int i = 0; i < tezineRecepta.length; i++) {
            for (int j = 0; j < recepts.size(); j++) {
                if (recepts.get(j).getTezinaRecepta() == tezineRecepta[i]){
                    list.add(recepts.get(j));
                }
            }
        }
        return list;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(nazivRecepta).append("\n");
        sb.append(tezinaSastojka()).append("\n");
        sb.append(sastojakRecepata).append("\n");

        return sb.toString();
    }
}
