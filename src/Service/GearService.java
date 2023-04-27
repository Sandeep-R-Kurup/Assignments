package Service;

import enums.typesOfCars;
import interfce.IService;

import java.util.HashMap;

public class GearService implements IService {
    private int total;
    private static HashMap<Enum, Integer> price = new HashMap<>();
    static{
        price.put(typesOfCars.HATCHBACK,3000);
        price.put(typesOfCars.SEDAN,6000);
        price.put(typesOfCars.SUV,8000);
    }
    @Override
    public float getTotal(typesOfCars car) {
        total+=price.get(car);
        return total;
    }
}
