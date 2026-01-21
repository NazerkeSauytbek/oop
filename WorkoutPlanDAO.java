import java.sql.*;

public class WorkoutPlanDAO {

    public void addPlan(String type, int duration) {

        String sql = "INSERT INTO workout_plans(type, duration) VALUES (?, ?)";

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, type);
            ps.setInt(2, duration);

            ps.executeUpdate();
            System.out.println("Workout plan saved");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
