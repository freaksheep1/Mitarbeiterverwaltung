package fahrzeuge;

import arbeiter.Mitarbeiter;
import fuehrerschein.FuehrerscheinKlasse;

import java.util.List;

public abstract class Kfz {

    private int anzahlSitze;
    private int aktuellErhaltenePersonen;
    private int tankGroesse;
    private double tankinhalt;
    private int aktuelleGeschwindigkeit;
    private int maximaleGeschwindigkeit;
    private float anschaffungskosten;
    private GPS aktuelleGPSPosition;
    private Fahrer fahrer;
    private boolean motorstand;
    private List<Mitarbeiter> passagiere;
    protected FuehrerscheinKlasse benoetigteKlasse;


    public Kfz(int anzahlSitze, int tankGroesse, double tankinhalt,  int maximaleGeschwindigkeit, float anschaffungskosten) {
        this.anzahlSitze = anzahlSitze;
        this.tankGroesse = tankGroesse;
        this.tankinhalt = tankinhalt;
        this.maximaleGeschwindigkeit = maximaleGeschwindigkeit;
        this.anschaffungskosten = anschaffungskosten;



    }

    public void bremsen(int geschwindigkeit) {

        if(geschwindigkeit - this.aktuelleGeschwindigkeit < 0) {

        }

    }

    public void beschleuinigen (){

    }

    public void fahren(GPS gpsPosition) {

    }

    public void aussteigen(int sitzplatzNr) {

    }

    public void tanken () {

    }

    public void bewegungsdaten() {

    }

    public void einsteigenFahrer( Fahrer fahrer) {

    }

    public void einsteigenPassagier (Mitarbeiter mitarbeiter) {

    }

    public void parken() {

    }

    public void auslastung() {

    }
}
