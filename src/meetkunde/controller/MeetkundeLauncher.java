package meetkunde.controller;

import meetkunde.model.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Vincent Velthuizen <v.r.velthuizen@pl.hanze.nl>
 * <p>
 * Gebruik mijn Meetkunde code en laat zien dat het allemaal netjes werkt.
 */
public class MeetkundeLauncher {

    public static void main(String[] args) {
        ArrayList<String> regelsUitBestand = new ArrayList<>();
        File rechthoekenBestand = new File("resources/Rechthoek.csv");

        try {
            Scanner bestandScanner = new Scanner(rechthoekenBestand);
            while (bestandScanner.hasNextLine()) {
                regelsUitBestand.add(bestandScanner.nextLine());
            }
        } catch (FileNotFoundException fileNotFoundException) {
            System.out.println("Het bestand kon niet gevonden worden.");
        }

        if (regelsUitBestand.size() > 0) {
            ArrayList<Rechthoek> rechthoeken = new ArrayList<>();

            for (String regel : regelsUitBestand) {
                String[] regelWaarden = regel.split(",");

                double lengte = Double.parseDouble(regelWaarden[0]);
                double breedte = Double.parseDouble(regelWaarden[1]);
                double xCoordinaat = Double.parseDouble(regelWaarden[2]);
                double yCoordinaat = Double.parseDouble(regelWaarden[3]);
                String kleur = regelWaarden[4];

                rechthoeken.add(new Rechthoek(lengte, breedte, new Punt(xCoordinaat, yCoordinaat), kleur));
            }

            for (Rechthoek rechthoek : rechthoeken) {
                toonInformatie(rechthoek);
            }
        }
    }

    public static void toonInformatie(Figuur figuur) {
        System.out.println(figuur.geefOmtrek());
        System.out.println(figuur.vertelOverGrootte());
    }

    public static void toonInformatieAlleFiguren(ArrayList<Figuur> figuren) {
        for (Figuur figuur : figuren) {
            toonInformatie(figuur);
            System.out.println();
        }
    }

}
