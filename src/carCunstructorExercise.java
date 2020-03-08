public class carCunstructorExercise {
    private String carName;
    private String carModel;
    private String carCapacity;

    public carCunstructorExercise() {
        this.carName = "";
        this.carModel = "";
        this.carCapacity = "";
    }

    public carCunstructorExercise(String name, String model) {

        this.carName = name;
        this.carModel = model;
    }

    // Parameterized Constructor 2
    public carCunstructorExercise(String name, String model, String capacity) {
        this(name, model);
        this.carCapacity = capacity;

    }

    public static void main(String[] args) {

    }
}
