package com.ss.java8.streams.streamsprac;

import java.util.List;

public class Student {

    private String name;
    private List<String> activities;

    public Student(String name, List<String> activities) {
        this.name = name;
        this.activities = activities;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getActivities() {
        return activities;
    }

    public void setActivities(List<String> activities) {
        this.activities = activities;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", activities=" + activities +
                '}';
    }
}
