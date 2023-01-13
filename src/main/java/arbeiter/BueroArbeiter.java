package arbeiter;



public class BueroArbeiter extends Mitarbeiter {

    private double festgehalt;

    public double getFestgehalt() {
        return festgehalt;
    }

    public void setFestgehalt(double festgehalt) {
        this.festgehalt = festgehalt;
    }

    public BueroArbeiter(int id, String name, double festgehalt) {
        super(id, name);
        setId(id);
        this.festgehalt = festgehalt;
    }

    @Override
    protected void setId(int id) {
        if (id >= 5100 && id <= 5999) {
            this.id = id;
        } else {
            throw new IllegalArgumentException("ID is to low or high. Must be between 5100 and 5999.");
        }
    }

    @Override
    public double einkommen() {
        return festgehalt;
    }
}

