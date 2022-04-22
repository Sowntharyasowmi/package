package com.busreservation;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Scanner.*;

public class BusDemo {
    public static void main(String[]args) {
        ArrayList<Bus>Buses=new ArrayList<>();
        Buses.add(new Bus(1,45,true));
        Buses.add(new Bus(2,65,false));
        Buses.add(new Bus(3,56,true));

    int useropt = 1;
    Scanner scanner = new Scanner(System.in);
    for(Bus b:Buses);{
            b.displayBusInfo();
        }
    while (useropt == 1) {
        System.out.println("Enter 1 to book and Enter 2 to Exit:");
    }
    if(useropt==1){
        Booking booking=new Booking();

    }
}
}

