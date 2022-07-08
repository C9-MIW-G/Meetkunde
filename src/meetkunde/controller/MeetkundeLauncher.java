package meetkunde.controller;

import meetkunde.database.CirkelDAO;
import meetkunde.database.DBaccess;
import meetkunde.database.PuntDAO;
import meetkunde.model.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.sql.*;
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
        String databaseName = "Figuren";
        String dbUser = "userFiguren";
        String dbPassword = "userFigurenPW";

        DBaccess dBaccess = new DBaccess(databaseName, dbUser, dbPassword);
        dBaccess.openConnection();

        CirkelDAO cirkelDAO = new CirkelDAO(dBaccess);
        cirkelDAO.slaCirkelOp(new Cirkel());

        dBaccess.closeConnection();
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
