package Encapsulation;

class Car {
    private int id;
    private String model;
    private String color;
    public Car(){

    }

    public Car(int id, String model, String color){
        this.id = id;
        this.color = color;
        this.model = model;
    }

}

class Toyota extends Car {
    private ToyotaEngine toyotaEngine;
    public Toyota(ToyotaEngine toyotaEngine){
        super();
        this.toyotaEngine = new ToyotaEngine();
    }
    public void setStart(){
        toyotaEngine.start();
    }

}

class ToyotaEngine {

    public void start(){
        System.out.println("Engine Start");
    }
    public void stop(){
        System.out.println("Engine Stop");
    }

}

public class CompositionExample {
    public static void main(String[] args) {
        ToyotaEngine toyotaEngine = null;
        Toyota toyotaCar = new Toyota(toyotaEngine);
        toyotaCar.setStart();
    }
}
