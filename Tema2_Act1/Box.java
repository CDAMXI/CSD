package Tema2_Act1;

public class Box {
    private int content = 0;
    @SuppressWarnings("unused")
    private boolean full = false;

    public int get(){
        int value = content;
        content = 0;
        full = false;
        return value;
    }

    public void put(int value){
        content = value;
        full = true;
    }
}
