package Nasledjivanje;

public class SastojakRecepta extends Sastojak{

    double kolicinaSastojka;

    public SastojakRecepta(String nazivSastojka, double cena, double gramaza) {
        super(nazivSastojka, cena);
        this.kolicinaSastojka = gramaza;
    }
    public SastojakRecepta(){
        super();
        this.kolicinaSastojka = 0;
    }
    public double getKolicinaSastojka() {
        return kolicinaSastojka;
    }

    public void setKolicinaSastojka(double kolicinaSastojka) {
        this.kolicinaSastojka = kolicinaSastojka;
    }

    public double ukupnaCena(){
        return this.kolicinaSastojka * this.cena;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.getNazivSastojka());

        return sb.toString();
    }
}
