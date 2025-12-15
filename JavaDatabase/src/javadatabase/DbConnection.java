package javadatabase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DbConnection {

    private static final String URL = "jdbc:postgresql://localhost:5432/kuliahh";
    //Mohon maaf Pak, untuk nama DB nya waktu itu harusnya kuliah, tapi saya typo dan terlanjur jadi "kuliahh"
    private static final String USER = "postgres";
    private static final String PASSWORD = "nganjuk123";

    public DbConnection() {

    }

    public static Connection connect() {
        try {

            Connection con = DriverManager.getConnection(URL, USER, PASSWORD);

            return con;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());

        }
        return null;
    }

    public static void close(Connection con) {
        try {
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(DbConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
