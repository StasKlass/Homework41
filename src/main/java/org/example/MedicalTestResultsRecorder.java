package org.example;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class MedicalTestResultsRecorder {

    public static void main(String[] args) {
        String fileName = "medical_results.txt";
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Введите ФИО пациента: ");
            String name = scanner.nextLine();
            System.out.println("Введите тип анализа: ");
            String testType = scanner.nextLine();
            System.out.println("Введите значение анализа: ");
            String testValue = scanner.nextLine();
            System.out.println("Введите дату проведения анализа (например, 2024-06-18): ");
            String testDate = scanner.nextLine();

            try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName, true))) {
                bw.write(name + "," + testType + "," + testValue + "," + testDate);
                bw.newLine();
                System.out.println("Данные успешно сохранены.");
            } catch (IOException e) {
                System.err.println("Ошибка при записи файла: " + e.getMessage());
            }

            System.out.println("Хотите ввести еще одну запись? (да/нет): ");
            String response = scanner.nextLine();
            if (response.equalsIgnoreCase("нет")) {
                break;
            }
        }

        scanner.close();
        System.out.println("Программа завершена.");
    }
}
