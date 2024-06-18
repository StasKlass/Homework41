package org.example;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class SerializePatients {

    public static void main(String[] args) {
        List<Patient> patients = new ArrayList<>();
        patients.add(new Patient("Иванов Иван Иванович", 30, "Грипп", LocalDate.of(2024, 5, 20)));
        patients.add(new Patient("Петров Петр Петрович", 40, "ОРВИ", LocalDate.of(2024, 6, 10)));
        patients.add(new Patient("Сидоров Сидор Сидорович", 50, "COVID-19", LocalDate.of(2024, 7, 15)));

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("patients.ser"))) {
            oos.writeObject(patients);
            System.out.println("Список пациентов успешно сериализован в файл patients.ser.");
        } catch (IOException e) {
            System.err.println("Ошибка при сериализации: " + e.getMessage());
        }
    }
}
