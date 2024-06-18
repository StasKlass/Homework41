package org.example;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

public class DeserializePatients {

    public static void main(String[] args) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("patients.ser"))) {
            List<Patient> patients = (List<Patient>) ois.readObject();
            System.out.println("Список пациентов успешно десериализован из файла patients.ser.");
            for (Patient patient : patients) {
                System.out.println(patient);
            }
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Ошибка при десериализации: " + e.getMessage());
        }
    }
}
