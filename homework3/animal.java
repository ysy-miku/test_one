package homework3;

public class animal {
    private int age;
    private String name;
    private char sex;
    animal(){this.name="旭旭宝宝";this.sex='m';}
    void setName(String name){
        this.name = name;
    }
    String getName(){
        return this.name;
    }
    void setSex(char sex){
        this.sex = sex;
    }
    char getSex(){
        return this.sex;
    }
    public  void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return this.age;
    }
    public void eat(){
        System.out.println("I am eating"+"!");
    }
    public void sleep(){
        System.out.println("Z Z Z Z");
    }
}
