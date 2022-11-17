package com.company;


public class LionAndHare {
    public static void main(String[] args) {
        Hare hare=new CleverHare();
        Lion lion=new StupidLian();
       hare.meetWithLion(lion);
        lion.meetWithHare(hare);


    }
}
abstract class Lion{
    public  boolean wit;

    abstract public void meetWithHare(Hare hare);

}

abstract class Hare{
    public  boolean wit;

    abstract public void meetWithLion(Lion lion);

}
class StupidLian extends Lion{

    public StupidLian() {
        wit=false;
    }

    @Override
    public void meetWithHare(Hare hare) {
        if(hare.wit)
            System.out.println("Lion jumped");
        else
            System.out.println("Lion eats the hare");

    }
}
class CleverLian extends Lion{

    public CleverLian() {
        wit=true;
    }

    @Override
    public void meetWithHare(Hare hare) {
        if(hare.wit)
            System.out.println("Lion talks hare");
        else
            System.out.println("Lion will eat the hare");

    }
}
class StupidHare extends  Hare{
    public  StupidHare(){
        wit=false;
    }

    @Override
    public void meetWithLion(Lion lion) {
        if(lion.wit)
            System.out.println("I have no chance");
        else
            System.out.println("I afraid him");

    }

}
class CleverHare extends  Hare{
    public  CleverHare(){
        wit=true;
    }

    @Override
    public void meetWithLion(Lion lion) {
        if(lion.wit)
            System.out.println("My attempt fails");
        else
            System.out.println("I will try to fool him");

    }
}