package org.example;

import java.io.Serializable;
import java.time.LocalDate;

public class Patient implements Serializable {
    private static final long serialVersionUID = 1L;

    private String name;
    private int age;
    private String diagnosis;
    private LocalDate lastVisit;

    public Patient(String name, int age, String diagnosis, LocalDate lastVisit) {
        this.name = name;
        this.age = age;
        this.diagnosis = diagnosis;
        this.lastVisit = lastVisit;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public LocalDate getLastVisit() {
        return lastVisit;
    }

    @Override
    public String toString() {
        return "ФИО: " + name + ", Возраст: " + age + ", Диагноз: " + diagnosis + ", Дата последнего визита: " + lastVisit;
    }
}
