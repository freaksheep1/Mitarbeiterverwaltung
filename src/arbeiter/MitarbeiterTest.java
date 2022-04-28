package arbeiter;

import fahrzeuge.Kfz;
import fahrzeuge.LKW;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MitarbeiterTest {

    public static void main(String[] args) {

        List<Mitarbeiter> mitarbeiterList = new ArrayList<>();

        BueroArbeiter arbeiter1 = new BueroArbeiter(5201, "Zelian", 123);
        BueroArbeiter arbeiter2 = new BueroArbeiter(5202, "B", 123);
        BueroArbeiter arbeiter3 = new BueroArbeiter(5203, "F", 123);
        BueroArbeiter arbeiter4 = new BueroArbeiter(5204, "D", 123);
        SchichtArbeiter arbeiter5 = new SchichtArbeiter(3002, "Anton", 123);
        SchichtArbeiter arbeiter6 = new SchichtArbeiter(3500, "C", 123);

        mitarbeiterList.add(arbeiter1);
        mitarbeiterList.add(arbeiter2);
        mitarbeiterList.add(arbeiter3);
        mitarbeiterList.add(arbeiter4);
        mitarbeiterList.add(arbeiter5);
        mitarbeiterList.add(arbeiter6);

        for (Mitarbeiter mitarbeiter : mitarbeiterList) {
            System.out.println(mitarbeiter.getName());
        }

        Collections.sort(mitarbeiterList);

        System.out.println("-------------------------------");
        for (Mitarbeiter mitarbeiter : mitarbeiterList) {
            System.out.println(mitarbeiter.getName());
        }


        List<LKW> lkws = new ArrayList<>();
        LKW lkw1 = new LKW(3,100,50,100,20000,100);
        LKW lkw2 = new LKW(3,100,50,100,20000,100);
        LKW lkw3 = new LKW(3,100,50,100,20000,100);
        LKW lkw4 = new LKW(3,100,50,100,20000,100);
        LKW lkw5 = new LKW(3,100,50,100,20000,100);

        lkws.add(lkw1);
        lkws.add(lkw2);
        lkws.add(lkw3);
        lkws.add(lkw4);
        lkws.add(lkw5);



        for(LKW lkw : lkws) {
            System.out.println(lkw.auslastung());
        }

    }
}
