package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;

@Repository
public class CarDaoImpl implements CarDao {
    public static final ArrayList<Car> cars = new ArrayList<>();

    static {
        cars.add(new Car("Lada", "White", 1));
        cars.add(new Car("Mazda", "Red", 2));
        cars.add(new Car("Toyota", "Pink", 3));
        cars.add(new Car("Audi", "Blue", 4));
        cars.add(new Car("BMW", "Black", 5));
    }
}
