package arbeiter;


import java.util.Comparator;

public abstract class Mitarbeiter implements Comparable<Mitarbeiter> {

    protected Integer id;
    private String name;



    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Mitarbeiter(int id, String name) {
        this.id = id;
        this.name = name;
    }

    protected abstract void setId(int id);

    public abstract double einkommen();

    @Override
    public int compareTo(Mitarbeiter o) {

        return this.name.compareTo(o.getName());
    }

    public int compareGehalt(Mitarbeiter m1) {
        MitarbeiterComparator mc = new MitarbeiterComparator();
        return mc.compare(this,m1);
    }

    public  class MitarbeiterComparator implements Comparator<Mitarbeiter> {

        @Override
        public int compare(Mitarbeiter o1, Mitarbeiter o2) {
            if (o1.einkommen() > o2.einkommen()) {
                return 1;
            } else if (o1.einkommen() < o2.einkommen()) {
                return -1;
            } else {
               return 0;
            }
        }
    }
}

