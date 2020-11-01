import java.util.Scanner;

public class com2_level1_oushu {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("输入需要判断的数字a");
        int a = input.nextInt();
        boolean b = true;
        boolean c = false;
        if (a%2==0){System.out.println(b);}else {System.out.println(c);}
    }
}
