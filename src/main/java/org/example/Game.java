package org.example;

import lombok.Getter;

import java.util.Random;
//
//1 стратегия: если мы не меняем выбор, то не зависимо от того,
// какую дверь открыл ведущий, мы выигрываем только тогда, когда сразу
// и точно угадали дверь. Другими словами, мы выиграли — если загаданный
// номер двери ведущего совпадает с номером двери, которую выбрали мы.
// 2 стратегия: если же мы меняем выбор, то всё становится наоборот:
// мы проигрываем, если сразу угадали дверь, но поменяли её. И выигрываем,
// если сразу не угадали дверь, но изменили её на дверь ведущего.

@Getter
public class Game {
    private int winNumber;
    private int choiceNumber;
    private boolean strategy;
    //true - смена выбора,false - без смены
    private static final int returnNumberByWin = 1;
    private String strategySay;
    public Game(boolean strategy)
    {
        this.strategy = strategy;
        Random rnd = new Random();
        winNumber = rnd.nextInt(1,4);
        choiceNumber = rnd.nextInt(1,4);
        if(strategy == true){
            this.strategySay = "Стратегия смены выбора";
        }
        else{this.strategySay = "Стратегия без смены выбора";}
    }

    public int start(){
        if(strategy == false){
            return winNumber==choiceNumber?returnNumberByWin:0;
        }
        return winNumber==choiceNumber?0:returnNumberByWin;
    }


}
