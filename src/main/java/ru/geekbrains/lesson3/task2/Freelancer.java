package ru.geekbrains.lesson3.task2;

/**
 * TODO: Спроектировать класс Freelancer самостоятельно в рамках домашнего задания.
 *  *20*8
 */
public class Freelancer extends Employee {
    private int hoursWorked;

    public Freelancer(String name, String surname, double salary, int age, int hoursWorked) {
        super(name, surname, salary, age);
        this.hoursWorked = hoursWorked;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    @Override
    public double calculateSalary() {
        return hoursWorked * salary;
    }

    @Override
    public String toString() {
        return String.format("%s %s; Фрилансер; Возраст %d ; В текущем месяце заработная плата составила (почасовая оплата): %.2f (руб.)",
                surname, name, age, calculateSalary());
    }
}
