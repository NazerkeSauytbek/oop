public abstract class WorkoutPlan {
    protected String name;
    protected int duration;
    public WorkoutPlan(String name, int duration){
        this.name=name;
        this.duration=duration;
    }
    public abstract void showPlan();
}