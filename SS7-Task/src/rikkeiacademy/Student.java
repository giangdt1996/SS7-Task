package rikkeiacademy;

public class Student {
    private int rollNo;
    private String name;
    private static String collage ="BBDIT";

    Student(int r,String n){
        rollNo = r;
        name = n;
    }
    static void change(){
        collage = "Rikkei Academy";
    }
    void display(){
        System.out.println(rollNo + " " + name + " " + collage);
    }
}
