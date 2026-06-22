package library.Solution_SRP_3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class dbConnectivity {
    Connection con;
    Statement stmt;

    public dbConnectivity() {
        try {
            String s = "jdbc:sqlserver://localhost:49862;databaseName=Library";
            con = DriverManager.getConnection(s, "new_user", "123");
            stmt = con.createStatement();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public Connection getConnection() {
        return con;
    }

    public void closeConnection() {
        try {
            if (con != null && !con.isClosed()) {
                con.close();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}