public class CardioPlan extends WorkoutPlan {
    public CardioPlan(int duration){
        super("Cardio", duration);
    }
    @Override
    public void showPlan(){
        System.out.println("Workout: Cardio, Duration: " + duration + "minutes");
    }
}
