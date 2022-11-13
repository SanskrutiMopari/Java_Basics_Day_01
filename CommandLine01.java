package Assignment_Day_01;

//To find the sum of command-line arguments and count the invalid integers entered???
public class CommandLine01 {
    public static void main(String[] args) {
        int num = 0;
        for (int i = 0; i < args.length; i++) {
            num += Integer.parseInt(args[i]);
        }

        System.out.println("The sum is " + num);
    }
}
