import service.CarServiceStation;

import java.util.ArrayList;
import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        CarServiceStation station = new CarServiceStation();
        Scanner sc = new Scanner(System.in);
        System.out.println("CarType please ---(Hatchback,Sedan,SUV)");

        String carType = sc.next();
        ArrayList<String> serviceCodes = new ArrayList<>();
        System.out.println("we offer BS01-Basic Servicing,EF01-Engine service,CF01-Clutch service,BF01-Brake service,GF01-Gear Service. How Many Services do you need");
        int n = sc.nextInt();
        if(n>5)System.out.println("invalid input");
        else {
            System.out.println("Write the Service Code---(BS01-Basic Servicing,EF01-Engine service,CF01-Clutch service,BF01-Brake service,GF01-Gear Service");
            for (int i = 0; i < n; i++) {
                serviceCodes.add(sc.next());
            }
        }

        int totalBill = station.calculateTotalBill(carType, serviceCodes);

        if (totalBill != -1) {
            System.out.println("Type of Car: " + carType);
            System.out.println("Service Codes: " + serviceCodes);
            System.out.println("Total Bill: ₹ " + totalBill);
        }
    }
}