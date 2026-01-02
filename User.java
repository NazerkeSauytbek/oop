import java.util.Objects;
public class User extends Person{
    private int age;
    private double weight;

    public User (int id, String name, int age, double weight){
        super(id, name);
        this.age=age;
        this.weight=weight;
    }
    public int getAge(){
        return age;
    }

    public double getWeight() {
        return weight;
    }
    @Override
    public void displayInfo(){
        System.out.println("User: " + name+" , Age: " + age+" , Weight: "+weight);
    }
    @Override
    public String toString(){
        return "User{id=" + id+", name'"+name+"', age= "+age+", weight="+weight+"}";
    }
    @Override
    public boolean equals(Object o){
        if(this ==o) return true;
        if(!(o instanceof User)) return false;
        User user = (User) o;
        return id == user.id;
    }
    @Override
    public int hashCode(){
        return Objects.hash(id);
    }
}
