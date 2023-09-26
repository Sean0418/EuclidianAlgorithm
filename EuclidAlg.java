import java.util.*;

public class EuclidAlg {
    static int gcdReal = 0; 
    public static void main(String[] args) {
        int num1, num2; 
        Scanner input = new Scanner(System.in); 


        System.out.println("This program is used to find the greatest common divisor between 2 numbers");
        System.out.println("Please enter the first number: ");
        num1 = input.nextInt(); 
        System.out.println("Please enter your second number: ");
        num2 = input.nextInt(); 

        //Euclid 1 test code
        EuclidianAlgorithm1(num1, num2);
        System.out.println("The greatest common divisor of " 
        + num1 + " and " + num2 + " is " + gcdReal); 
        System.out.println("Euclid 1 complete! \n");

        //Euclid 2 test code
        System.out.println("The greatest common divisor of " 
        + num1 + " and " + num2 + " is " + EuclidianAlgorithm2(num1, num2)); 
        System.out.println("Euclid 2 complete! \n");
        
        input.close();

    }

    public static void EuclidianAlgorithm1(int num1, int num2){

        int temp; 
        if (num1>num2){
            temp=num2; 
            num2=num1;
            num1 = temp; 
        }else if (num1==num2){
            gcdReal = num1; 
        }

        if (num1==0){
            gcdReal = num2;
        }else{
           num2 = num2 % num1;  
           EuclidianAlgorithm1(num2, num1);
        }
        

    }

    public static int EuclidianAlgorithm2(int num1, int num2){
        if (num1 == 0){
            return num2;
        }else if (num1>num2 &&  num1 > 0){
            return EuclidianAlgorithm2(num2, num1);
        }else{
            return EuclidianAlgorithm2(num1, num2 % num1); 
        }


    }


}


