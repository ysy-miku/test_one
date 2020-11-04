package homework3;

public class dog extends animal{dog(){ this.run(); }
    void run(){System.out.println("run"); }
    void run(String adv){System.out.println("run fast");}
    @Override
    public void sleep() {
        System.out.println("zzzz");
    }
    private String tail;private  String ear;
    public void setTail(String tail) {
        this.tail = tail;
    }
    public String getTail() {return tail; }
    public void setEar(String ear){this.ear = ear;}
    public String getEar(){return ear;}
}
