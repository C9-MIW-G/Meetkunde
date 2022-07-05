package meetkunde.controller;

import meetkunde.model.*;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Vincent Velthuizen <v.r.velthuizen@pl.hanze.nl>
 * <p>
 * Gebruik mijn Meetkunde code en laat zien dat het allemaal netjes werkt.
 */
public class MeetkundeLauncher {

    public static void main(String[] args) {
        Oppervlak mijnA4 = new Oppervlak(20, 30);
        mijnA4.voegFiguurToe(new Cirkel());
        mijnA4.voegFiguurToe(new Rechthoek());

        System.out.println(mijnA4);

        ArrayList<Cirkel> mijnCirkels = new ArrayList<>();

        mijnCirkels.add(new Cirkel(3, new Punt(1, 4), "groen"));
        mijnCirkels.add(new Cirkel());
        mijnCirkels.add(new Cirkel(6));

//        System.out.printf("Er zijn nu %d cirkels.\n", mijnCirkels.size());
//        System.out.printf("De straal van de tweede cirkel is: %f.\n", mijnCirkels.get(1).getStraal());
//        System.out.println(mijnCirkels.remove(2));
//
//        for (Cirkel mijnCirkel : mijnCirkels) {
//            System.out.println(mijnCirkel);
//        }
    }

    public static void toonInformatie(Figuur figuur) {
        System.out.println(figuur.geefOmtrek());
        System.out.println(figuur.vertelOverGrootte());
    }

}
