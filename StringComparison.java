package Assignment_Day_01;

//Write a program to check two strings are equal or not???
public class StringComparison {
    public static void main(String[] args) {


        String s1 = "India";
        String s2 = "India";
        String s3 = new String("India");
        System.out.println(s1 == s2);//true (because both refer to same instance)
        System.out.println(s1 == s3);//false(because s3 refers to instance created in nonpool)
    }
}

