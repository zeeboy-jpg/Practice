import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Please enter your heigth(in cm): ");
        double heigth = keyboard.nextDouble();
                
        System.out.println("Please enter your weigth(in kg): ");
        double weigth = keyboard.nextDouble();

        double BMI = weigth / (heigth / 100 * heigth / 100);
        
        if(BMI < 18.5)
        {
            System.out.println("You are thin.");
        }
        else if(BMI >= 18.5 && BMI < 25)
        {
            System.out.println("You are normal.");
        }else if(BMI >= 25)
        {
            System.out.println("You are fat.");
        }
    }
    
}
