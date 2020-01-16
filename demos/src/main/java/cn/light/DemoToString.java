package cn.light;

public class DemoToString {
    public String toString(){
        return getClass().getName()+"toString 重写了";
    }
    public static void main(String[] agrs){
        System.out.println(new DemoToString());
    }
}
