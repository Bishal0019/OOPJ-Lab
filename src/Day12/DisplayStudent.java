package Day12;

import java.sql.*;

public class DisplayStudent {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/bishal";
        String user = "root";
        String pw = "bishalkiit";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, user, pw);
            Statement sm = con.createStatement();

            ResultSet rs = sm.executeQuery("SELECT * FROM student");

            System.out.println("Student Records:");
            while (rs.next()) {
                System.out.println(
                        rs.getInt(1) + " " + rs.getString(2) + " " + rs.getInt(3)
                );
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}