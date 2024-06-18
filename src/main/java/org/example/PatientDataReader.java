package org.example;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class PatientDataReader {

    public static void main(String[] args) {
        String fileName = "medical_result.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] patientData = line.split(",");
                if (patientData.length == 4) {
                    String name = patientData[0];
                    String age = patientData[1];
                    String diagnosis = patientData[2];
                    String lastVisit = patientData[3];

                    System.out.println("ФИО: " + name);
                    System.out.println("Возраст: " + age);
                    System.out.println("Диагноз: " + diagnosis);
                    System.out.println("Дата последнего визита: " + lastVisit);
                    System.out.println("------------------------");
                } else {
                    System.out.println("Некорректная строка: " + line);
                }
            }
        } catch (FileNotFoundException e) {
            System.err.println("Файл не найден: " + fileName);
        } catch (IOException e) {
            System.err.println("Ошибка при чтении файла: " + e.getMessage());
        }
    }
}
