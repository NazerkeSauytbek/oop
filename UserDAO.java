import java.sql.*;

public class UserDAO {

    // INSERT (write)
    public void addUser(User user) {
        String sql = "INSERT INTO users(id, name, age, weight) VALUES (?, ?, ?, ?)";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, user.getId());
            ps.setString(2, user.getName());
            ps.setInt(3, user.getAge());
            ps.setDouble(4, user.getWeight());

            ps.executeUpdate();
            System.out.println("User saved to database");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

