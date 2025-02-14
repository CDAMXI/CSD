package Tema2_Act4;

public class Box1{
    private int content = 0;
    private boolean full = false;

    public int get(){
        if (!full) {Thread.yield();}
        int value = content;
        content = 0;
        full = false;
        return value;
    }

    public void put(int value){
        if (full) {Thread.yield();}
        content = value;
        full = true;
    }
}
