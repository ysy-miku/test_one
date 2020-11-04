package homework3;

public class dog extends animal{dog(){ this.run(); }
    void run(){System.out.println("run"); }
    void run(String adv){System.out.println("run fast");}
    @Override
    public void sleep() { System.out.println("zzzz"); }
    String tail;private  String ear;
    void setTail(String tail) {
        this.tail = tail;
    }
    String getTail() {return tail; }
    void setEar(String ear){this.ear = ear;}
    String getEar(){return ear;}
}
