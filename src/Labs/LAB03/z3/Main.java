package Labs.LAB03.z3;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        KonsolaDoGier ps5 = new KonsolaDoGier(
                "Sony",
                2000,
                true
        );


        KonsolaDoGier xbax = new KonsolaDoGier(
                "Microsoft",
                350,
                false
        );

        TelefonKomorkowy Nokia3310 = new TelefonKomorkowy("Nokia", 200, true);
        TelefonKomorkowy ipod = new TelefonKomorkowy("Apple", 900, false);
        TelefonStacjonarny stacjo = new TelefonStacjonarny("Orange", 1);
//        System.out.print("iPod: ");
//        ipod.wyslijSMS();

        ArrayList<Object> dzownienie = new ArrayList<>();
        dzownienie.add(Nokia3310);
        dzownienie.add(ipod);
        dzownienie.add(stacjo);

        System.out.println(Arrays.toString(dzownienie.toArray()));
    }
}
