package arbeiter;

import fahrzeuge.GPS;
import fahrzeuge.Kfz;
import fuehrerschein.Fuehrerschein;

public class Fahrer extends SchichtArbeiter {

    private Fuehrerschein fuehrerschein;

    public Fahrer(int id, String name, int stundenSatz) {
        super(id, name, stundenSatz);
    }

    public Fuehrerschein getFuehrerschein() {
        return fuehrerschein;
    }

    public void setFuehrerschein(Fuehrerschein fuehrerschein) {
        this.fuehrerschein = fuehrerschein;
    }



    public void fahren(GPS gpsPosition, Kfz kfz) {

    }
}
