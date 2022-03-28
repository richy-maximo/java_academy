package com.example.streams;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ItemStream{

    public static void main(String[] args){
        ItemStream is = new ItemStream();
        List<Item> items = Stream.of(new Item(1, "SmartTV", "esto es una tele", "SONY", 4000),
                                     new Item(2, "SmartWatch", "esto es un smartwatch", "SONY", 2000),
                                     new Item(3, "Reloj", "esto es reloj", "Swiss", 2800),
                                     new Item(4, "Swtich", "esto es una switch", "Nintento", 5000),
                                     new Item(5, "Monitor", "esto es una monitor", "SONY", 4000),
                                     new Item(6, "Laptop", "esto es una laptop", "Toshiba", 4000),
                                     new Item(7, "Bocina", "esto es una bocina", "Bosé", 4000))
                                .collect(Collectors.toList());

        System.out.println("Most expensive item: " + is.findExpensiveItem(items));

        System.out.println("Shortest description item: " + is.findShortestDescription(items));

        System.out.println("Items sorted by name: " + is.sortName(items));

        System.out.println("Items with id like prime number: " + is.findIdPrime(items));

        System.out.println("Sony's items: " + is.findManufacturerSONY(items));
    }

    public Optional<Item> findExpensiveItem(List<Item> list){
        return list.stream().sorted(Comparator.comparingInt(Item::getPrice).reversed()).findFirst();
    }

    public Optional<Item> findShortestDescription(List<Item> list){

        return list.stream().sorted((o1, o2) -> {
                    if(o1.getDescription().length() == o2.getDescription().length())
                        return 0;
                    else if(o1.getDescription().length() > o2.getDescription().length())
                        return 1;
                    else return -1;
                })
                .findFirst();
    }

    public List<Item> sortName(List<Item> list){

        return list.stream().sorted(Comparator.comparing(Item::getName)).collect(Collectors.toList());
    }

    public List<Item> findIdPrime(List<Item> list){
        return list.stream().filter(i -> i.getId() % 2 == 0).collect(Collectors.toList());
    }

    public List<Item> findManufacturerSONY(List<Item> list){

        return list.stream().filter(i -> i.getManufacturer().equals("SONY")).collect(Collectors.toList());
    }
}

class Item {
    private int id;
    private String name;
    private String description;
    private String manufacturer;
    private int price;

    

    public Item(int id, String name, String description, String manufacturer, int price) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.manufacturer = manufacturer;
        this.price = price;
    }

    @Override
    public String toString(){
        return "Item: " + this.id + ", " + this.name + " " + this.description + " " + this.manufacturer;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getManufacturer() {
        return manufacturer;
    }
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }


    
     
}
