package meetkunde.controller;

import meetkunde.model.Cirkel;
import meetkunde.model.Figuur;
import meetkunde.model.Punt;
import meetkunde.model.Rechthoek;

/**
 * @author Vincent Velthuizen <v.r.velthuizen@pl.hanze.nl>
 * <p>
 * Gebruik mijn Meetkunde code en laat zien dat het allemaal netjes werkt.
 */
public class MeetkundeLauncher {

    public static void main(String[] args) {
        Cirkel mijnCirkel = new Cirkel(3, new Punt(2, 5), "groen");
        Rechthoek mijnRechthoek = new Rechthoek(3, 4, new Punt(-2, 6),
                "blauw");

        Figuur[] figuren = new Figuur[4];
        figuren[0] = mijnCirkel;
        figuren[1] = mijnRechthoek;
        figuren[2] = new Cirkel(10, new Punt(-1,-3), "karmozijn");
        for (int figuurTeller = 0; figuurTeller < 3; figuurTeller++) {
            toonInformatie(figuren[figuurTeller]);
        }
    }

    public static void toonInformatie(Figuur figuur) {
        System.out.println(figuur.geefOmtrek());
        System.out.println(figuur.vertelOverGrootte());
    }

}
