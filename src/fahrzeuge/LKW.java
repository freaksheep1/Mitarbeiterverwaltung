package fahrzeuge;

import fuehrerschein.FuehrerscheinKlasse;

public class LKW extends Kfz implements Comparable<LKW>{

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
            System.out.println("LWK wurde um " + menge + " beladen.");
        } else {
            setBeladung(ladeflaeche);
            System.out.println("Der LKW wurde voll beladen, der Rest bleibt neben dem LWK liegen.");
        }
    }

    public void entladen(float menge) {

        if (beladung - menge > 0) {
            setBeladung(beladung - menge);
        } else {
            setBeladung(0);
            System.out.println("Der LWK wurde komplett entladen");
        }
    }
    @Override
    public float auslastung() {
        return this.beladung / this.ladeflaeche * 100;
    }

    @Override
    public int compareTo(LKW o) {
        Float lkw1 = this.auslastung();
        Float lkw2 = o.auslastung();

        return lkw1.compareTo(lkw2);
    }
}
