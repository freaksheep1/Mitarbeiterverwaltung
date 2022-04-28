package arbeiter;


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

       return this.name.compareTo(o.getName()) ;
    }
}

