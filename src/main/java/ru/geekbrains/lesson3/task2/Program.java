package ru.geekbrains.lesson3.task2;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class Program {

    static Random random = new Random();

    /**
     * TODO: Переработать метод generateEmployee в рамках домашнего задания,
     *  метод должен генерировать рабочих (Employee) разных типов.
     * @return
     */
    static Employee generateEmployee(){
        String[] names = new String[] { "Анатолий", "Глеб", "Клим", "Мартин", "Лазарь", "Владлен", "Клим", "Панкратий", "Рубен", "Герман" };
        String[] surnames = new String[] { "Григорьев", "Фокин", "Шестаков", "Хохлов", "Шубин", "Бирюков", "Копылов", "Горбунов", "Лыткин", "Соколов" };
        int salary = random.nextInt(20000, 80000);
        int hours = random.nextInt(50, 100);
        int age = random.nextInt(21, 65);
        if (random.nextBoolean() == true)
            return new Worker(names[random.nextInt(names.length)], surnames[random.nextInt(3)], salary, age);
        else
            return new Freelancer(names[random.nextInt(names.length)], surnames[random.nextInt(3)], 800, hours, age);
    }


    /**
     * TODO: Придумать новые состояния для наших сотрудников
     *  Придумать несколько Comparator'ов для сортировки сотрудников
     *  по фамилии + имени или по возрасту и уровню ЗП.
     * @param args
     */
    public static void main(String[] args) {

        Employee[] employees = new Employee[10];
        for (int i = 0; i < employees.length; i++){
            employees[i] = generateEmployee();
        }

        Arrays.sort(employees); // new SalaryComparator()

        for(Employee employee : employees){
            System.out.println(employee);
        }

    }

}
