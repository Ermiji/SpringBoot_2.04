package me.ermias.carspringdemo;

import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class CarService {
    private ArrayList<Car> list;


    public ArrayList<Car> getList() {
        return list;
    }

    public void setList(ArrayList<Car> list) {
        this.list = list;
    }

    public CarService(){
        list = new ArrayList<>();
    }

    public void add(Car c){
        list.add(c);
    }
}
