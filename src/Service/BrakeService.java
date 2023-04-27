package Service;

import enums.typesOfCars;
import interfce.IService;

import java.util.HashMap;

public class BrakeService implements IService {
    private int total;
    private static HashMap<Enum, Integer> price = new HashMap<>();
    static{
        price.put(typesOfCars.HATCHBACK,1000);
        price.put(typesOfCars.SEDAN,1500);
        price.put(typesOfCars.SUV,2500);
    }
    @Override
    public float getTotal(typesOfCars car) {
        total+=price.get(car);
        return total;
    }
}
