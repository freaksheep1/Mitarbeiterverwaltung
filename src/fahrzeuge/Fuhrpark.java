package fahrzeuge;

import arbeiter.Mitarbeiter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Fuhrpark  {

    String name;
    List<Kfz> fahrzeuge;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Kfz> getFahrzeuge() {
        return fahrzeuge;
    }

    public void setFahrzeuge(List<Kfz> fahrzeuge) {
        this.fahrzeuge = fahrzeuge;
    }

    public Fuhrpark(String name) {
        this.name = name;
        this.fahrzeuge = new ArrayList<>();
    }

    public void add(Kfz kfz) {
        this.fahrzeuge.add(kfz);
        Collections.sort(this.fahrzeuge, new Kfz.AuslastungComparator());
    }

    public void remove(Kfz kfz) {
        this.fahrzeuge.remove(kfz);
        Collections.sort(this.fahrzeuge, new Kfz.AuslastungComparator());
    }
}


