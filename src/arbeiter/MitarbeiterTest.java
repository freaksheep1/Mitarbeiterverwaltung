package arbeiter;

import fahrzeuge.Kfz;
import fahrzeuge.LKW;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MitarbeiterTest {

    public static void main(String[] args) {

        List<Mitarbeiter> mitarbeiterList = new ArrayList<>();

        BueroArbeiter arbeiter1 = new BueroArbeiter(5201, "Zelian", 1200);
        BueroArbeiter arbeiter2 = new BueroArbeiter(5202, "B", 2100);
        BueroArbeiter arbeiter3 = new BueroArbeiter(5203, "F", 1500);
        BueroArbeiter arbeiter4 = new BueroArbeiter(5204, "D", 3000);
        SchichtArbeiter arbeiter5 = new SchichtArbeiter(3002, "Anton", 14);
        arbeiter5.setAnzahlStunden(40);
        SchichtArbeiter arbeiter6 = new SchichtArbeiter(3500, "C", 23);
        arbeiter6.setAnzahlStunden(40);

        mitarbeiterList.add(arbeiter1);
        mitarbeiterList.add(arbeiter2);
        mitarbeiterList.add(arbeiter3);
        mitarbeiterList.add(arbeiter4);
        mitarbeiterList.add(arbeiter5);
        mitarbeiterList.add(arbeiter6);

        for (Mitarbeiter mitarbeiter : mitarbeiterList) {
            System.out.println(mitarbeiter.getName());
        }

        Collections.sort(mitarbeiterList, new Mitarbeiter.MitarbeiterComparator());

        System.out.println("-------------------------------");
        for (Mitarbeiter mitarbeiter : mitarbeiterList) {
            System.out.println(mitarbeiter.getName() + " " + mitarbeiter.einkommen());
        }


        List<LKW> lkws = new ArrayList<>();
        LKW lkw1 = new LKW(3,100,50,100,20000,100);
        LKW lkw2 = new LKW(3,100,50,100,20000,100);
        LKW lkw3 = new LKW(3,100,50,100,20000,100);
        LKW lkw4 = new LKW(3,100,50,100,20000,100);
        LKW lkw5 = new LKW(3,100,50,100,20000,100);

        lkw1.setBeladung(20);
        lkw2.setBeladung(40);
        lkw3.setBeladung(10);
        lkw4.setBeladung(70);
        lkw5.setBeladung(1);


        lkws.add(lkw1);
        lkws.add(lkw2);
        lkws.add(lkw3);
        lkws.add(lkw4);
        lkws.add(lkw5);

        for(LKW lkw : lkws) {
            System.out.println(lkw.auslastung());
        }

        Collections.sort(lkws);
        System.out.println("-------------------------------");


        for(LKW lkw : lkws) {
            System.out.println(lkw.auslastung());
        }

    }
}
