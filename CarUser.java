package mobil;

public class CarUser {
    
    private Car car;
    public CarUser(Car car){
        this.car = car;
    }
    void turnStartEngineTheCar(){
        this.car.startEngine();
    }
    void turnStopEngineTheCar(){
        this.car.stopEngine();
    }
    void makeCarSpeedUp(){
        this.car.speedUp();
    }
    void makeCarSpeedDown(){
        this.car.speedDown();
    }
    
}
