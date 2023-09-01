package DP_StrategyPattern.Client;

import DP_StrategyPattern.BahaviorA.BehaviorA;
import DP_StrategyPattern.BehaviorB.BehaviorB;
import DP_StrategyPattern.BehaviorB.ConcreteBahaviorB1;

public class Client{
    private BehaviorA behaviorA;
    private BehaviorB behaviorB;
    private ConcreteBahaviorB1 concreteBahaviorB1;

    public Client(BehaviorA behaviorA) {
        this.behaviorA = behaviorA;
    }

    public Client(BehaviorB behaviorB) {
        this.behaviorB = behaviorB;
    }

    public Client(BehaviorA behaviorA, BehaviorB behaviorB) {
        this.behaviorA = behaviorA;
        this.behaviorB = behaviorB;
    }

    public Client() {

    }


    public BehaviorA getBehaviorA() {
        return behaviorA;
    }

    public void setBehaviorA() {
        this.behaviorA = behaviorA;
    }

    public BehaviorB getBehaviorB() {
        return behaviorB;
    }

    public void setBehaviorB(BehaviorB behaviorB) {
        this.behaviorB = behaviorB;
    }




}

class SubClass extends Client{


    public SubClass(BehaviorA behaviorA) {
        super(behaviorA);
    }

    public SubClass(BehaviorB behaviorB) {
        super(behaviorB);
    }

    public SubClass(BehaviorA behaviorA, BehaviorB behaviorB) {
        super(behaviorA, behaviorB);
    }

    public SubClass() {

    }

//    public static void main(String[] args) {
//        Client client=new Client(new BehaviorA() {
//            @Override
//            public void action1() {
//                System.out.println(" Client client=new Client(new BehaviorA()");
//            }
//        });
//        client.doAction();
//
//        Client client1=new SubClass();
//        client1.setBehaviorA();
//        System.out.println(client1.getBehaviorA());
//    }
}
