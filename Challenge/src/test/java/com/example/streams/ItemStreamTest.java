package com.example.streams;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.*;

public class ItemStreamTest {

    static ItemStream is;
    static List<Item> items;

    @BeforeAll
    static void initialize(){
        is = new ItemStream();
        items = Stream.of(new Item(1, "SmartTV", "esto es una tele", "SONY", 4000),
                          new Item(2, "SmartWatch", "esto es un smartwatch", "SONY", 2000),
                          new Item(3, "Reloj", "esto es reloj", "Swiss", 2800),
                          new Item(4, "Swtich", "esto es una switch", "Nintento", 5000),
                          new Item(5, "Monitor", "esto es una monitor", "SONY", 4000),
                          new Item(6, "Laptop", "esto es una laptop", "Toshiba", 4000),
                          new Item(7, "Bocina", "esto es una bocina", "Bosé", 4000))
                .collect(Collectors.toList());
    }

    @Test
    void testFindExpensiveItem() {

    }

    @Test
    void testFindIdPrime() {

    }

    @Test
    void testFindManufacturerSONY() {

    }

    @Test
    void testFindShortestDescription() {

    }

    @Test
    void testSortName() {

    }
}
