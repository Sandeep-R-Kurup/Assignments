package Service;

import enums.typesOfCars;
import interfce.IService;

import java.util.HashMap;

public class BasicService implements IService {
    private int total;
    private static HashMap<Enum, Integer> price = new HashMap<>();
    static{
        price.put(typesOfCars.HATCHBACK,2000);
        price.put(typesOfCars.SEDAN,4000);
        price.put(typesOfCars.SUV,5000);
    }
    @Override
    public float getTotal(typesOfCars car) {
        total+=price.get(car);
        return total;
    }
}
