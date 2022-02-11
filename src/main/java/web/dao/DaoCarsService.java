package web.dao;

import web.models.Car;

import java.util.List;

public interface DaoCarsService {

    List<Car> showCars(Integer count);
}
