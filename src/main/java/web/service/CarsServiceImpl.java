package web.service;

import org.springframework.stereotype.Component;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarsServiceImpl implements CarsService {

    public List<Car> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car(1, "model1", 111));
        cars.add(new Car(2, "model2", 222));
        cars.add(new Car(3, "model3", 333));
        cars.add(new Car(4, "model4", 444));
        cars.add(new Car(5, "model5", 555));
    }


    @Override
    public List<Car> showCars(Integer count) {
        if ((count == null) || (count > 5)) {
            count = 5;
        }
        return cars.subList(0, count);
    }
}
