package meetkunde.controller;

import meetkunde.model.*;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Vincent Velthuizen <v.r.velthuizen@pl.hanze.nl>
 * <p>
 * Gebruik mijn Meetkunde code en laat zien dat het allemaal netjes werkt.
 */
public class MeetkundeLauncher {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        boolean correctInvoer = false;
        while (!correctInvoer) {
            System.out.print("Geef een straal: ");
            try {
                double straal = keyboard.nextDouble();
                Cirkel ingevoerdeCirkel = new Cirkel(straal);
                System.out.println(ingevoerdeCirkel);
                correctInvoer = true;
            } catch (IllegalArgumentException argumentException) {
                System.out.println(argumentException.getMessage());
            } catch (InputMismatchException inputMismatchException) {
                System.out.println("Dat was geen double, probeer het nog een keer");
                keyboard.nextLine();
            } finally {
                System.out.println("Je invoer is op de juist wijze afgehandeld.");
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
