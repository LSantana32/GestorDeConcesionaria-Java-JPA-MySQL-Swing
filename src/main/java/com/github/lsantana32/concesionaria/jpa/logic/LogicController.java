package com.github.lsantana32.concesionaria.jpa.logic;

import com.github.lsantana32.concesionaria.jpa.persistence.PersistenceController;
import com.github.lsantana32.concesionaria.jpa.persistence.exceptions.NonexistentEntityException;
import java.util.List;


public class LogicController {

    private PersistenceController pc = new PersistenceController();
    
    public void createCar(String model, String brand, String motor, String color, String patent, int numberOfDoors) {
        Car car = new Car ();
        car.setModel(model);
        car.setBrand(brand);
        car.setMotor(motor);
        car.setColor(color);
        car.setPatent(patent);
        car.setNumberOfDoors(numberOfDoors);
        pc.createCar(car);        
    }

    public List<Car> bringCars() {
        return pc.bringCars();
    }

    public void deleteCar(int id) {
        pc.deleteCar(id);
    }

    public Car bringCar(int id) {
        return pc.bringCar(id);
    }

    public void editCar(int id, String model, String brand, String motor, String color,String patent, int doors) {
        Car car = new Car (id,model,brand,motor,color,patent,doors);
        pc.editCar(car);
    }
    
}
