package Nasledjivanje;

public class Sastojak {

    private String nazivSastojka;
    double cena;

    public Sastojak(String nazivSastojka, double cena) {
        this.nazivSastojka = nazivSastojka;
        this.cena = cena;
    }
    public Sastojak(){

        nazivSastojka="";
        cena = 0;
    }
    public String getNazivSastojka() {
        return nazivSastojka;
    }

    public void setNazivSastojka(String nazivSastojka) {
        this.nazivSastojka = nazivSastojka;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append(nazivSastojka).append('\n');
        sb.append(cena).append('\n');

        return sb.toString();
    }
}
