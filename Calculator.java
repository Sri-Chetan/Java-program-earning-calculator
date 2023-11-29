import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        // Display the menu to the user
        System.out.println ( "\t\t\t\tMENU\n1) Calculate earnings at $10.00/hr\n2) Calculate earnings at $.10 doubled each hour\n3) Exit" );
        // Main program loop
        while(true){
            System.out.print ( "Select option from above menu: " );
            Scanner sc = new Scanner(System.in);
            // user's choice
            switch (sc.nextInt()){
                case 1:
                    // Calculate earnings at $10.00/hr
                    System.out.println("How many hours? ");
                    float h = sc.nextFloat();
                    float e = (int)h * 10;
                    System.out.println("You will earn: $"+e);
                    break;
                case 2:
                    // Calculate earnings at $.10 doubled each hour
                    System.out.println("How many hours? ");
                    float h1 = sc.nextFloat();
                    float rate = 0.0F;
                    float mul = 0.1F;
                    for (int i=0; i<(int)h1;i++){
                        rate = rate+mul;
                        mul = mul*2;
                    }
                    System.out.println("you will earn: $"+rate);
                    break;
                case 3:
                    // Exit the program
                    System.exit(0);
            }
        }


        }
    }
