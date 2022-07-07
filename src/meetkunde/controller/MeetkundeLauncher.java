package meetkunde.controller;

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
    private static final String MYSQL_DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String PREFIX_CONNECTION_URL = "jdbc:mysql://localhost:3306/";
    private static final String CONNECTION_SETTINGS = "?useSSL=false" +
            "&allowPublicKeyRetrieval=true" +
            "&useJDBCCompliantTimezoneShift=true" +
            "&useLegacyDatetimeCode=false" +
            "&serverTimezone=UTC";

    public static void main(String[] args) {
        String databaseName = "Figuren";
        String dbUser = "userFiguren";
        String dbPassword = "userFigurenPW";

        String connectionUrl = PREFIX_CONNECTION_URL + databaseName + CONNECTION_SETTINGS;
        Connection connection = null;
        try {
            Class.forName(MYSQL_DRIVER);
            connection = DriverManager.getConnection(connectionUrl, dbUser, dbPassword);
        } catch (ClassNotFoundException classNotFoundException) {
            System.out.println("Driver niet gevonden");
        } catch (SQLException sqlException) {
            System.out.println("SQL Exception: " + sqlException.getMessage());
        }

        if (connection != null) {
            System.out.println("De verbinding is gemaakt!");
            String sql = "INSERT INTO punt VALUES (3, 5);";
            try {
                PreparedStatement preparedStatement = connection.prepareStatement(sql);
                preparedStatement.executeUpdate();
                connection.close();
            } catch (SQLException sqlException) {
                System.out.println("SQL Exception: " + sqlException.getMessage());
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
