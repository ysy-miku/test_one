package homework3;

public class cat extends animal{
    String name2 ="baoge";
    final char sex2 ='g';
    final int age2 =12;
    public char color;public char surnames;
    cat(){this.color = '白';this.surnames = '猫'; }
    void setColor(char color) {
        this.color = color;
    }
    int getColer() {return color; }
    void setSurnames(char surnames){this.surnames = surnames;}
    char getSurnames(){return surnames;}
    @Override
    public void eat() { System.out.println("xuxubaobao"); }
    @Override
    public void sleep() { super.sleep(); }
}
