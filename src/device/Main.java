package device;

import announcement.Announcement;
import home.Home;
import transport.Airplane;
import transport.Car;
import transport.Helicopter;

import java.time.LocalDate;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Laptop laptop = new Laptop("Dell","yes",850000,"Portable computer","windows");
        Laptop laptop1 = new Laptop("Apple","No",140000,"Note book","Macos");

        Phone phone = new Phone("Samsung Galaxy A50","have",450000,"Electronic dives","China",128);
        Phone phone1 = new Phone("Iphone 13","have",120000,"Dives","Dubai",256);

        Home home = new Home("Ihlas","yes",12000000,"apartment for living","flat",35);
        Home home1 = new Home("Kut","yes",32000000,"house for living","house",75);

        Car car=new Car("Lexus470","no",850000,"Transport","Black",LocalDate.now());
        Car car1=new Car("Camry","yes",1250000,"Transport","White",LocalDate.now());

        Airplane airplane=new Airplane("Boing 200","yes",254000,"air transport");
        Airplane airplane1=new Airplane("TUU 200","no",254000,"air transport");

        Announcement[] announcements = {phone, phone1, laptop, laptop1,home,home1,car,car1,airplane,airplane1};
        Scanner scanner = new Scanner(System.in);
        while(true){
            int sell=scanner.nextInt();
            if(sell==1)Announcement.findByPrice(scanner.nextDouble(), announcements);
            if (sell==2)Announcement.FindByMaxPrice(announcements);
            if(sell==3)Announcement.findByName(scanner.nextLine(),announcements);

        }
    }
}