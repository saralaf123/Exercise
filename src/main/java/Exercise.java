import java.util.Scanner;
public class Exercise {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter name");

        String userName = myObj.nextLine();  // Read user input
        System.out.println("hi " + userName);  // Output user input
        myObj = new Scanner(System.in);
        System.out.println("how high do you want to count?");
        int number =myObj.nextInt();
        for(int i=1 ;i<=number;i++)
        {
            System.out.println(i);
        }

    }
}
