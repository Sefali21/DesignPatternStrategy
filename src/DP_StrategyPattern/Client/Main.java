package DP_StrategyPattern.Client;

import DP_StrategyPattern.BahaviorA.*;
import DP_StrategyPattern.BehaviorB.*;
import DP_StrategyPattern.BehaviorB.ConcreteBahaviorB1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Für Behavior A 1 für Behavior B 2 drucken");
        int auswahl=scanner.nextInt();
        String wahl;
        switch (auswahl){
            case 1:
                System.out.println("Für ConcreteBehaviorA1 a fürConcreteBehaviorA2 b drucken");
                wahl=scanner.next();
                if(wahl.equalsIgnoreCase("a")){
                    new ConcreteBehaviorA1().action1();
                } else new ConcreteBehaviorA2() ; break;
            case 2: System.out.println("Für ConcreteBehaviorB1 a fürConcreteBehaviorB2 b drucken");
                wahl=scanner.next();
                if(wahl.equalsIgnoreCase("a")){
                    new ConcreteBahaviorB1().action2();
                } else new ConcreteBahaviorB2() ; break;

        }
    }
}
