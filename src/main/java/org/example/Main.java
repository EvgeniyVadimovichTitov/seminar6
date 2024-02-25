package org.example;


//В качестве задачи предлагаю вам реализовать код для демонстрации парадокса
// Монти Холла (Парадокс Монти Холла — Википедия ) и наглядно убедиться в верности парадокса
// (запустить игру в цикле на 1000 и вывести итоговый счет).
//        Необходимо:
//        Создать свой Java Maven или Gradle проект;
//        Подключите зависимость lombok и возможно какую
//        то математическую библиотеку (напр. commons-math3)
//        Самостоятельно реализовать прикладную задачу;
//        Сохранить результат игр в одну из коллекций или в какой то библиотечный класс
//        Вывести на экран статистику по победам и поражениям
//        В качестве ответа прислать ссылку на репозиторий,
//        в котором присутствует все важные файлы проекта (напр pom.xml)

import org.apache.commons.math3.stat.Frequency;
import org.apache.commons.math3.stat.descriptive.DescriptiveStatistics;
import org.apache.commons.math3.stat.descriptive.UnivariateStatistic;


public class Main {
    public static void main(String[] args) {
        Frequency strategy1 = new Frequency();
        Frequency strategy2 = new Frequency();

        for (int i = 0; i<1000000; i++){
            Game game1 = new Game(false);
            strategy1.addValue(game1.start());
            Game game2 = new Game(true);
            strategy2.addValue(game2.start());
            if (i==999999){
                System.out.println(game1.getStrategySay());
                System.out.println("win: "+strategy1.getCount(1));
                System.out.println(strategy1);
                System.out.println(game2.getStrategySay());
                System.out.println("win: "+strategy2.getCount(1));
                System.out.println(strategy2);
            }
        }



    }
}