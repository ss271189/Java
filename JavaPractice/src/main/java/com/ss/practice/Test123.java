package com.ss.practice;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Test123 {


    public static void main(String[] args) {

        int a[]={1,2,3,4,5};

        List<String> list=IntStream.of(a).boxed().map(x-> String.valueOf(x)).collect(Collectors.toList());


    }
}

final class Employee {

    private final Integer a;
    private final String name;
    private final Address address;

    public Employee(Integer a, String name, Address address) {
        this.a = a;
        this.name = name;
        this.address = new Address(address);
    }

    public Integer getA() {
        return a;
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return new Address(address);
    }
}



class Address {

    private Address a;

    public Address(Address a) {
      this.a=a;
    }
}