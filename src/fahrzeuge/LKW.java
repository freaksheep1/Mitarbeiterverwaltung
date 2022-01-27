package fahrzeuge;

import fuehrerschein.FuehrerscheinKlasse;

public class LKW extends Kfz{

    private float ladeflaeche;
    private float beladung;

    public LKW(int anzahlSitze, int tankGroesse, double tankinhalt, int maximaleGeschwindigkeit, float anschaffungskosten, float ladeflaeche) {
        super(anzahlSitze, tankGroesse, tankinhalt, maximaleGeschwindigkeit, anschaffungskosten);
        this.ladeflaeche = ladeflaeche;
        this.benoetigteKlasse = FuehrerscheinKlasse.D;
    }

    public float getLadeflaeche() {
        return ladeflaeche;
    }

    public void setLadeflaeche(float ladeflaeche) {
        this.ladeflaeche = ladeflaeche;
    }

    public float getBeladung() {
        return beladung;
    }

    public void setBeladung(float beladung) {
        this.beladung = beladung;
    }



    public void beladen(float menge) {

        if (beladung + menge <= ladeflaeche) {
            setBeladung(beladung + menge);
        } else {
            setBeladung(ladeflaeche);
            System.out.println("Voll");
        }
    }

    public void entladen(float menge) {

        if (beladung - menge > 0) {
            setBeladung(beladung - menge);
        } else {
            setBeladung(0);
            System.out.println("Leer");
        }
    }
    @Override
    public float auslastung() {
        return this.beladung / this.ladeflaeche * 100;
    }

}
