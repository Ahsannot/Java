package December;

import org.testng.annotations.DataProvider;
import java.sql.*;
        import java.util.ArrayList;
import java.util.List;

public class DBDataProvider {

    @DataProvider(name = "dbLoginData")
    public Object[][] getDBLoginData() throws Exception {

        // JDBC connection variables
        String url = "jdbc:mysql://localhost:3306/testdb";
        String user = "root";
        String password = "rootpassword";
        String query = "SELECT username, password FROM login_data";

        // Load MySQL JDBC Driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        // Connect to database
        Connection conn = DriverManager.getConnection(url, user, password);
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(query);

        // Store data in a list
        List<Object[]> dataList = new ArrayList<>();

        while (rs.next()) {
            String username = rs.getString("username");
            String pass = rs.getString("password");
            dataList.add(new Object[]{username, pass});
        }

        // Close connections
        rs.close();
        stmt.close();
        conn.close();

        // Convert list to Object[][]
        Object[][] data = new Object[dataList.size()][2];
        for (int i = 0; i < dataList.size(); i++) {
            data[i] = dataList.get(i);
        }

        return data;
    }
}
