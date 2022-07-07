package meetkunde.controller;

import meetkunde.model.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
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
        ArrayList<Rechthoek> rechthoeken = new ArrayList<>();
        File rechthoekenBestand = new File("resources/Rechthoek.csv");

        try(Scanner bestandScanner = new Scanner(rechthoekenBestand)){
            while (bestandScanner.hasNextLine()) {
                String[] regelWaarden = bestandScanner.nextLine().split(",");

                double lengte = Double.parseDouble(regelWaarden[0]);
                double breedte = Double.parseDouble(regelWaarden[1]);
                double xCoordinaat = Double.parseDouble(regelWaarden[2]);
                double yCoordinaat = Double.parseDouble(regelWaarden[3]);
                String kleur = regelWaarden[4];

                rechthoeken.add(new Rechthoek(lengte, breedte, new Punt(xCoordinaat, yCoordinaat), kleur));
            }
        } catch (FileNotFoundException fileNotFoundException) {
            System.out.println("Het bestand kon niet gevonden worden.");
        }

        File uitvoerBestand = new File("resources/Rechthoeken?.txt");
        try (PrintWriter printWriter = new PrintWriter(uitvoerBestand)) {
            for (Rechthoek rechthoek : rechthoeken) {
                printWriter.println(rechthoek);
                printWriter.println();
            }
        } catch (FileNotFoundException fileNotFoundException) {
            System.out.println("Het bestand kon niet worden aangemaakt.");
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
