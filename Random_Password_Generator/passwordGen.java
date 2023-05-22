import java.util.Random;
import java.util.Scanner;
public class passwordGen {
    public static void main(String[] args) {
        Random abc = new Random();                      //it creates the random string
        int z = 10;
        String str = "1234567890ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz@#$%&*";     //possible outcomes
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of password : ");
        int a = sc.nextInt();                                                                   //length of the password
        char[] pass = new char[a];
        for(int i = 0; i< a ; i++){
            pass[i] = str.charAt(abc.nextInt(str.length()));                                //generating random string
        }
        System.out.println();
        System.out.println(pass);
        System.out.println();
    }
}
