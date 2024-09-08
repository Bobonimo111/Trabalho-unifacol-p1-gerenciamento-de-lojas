package DataBase;

import java.util.Date;

import java.sql.*;

public class ConnectionDataBase {

    private String table = "CREATE TABLE log(id integer primary key,log string,CreateDate string)";

    public ConnectionDataBase() {

    }

    public void test() {
        try {
            this.statement.setQueryTimeout(30); // set timeout to 30 sec.
            this.statement.executeUpdate("drop table if exists log");
            this.statement.executeUpdate(table);
            this.statement.executeUpdate("insert into log values(NULL,'Valor de teste 1','" + new Date() + "')");
            this.statement.executeUpdate("insert into log values(NULL,'Valor de teste 2','" + new Date() + " ')");
            ResultSet rs = this.statement.executeQuery("select * from log");
            while (rs.next()) {
                // read the result set
                System.out.println("ID = " + rs.getString("id"));
                System.out.println("LOG = " + rs.getString("log"));
                System.out.println("DATE = " + rs.getInt("CreateDate"));
            }
        } catch (SQLException e) {
            e.printStackTrace(System.err);
        }
    }

    public void push(String log) {
        String querry = "insert into log values(%s,'%s','%s')".formatted(null, log, new Date());
        try {

            this.statement.setQueryTimeout(30);
            this.statement.executeUpdate(querry);
        } catch (SQLException e) {
            e.printStackTrace(System.err);
        }
    }

    public void logs() {
        try (
                Connection connection = DriverManager.getConnection("jdbc:sqlite:root.db");
                Statement statement = connection.createStatement();) {
            ResultSet rs = this.statement.executeQuery("select * from log");
            while (rs.next()) {
                // read the result set
                System.out.print("| ID = " + rs.getString("id"));
                System.out.print("| LOG = " + rs.getString("log"));
                System.out.print("| DATE = " + rs.getInt("CreateDate |"));
            }
        } catch (SQLException e) {
            e.printStackTrace(System.err);
        }
    }

}
