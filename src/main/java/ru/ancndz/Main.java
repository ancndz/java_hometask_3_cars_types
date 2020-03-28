package ru.ancndz;

import ru.ancndz.transport.auto.Car;
import ru.ancndz.transport.mobile.Skate;
import ru.ancndz.transport.social.Bus;
import ru.ancndz.transport.social.Taxi;

public class Main {
    public static void main(String[] args) {

        Reestr vehicleReestr = new Reestr();

        //заготовленные варианты
        Taxi taxi1 = new Taxi(5, true, "х212ее", 2001, 150, "белый",
                "ТаксиВезёт", "eco", 4, "Дятлов А.А.");
        vehicleReestr.addVehicle(taxi1);

        Car car1 = new Car(5, false, "к501ух", 2017, 2.8, "серебро");
        vehicleReestr.addVehicle(car1);

        Car car2 = new Car(5, false, "ю764зт", 2000, 2.8, "черный");
        vehicleReestr.addVehicle(car2);

        Bus bus1 = new Bus(8, true, "ш916ом", 1999, 2000, 2.25,
                false, 32, false, "МежГорТранс", "Скворцов В.И");
        vehicleReestr.addVehicle(bus1);


        Skate skater = new Skate("559мс", 2019, "северный", "черный");
        Skate skater1 = new Skate("323мс", 2018, "южный", "черный");
        Skate skater2 = new Skate("999мс", 2018, "южный", "серый");
        Skate skater3 = new Skate("122мс", 2016, "восточный", "красный");
        Skate skater4 = new Skate("036мс", 2015, "северный", "черный");

        vehicleReestr.addVehicle(skater);
        vehicleReestr.addVehicle(skater1);
        vehicleReestr.addVehicle(skater2);
        vehicleReestr.addVehicle(skater3);
        vehicleReestr.addVehicle(skater4);

        //инормация обо всех средствах передвижения
        vehicleReestr.printActualInfoAll();

        //информация о скейтерах
        vehicleReestr.printActualInfoSkaters();

        //Количество легковых автомобилей, выпущенных 5 лет назад
        int year = 5;
        System.out.printf("Количество легковых автомобилей, выпущенных %d лет назад: %d\n",
                year, vehicleReestr.getNewVehiclesCount(year));

        //подсчет максимального числа перевозимых пассажиров одновременно
        System.out.printf("Количество пассажиров, которое может перевозить общественный транспорт: %d\n",
                vehicleReestr.getMaxPassengersCount());

        //регистрция такси
        vehicleReestr.registrationProcedureTaxi();

        //вывод всех такси
        vehicleReestr.printActualInfoTaxi();
    }
}
