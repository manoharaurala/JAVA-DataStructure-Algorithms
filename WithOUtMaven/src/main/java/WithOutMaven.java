import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class WithOutMaven {
    public static void main(String[] args) throws SQLException {
        Connection connection = DriverManager.getConnection(
                "jdbc:mysql://127.0.0.1:3306/test_db_jbdl", "root", "");
        Statement statement = connection.createStatement();
        statement.execute("create table maven_dummy(id int, name varchar(30), count int)");
    }
}
