package ru.ancndz;

import ru.ancndz.transport.Vehicle;
import ru.ancndz.transport.auto.Car;
import ru.ancndz.transport.mobile.Skate;
import ru.ancndz.transport.social.SocialInterface;
import ru.ancndz.transport.social.Taxi;

import java.util.*;

public class Reestr {
    List<Vehicle> allVehiclesList = new ArrayList<>();

    public void addVehicle(Vehicle vehicle) {
        this.allVehiclesList.add(vehicle);
    }

    public void registrationProcedureTaxi() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("------------\n------------\n" +
                "Добро пожаловать в процедуру регистрации такси!" +
                "\nВведите номер тр. средства: ");
        String serialID = scanner.nextLine();

        System.out.print("\nВведите год выпуска: ");
        int year = scanner.nextInt();

        System.out.print("\nВведите количество дверей: ");
        int doorNum = scanner.nextInt();

        System.out.print("\nВведите количетсво л.с.: ");
        double horsePowers = scanner.nextDouble();

        System.out.print("\nТопливо - бензин (газ)?: ");
        boolean isGasEngine = scanner.nextBoolean();

        //загулшка
        String temp = scanner.nextLine();

        System.out.print("\nВведите цвет: ");
        String color = scanner.nextLine();

        System.out.print("\nВведите maxPeopleCapacity: ");
        int maxPeopleCapacity = scanner.nextInt();

        //загулшка
        temp = scanner.nextLine();

        System.out.print("\nВведите comfortType: ");
        String comfortType = scanner.nextLine();

        System.out.print("\nВведите companyName: ");
        String companyName = scanner.nextLine();

        System.out.print("\nВведите actualDriver: ");
        String actualDriver = scanner.nextLine();

        Taxi taxi = new Taxi(doorNum, isGasEngine, serialID, year, horsePowers, color, companyName,
                comfortType, maxPeopleCapacity, actualDriver);

        addVehicle(taxi);
    }

    //актуальная информация о скейтерах
    public void printActualInfoSkaters() {
        System.out.println("Все зарегистрированные скейты:");
        for (Vehicle e : this.allVehiclesList) {
            if (e instanceof Skate) {
                System.out.println(e.getActualInformation() + "\n");
            }
        }
    }

    //актуальная информация о такси
    public void printActualInfoTaxi() {
        System.out.println("Все зарегистрированные такси:");
        for (Vehicle e : this.allVehiclesList) {
            if (e instanceof Taxi) {
                System.out.println(e.getActualInformation() + "\n");
            }
        }
    }

    //актуальная информация обо всех средствах передвижения
    public void printActualInfoAll() {
        System.out.println("Все зарегистрированные средства передвижения:");
        for (Vehicle e : this.allVehiclesList) {
            System.out.println(e.getActualInformation() + "\n");
        }
    }

    //Количество легковых автомобилей, выпущенных n лет назад
    public int getNewVehiclesCount(int year) {
        int count = 0;
        for (Vehicle e : this.allVehiclesList) {
            if (e instanceof Car && e.getYear() >= 2020 - year) {
                count++;
            }
        }
        return count;
    }

    public int getMaxPassengersCount() {
        int count = 0;
        for (Vehicle e : this.allVehiclesList) {
            if (e instanceof SocialInterface) {
                count += ((SocialInterface) e).getMaxPassengers();
            }
        }
        return count;
    }

    public List<Vehicle> getAllVehiclesList() {
        return allVehiclesList;
    }

}
