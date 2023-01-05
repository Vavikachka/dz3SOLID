import java.awt.*;
//Создать путём наследования класса «Car» два автомобиля: с бензиновым и дизельным двигателями,
//имплементировать метод «Заправка топливом» интерфейса «Заправочная станция». Реализовать заправку
//каждого автомобиля подходящим топливом. Провести проверку принципа DIP.
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}
enum TypeCar{
    SEDAN,
    PICKUP
}

enum TypeFuel{
    GASOLINE,
    DIESEL,
    ELECTRICITY
}

enum TypeGearBox{
    MT,
    AT
}
abstract class Car{
    private String make;
    private  String model;
    private Color color;
    private  TypeCar bodyType;
    private int numberWheels;
    private  TypeFuel fuelType;
    private TypeGearBox gearBoxType;
    private double engineCapacity;

    public void movement(){}
    public void maintenance(){}
    public boolean gearShifting(){return true;}
    public boolean switchHeadLights(){return true;}
    public boolean switchWipers(){return true;}



    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public TypeCar getBodyType() {
        return bodyType;
    }

    public void setBodyType(TypeCar bodyType) {
        this.bodyType = bodyType;
    }

    public int getNumberWheels() {
        return numberWheels;
    }

    public void setNumberWheels(int numberWheels) {
        this.numberWheels = numberWheels;
    }

    public TypeFuel getFuelType() {
        return fuelType;
    }

    public void setFuelType(TypeFuel fuelType) {
        this.fuelType = fuelType;
    }

    public TypeGearBox getGearBoxType() {
        return gearBoxType;
    }

    public void setGearBoxType(TypeGearBox gearBoxType) {
        this.gearBoxType = gearBoxType;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(double engineCapacity) {
        this.engineCapacity = engineCapacity;
    }
}

class SweepCar extends Car{
    public void sweeping(){}
}
interface iRefueling{
    void fuel();

}

interface iWip{
    void  wipWindshield();
    void wipHeadLights();
    void wipMirrors();
}
class PickUp extends Car implements iRefueling, iWip {
    private int loadCapacity;
    @Override
    public void fuel(){}

    @Override
    public void wipWindshield() {

    }

    @Override
    public void wipHeadLights() {

    }

    @Override
    public void wipMirrors() {

    }

    public int getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }
}

class FutureCar extends Car{
//    FutureCar(){this.setNumberWheels(3);}
    private void fly(){}
}

class BensinCar extends Car{
    @Override
    public TypeFuel getFuelType() {
        return TypeFuel.GASOLINE;
    }
}
class DiselCar extends Car{
    @Override
    public TypeFuel getFuelType() {
        return TypeFuel.DIESEL;
    }
}

