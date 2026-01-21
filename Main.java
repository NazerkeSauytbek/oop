import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        FitnessApp app = new FitnessApp();
        UserDAO dao = new UserDAO();2

        System.out.print("Enter number of users: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            System.out.print("ID: ");
            int id = sc.nextInt();

            System.out.print("Name: ");
            String name = sc.next();

            System.out.print("Age: ");
            int age = sc.nextInt();

            System.out.print("Weight: ");
            double weight = sc.nextDouble();

            User user = new User(id, name, age, weight);

            app.addUser(user);     // collection
            dao.addUser(user);     // database
        }

        app.showAllUsers();

        WorkoutPlan p1 = new CardioPlan(30);
        WorkoutPlan p2 = new StrengthPlan(45);

        p1.showPlan();
        p2.showPlan();
    }
}
