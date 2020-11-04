package homework3;

public final class cat extends animal{
    private char color;public char surnames;
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
