import java.util.*;
public class FitnessApp {
    private ArrayList<User> users =new ArrayList<>();
    public void addUser(User user){
        users.add(user);

    }
    public User searchByName(String name){
        for(User u : users){
            if(u.toString().contains(name)){
                return u;
            }
        }
        return null;
    }
    public void filterAdults(){
        for(User u : users){
            if(u.getAge()>=18){
                System.out.println(u);
            }
        }
    }
    public void sortByWeight(){
        users.sort(Comparator.comparingDouble(User::getWeight));

    }
    public void showAllUsers(){
        for(User u:users){
            System.out.println(u);
        }
    }
}