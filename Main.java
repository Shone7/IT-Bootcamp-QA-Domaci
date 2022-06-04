package Nasledjivanje;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

       SastojakRecepta spagete = new SastojakRecepta("Spagete",0.05,500);
       SastojakRecepta pavlakaZaKuvanje = new SastojakRecepta("Pavlaka za Kuvanje",0.18,250);
       SastojakRecepta beliLuk = new SastojakRecepta("Beli luk",0.01,20);
       SastojakRecepta cureceMeso = new SastojakRecepta("Curece meso",1.45,250);
       SastojakRecepta maslac = new SastojakRecepta("Maslac",0.80,45);
       SastojakRecepta jaja = new SastojakRecepta("Jaja",12.5,2);
       SastojakRecepta biber = new SastojakRecepta("Biber",0.01,3);
       SastojakRecepta so = new SastojakRecepta("So",0.03,18);

       ArrayList<SastojakRecepta> sasRec = new ArrayList<>();
       sasRec.add(spagete);
       sasRec.add(pavlakaZaKuvanje);
       sasRec.add(beliLuk);
       sasRec.add(cureceMeso);
       sasRec.add(maslac);
       sasRec.add(jaja);
       sasRec.add(biber);
       sasRec.add(so);
       Recept recept = new Recept("Spagete u belom sosu",3,sasRec);
       System.out.println(recept);
       System.out.println(recept.ukupnaCenaRecepta());

        System.out.println("***********************************************************");

        SastojakRecepta krompir = new SastojakRecepta("Krompir",0.10,1000);
        SastojakRecepta mesoSvinjsko = new SastojakRecepta("Svinjsko Meso",1.4,500);
        SastojakRecepta ulje = new SastojakRecepta("Ulje",0.7,40);

        ArrayList<SastojakRecepta> sasRec1 = new ArrayList<>();
        sasRec1.add(krompir);
        sasRec1.add(mesoSvinjsko);
        sasRec1.add(ulje);
        Recept recept1 = new Recept("Krompir i meso",1,sasRec1);
        System.out.println(recept1);
        System.out.println(recept1.ukupnaCenaRecepta());

        System.out.println("***********************************************************");

        SastojakRecepta mlevenoMeso = new SastojakRecepta("Mleveno Meso",0.05,500);
        SastojakRecepta crniLuk = new SastojakRecepta("Crni luk",0.01,100);
        SastojakRecepta sargarepa = new SastojakRecepta("Sargarepa",0.2,100);
        SastojakRecepta paradajzSok = new SastojakRecepta("Paradajz Sok",0.14,200);

        ArrayList<SastojakRecepta> sasRec2 = new ArrayList<>();
        sasRec2.add(spagete);
        sasRec2.add(mlevenoMeso);
        sasRec2.add(crniLuk);
        sasRec2.add(sargarepa);
        sasRec2.add(paradajzSok);

        Recept recept2 = new Recept("Spagete Bolonjeze",3,sasRec2);
        System.out.println(recept2);
        System.out.println(recept2.ukupnaCenaRecepta());

        System.out.println("***********************************************************");

        SastojakRecepta kobasice = new SastojakRecepta("Kobasice",0.02,130);

        ArrayList<SastojakRecepta> sasRec3 = new ArrayList<>();
        sasRec3.add(jaja);
        sasRec3.add(kobasice);
        sasRec3.add(ulje);
        Recept recept3 = new Recept("Jaja i kobasice",1,sasRec3);
        System.out.println(recept3);
        System.out.println(recept3.ukupnaCenaRecepta());

        System.out.println("***********************************************************");

        ArrayList<Recept> r = new ArrayList<>();
        r.add(recept);
        r.add(recept1);
        System.out.println(Recept.filtrirajRecepte(r,3));

        System.out.println("Recepti*******************");
        ArrayList<Recept> rec = new ArrayList<>();
        rec.add(recept);
        rec.add(recept1);
        rec.add(recept2);
        rec.add(recept3);
        System.out.println(Recept.filtrirajRecepte(rec,new int[]{1,3}));

    }
}
