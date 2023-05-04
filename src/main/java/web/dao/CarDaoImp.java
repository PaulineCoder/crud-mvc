package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarDaoImp implements CarDao {

    @Override
    public List<Car> getCars(int count) {
        List<Car> cars = new ArrayList<>();

        cars.add(new Car("BMW", "M2", 87));
        cars.add(new Car("Mazda", "CX-30", 1));
        cars.add(new Car("Subaru", "WRX", 4));
        cars.add(new Car("Acura", "EL", 3));
        cars.add(new Car("Lexus", "LS", 6));

        if (count >= 5 || count == -1) {
            return cars;
        }
        return cars.stream().limit(count).collect(Collectors.toList());
    }
}
