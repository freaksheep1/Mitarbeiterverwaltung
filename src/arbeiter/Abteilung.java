package arbeiter;



public class Abteilung {

    private String name;
    private Mitarbeiter[] mitarbeiterArray;
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

    public Abteilung(String name, Manager leiter, int groesseArray) {
        this.name = name;
        this.leiter = leiter;
        mitarbeiterArray = new Mitarbeiter[groesseArray];
    }

//	}
//
//	public void add(Mitarbeiter neuer) {
//		mitarbeiter.add(neuer);
//	}

    public void add(Mitarbeiter neuer) {
        boolean listFull = true;
        for (int i = 0; i < mitarbeiterArray.length; i++) {
            if (mitarbeiterArray[i] == null) {
                mitarbeiterArray[i] = neuer;
                listFull = false;
                break;
            }
        }
        if (listFull == true) {
            throw new IllegalArgumentException("List ist voll");
        }
    }

    public void remove(Mitarbeiter entferneMitarbeiter) {

        for (int i = 0; i < mitarbeiterArray.length; i++) {
            if (mitarbeiterArray[i].getId() == entferneMitarbeiter.getId()) {
                mitarbeiterArray[i] = null;
                break;
            }
        }
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
        for(Mitarbeiter mitarbeiter : mitarbeiterArray) {
            if(mitarbeiter != null) {
                gehaltsListe += mitarbeiter.getName() + " : " + mitarbeiter.einkommen() + "\n";
            }
        }
        return gehaltsListe;

    }
}

