package com.github.lsantana32.concesionaria.jpa.persistence;

import com.github.lsantana32.concesionaria.jpa.logic.Car;
import com.github.lsantana32.concesionaria.jpa.persistence.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PersistenceController {

    CarJpaController cjc = new CarJpaController();
    
    public void createCar(Car car) {
        cjc.create(car);
    }

    public List<Car> bringCars() {
        return cjc.findCarEntities();
    }

    public void deleteCar(int id){
        try {
            cjc.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(PersistenceController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Car bringCar(int id) {
        return cjc.findCar(id);
    }

    public void editCar(Car car) {
        try {
            cjc.edit(car);
        } catch (Exception ex) {
            Logger.getLogger(PersistenceController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


    
}
