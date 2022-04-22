package com.busreservation;
import java.util.Iterator;
public class Bus {
    private int busNo;
    private int Capacity;
    private boolean Ac;
    Bus(int busNo, int Capacity, boolean Ac);
    this.busNo=busNo;
    this.Capacity=Capacity;
    this.Ac=Ac;
}
public int getBusNo() {
    return busNo;
}
public void setBusNo(int busNo) {
    busNo = busNo;
}
    public int getCapacity() {
        return Capacity;
    }
    public void setCapacity(int Capacity) {
        Capacity = Capacity;
    }
    public boolean getAc() {
        return Ac;
    }
    public void setAc(boolean Ac) {
        Ac= Ac;
    }

}
public void  class b.displayBusInfo(){
System.out.println("BusNo"+"capacity"+"Ac");
}