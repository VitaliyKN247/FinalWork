package org.example;


import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        menu();

    }

    /**
     * основное меню
     */
    public static void menu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1: Завести новое животное \n" +
                "2: Показать всех животных \n" +
                "3: Выход");
        Integer choise = scanner.nextInt();
        if (choise == 1) {
            addAmimal();
        } else if (choise == 2) {
            System.out.println("Заглушка под вывод списка животных");
        } else if (choise == 3) {
            System.out.println("Выход");
        } else {
            System.out.println("Ошибка!");
        }
    }

    /**
     * доподнительное меню с командами
     */
    public static void dopMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1: Показать список команд \n" +
                "2: Обучить животное новым командам");
        Integer choise = scanner.nextInt();
        if (choise == 1) {
            System.out.println("Заглушка под вывод команд");
        } else if (choise == 2) {
            System.out.println("Новые команды");
        } else {
            System.out.println("Ошибка! Введите нужную команду");
        }
    }

    /**
     * Выбор класса, куда зачислить животное
     */
    public static void defenitionClass() {
        String pets = "Домашние";
        String pack_animals = "Вьючные";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите категорию:\n" +
                "1: Домашнее животное \n" +
                "2: Вьючное животное");
        Integer choise = scanner.nextInt();
        if (choise == 1) {
            System.out.println("Добавление к домашним");
            String animals = pets;
        } else if (choise == 2) {
            System.out.println("Добавление к вьючным");
            String animals = pack_animals;
        } else {
            System.out.println("Error!");
        }
        petsCommands(choise);
    }

    public static void petsCommands(Integer choise){
        if (choise == 1) {
            System.out.println("1: Сидеть, 2: Лежать, 3: Голос");
        } else if (choise == 2) {
            System.out.println("1: Рысь, 2: Галоп, 3: Шаг");
        } else {
            System.out.println("Error!");
        }
    }

//    public static void choiseDefenition(){
//        if
//    }

    /**
     * Добавление животных
     */
    public static void addAmimal() {
        int count = 0;
        count++;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите животное: ");
        String name = scanner.nextLine();
        defenitionClass();
        createTextFile(name);
    }

    /**
     * заполнение и создание текстового файла
     */
    public static void createTextFile(String name) {
        String tableOfContents = "Животные";
        try (FileWriter fileWriter = new FileWriter(tableOfContents)) {
            String nameStr = name;
            fileWriter.append(name);
        } catch (IOException e) {
            throw new RuntimeException("Error!");
        }
    }


    /**
     * счетчик
     */
    public class Counter {
        private int value;

        public Counter(){
            this.value = 0;
        }

        public void add(){
            this.value ++;
        }

        public int getValue(){
            return this.value;
        }
    }
}