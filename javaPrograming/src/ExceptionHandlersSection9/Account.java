package ExceptionHandlersSection9;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Account {

    public Connection getConn() throws SQLException {
        String url = "jbdc:mysql://localhost:8080/";
        String user = "abc";
        String passwrod = "code";
        Connection conn = null;
        conn = DriverManager.getConnection(url, user, passwrod);

        return conn;

    }

    public void withdraw(int amount) throws SQLException {
        getConn();

    }

}
