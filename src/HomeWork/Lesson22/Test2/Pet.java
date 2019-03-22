package HomeWork.Lesson22.Test2;

public class Pet extends Animal {

    public Pet(){
        System.out.println("I am pet");
        setEyes(2);
    }
    private String name;
    private int tail = 1;
    private int paw = 4;


    public void jamp (){
        System.out.println("Pet jump");
    }

    public void run (){
        System.out.println("Pet runs");
    }

//    public void setEyes() {
//        super.setEyes(2);
//    }

    public int getPaw() {
        return paw;
    }

    public void setPaw(int paw) {
        this.paw = paw;
    }

    public int getTail() {
        return tail;
    }

    public void setTail(int tail) {
        this.tail = tail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
