package arbeiter;


import java.util.Comparator;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class Abteilung {

    private String name;
    private SortedSet<Mitarbeiter> mitarbeiterSet;
    private Manager leiter;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Manager getLeiter() {
        return leiter;
    }

    public void setLeiter(Manager leiter) {
        this.leiter = leiter;
    }

    public Abteilung(String name, Manager leiter) {
        this.name = name;
        this.leiter = leiter;
        mitarbeiterSet = new TreeSet(new NameComparator());
    }

//	}
//
//	public void add(Mitarbeiter neuer) {
//		mitarbeiter.add(neuer);
//	}

    public void add(Mitarbeiter mitarbeiter) {
        this.mitarbeiterSet.add(mitarbeiter);
    }

    public void remove(Mitarbeiter mitarbeiter) {
        this.mitarbeiterSet.remove(mitarbeiter);
    }

    public Manager changeLeiter(Manager neuer) {
        Manager manager = this.leiter;
        this.leiter = neuer;
        return manager;
    }

//	public String gehaltsListe() {
//		Map<Integer, Double> einkommen = new HashMap<>();
//		mitarbeiter.stream().forEach(mitarbeiter -> einkommen.put(mitarbeiter.getId(), mitarbeiter.einkommen()));
//		return einkommen.toString();
//	}

    public String gehaltsListe() {
        String gehaltsListe = "";
        for(Mitarbeiter mitarbeiter : mitarbeiterSet) {
            gehaltsListe += mitarbeiter.getName() + " : " + mitarbeiter.einkommen() + "\n";
        }
        return gehaltsListe;

    }

    public class NameComparator implements Comparator<Mitarbeiter> {

        @Override
        public int compare(Mitarbeiter o1, Mitarbeiter o2) {
             return o1.getName().compareTo(o2.getName());
        }
    }
}

