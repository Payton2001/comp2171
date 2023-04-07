import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCExample {
   static final String DB_URL = "jdbc:mysql://localhost/";
   static final String USER = "root";
   static final String PASS = "";

   public database(){
    Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
    Statement stmt = conn.createStatement();
    try{
       stmt.execute("DROP DATABASE IF EXISTS comp2171");
       stmt.execute("CREATE DATABASE comp2171");
       stmt.execute("DROP TABLE IF EXISTS Employee");
       stmt.execute("CREATE TABLE Employee (
        CustomerID INT NOT NULL DEFAULT '0',
        First_Name char(80) NOT NULL DEFAULT '',
        Last_Name char(80) NOT NULL DEFAULT '',
        Age INT NOT NULL DEFAULT '0',
        Gender CHAR(80) NOT NULL DEFAULT '',
        Username CHAR(80) NOT NULL DEFAULT '',
        Password CHAR(255) NOT NULL DEFAULT '',
        PRIMARY KEY (CustomerID)
       )");
        conn.commit();
        
        stmt.execute("OPEN DATABASE comp2171");
        conn.commit();
    }
    catch (SQLException e){
        e.printStackTrace();
    }
    finally{
        conn.close()
    }
   }