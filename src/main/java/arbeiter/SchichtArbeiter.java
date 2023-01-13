package arbeiter;



public class SchichtArbeiter extends Mitarbeiter {

    private double stundenSatz;
    private int anzahlStunden;



    public double getStundenSatz() {
        return stundenSatz;
    }

    public void setStundenSatz(double stundenSatz) {
        this.stundenSatz = stundenSatz;
    }

    public int getAnzahlStunden() {
        return anzahlStunden;
    }

    public void setAnzahlStunden(int anzahlStunden) {
        this.anzahlStunden = anzahlStunden;
    }

    public SchichtArbeiter(int id, String name, int stundenSatz) {
        super(id, name);
        setId(id);
        this.stundenSatz = stundenSatz;
    }

    @Override
    protected void setId(int id) {
        if(id >= 3000 && id <= 3999) {
            this.id = id;
        } else {
            throw new IllegalArgumentException("ID is to low or high. Must be between 3000 and 3999.");
        }

    }

    @Override
    public double einkommen() {

        return anzahlStunden * stundenSatz;
    }

}

