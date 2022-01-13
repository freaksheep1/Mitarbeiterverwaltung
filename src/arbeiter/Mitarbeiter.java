package arbeiter;


public abstract class Mitarbeiter {

    protected int id;
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

}

