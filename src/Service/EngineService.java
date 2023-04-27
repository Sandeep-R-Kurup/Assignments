package Service;

import enums.typesOfCars;
import interfce.IService;

import java.util.HashMap;

public class EngineService implements IService {
    private int total;
    private static HashMap<Enum, Integer> price = new HashMap<>();
    static{
        price.put(typesOfCars.HATCHBACK,5000);
        price.put(typesOfCars.SEDAN,8000);
        price.put(typesOfCars.SUV,10000);
    }
    @Override
    public float getTotal(typesOfCars car) {
        total+=price.get(car);
        return total;
    }
}
