import java.sql.*;

// String username = request.getParameter("username");
// String query = "SELECT * FROM users WHERE username = '" + username + "'";
// Statement stmt = connection.createStatement();
// ResultSet rs = stmt.executeQuery(query);

//corrected code
public class Example {
    public void findUser(Connection connection, String username) {
        // use prepared statement to prevent injection
        String sql = "SELECT id, username, email FROM users WHERE username = ?";

        try (PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.setString(1, username);

            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    // handle user only selected columns
                    System.out.println("Found user: " + rs.getString("username"));
                } else {
                    System.out.println("User not found");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}