package fahrzeuge;

public class LKW {

    private float ladeflaeche;
    private float beladung;

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

    public LKW (float ladeflaeche) {
        this.beladung = 0;
        this.ladeflaeche = ladeflaeche;
    }

    public void beladen (float menge) {

       if(beladung + menge <= ladeflaeche) {
           this.beladung += menge;
       } else {
           System.out.println("Full");
       }
    }

    public void entladen (float menge) {

        if(beladung - menge >= 0) {
            this.beladung += menge;
        } else {
            System.out.println("Empty");
        }
    }

    public float auslastung () {
        return this.beladung / this.ladeflaeche * 100;
    }

}
