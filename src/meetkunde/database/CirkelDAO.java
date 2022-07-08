package meetkunde.database;

import meetkunde.model.Cirkel;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CirkelDAO extends AbstractDAO  {

    public CirkelDAO(DBaccess dBaccess) {
        super(dBaccess);
    }

    public void slaCirkelOp(Cirkel cirkel) {
        int primaryKey = slaFiguurOp(cirkel.getKleur());
        String sql = "INSERT INTO cirkel (figuurnummer, straal, xcoordinaat, ycoordinaat) VALUES (?, ?, ?, ?);";

        try {
            setupPreparedStatement(sql);
            preparedStatement.setInt(1, primaryKey);
            preparedStatement.setDouble(2, cirkel.getStraal());
            preparedStatement.setDouble(3, cirkel.getMiddelpunt().getxCoordinaat());
            preparedStatement.setDouble(4, cirkel.getMiddelpunt().getyCoordinaat());
            executeManipulateStatement();
        } catch (SQLException sqlException) {
            sqlFoutMelding(sqlException);
        }
    }

    private int slaFiguurOp(String kleur) {
        String sql = "INSERT INTO figuur (kleur) VALUES (?);";
        int primaryKey = 0;

        try {
            setupPreparedStatementWithKey(sql);
            preparedStatement.setString(1, kleur);
            primaryKey = executeInsertStatementWithKey();
        } catch (SQLException sqlException) {
            sqlFoutMelding(sqlException);
        }

        return primaryKey;
    }

    private void sqlFoutMelding(SQLException sqlException) {
        System.err.println("SQL heeft de volgende melding gegeven: " + sqlException.getMessage());
    }

}
