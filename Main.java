import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        FitnessApp app = new FitnessApp();

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
            app.addUser(user);
        }

        System.out.println("\n--- All users ---");
        app.showAllUsers();

        System.out.println("\n--- Adults (filter) ---");
        app.filterAdults();

        System.out.println("\n--- Sorted by weight ---");
        app.sortByWeight();
        app.showAllUsers();

        WorkoutPlan plan1 = new CardioPlan(30);
        WorkoutPlan plan2 = new StrengthPlan(45);

        plan1.showPlan();
        plan2.showPlan();
    }
}


