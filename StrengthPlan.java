public class StrengthPlan extends WorkoutPlan {
    public StrengthPlan(int duration){
        super("Strength", duration);
    }
    @Override
    public void showPlan(){
        System.out.println("Workout: Strength training, Duration: "+ duration+ " minutes");
    }
}
