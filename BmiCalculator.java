import java.util.Scanner;
public class BMICalculator{
 public static void main(String[] args){
   Scanner inputValue = new Scanner(System.in);
   System.out.println("Enter your size in kilogramme:");
   int sizeInKilo = inputValue.nextInt();
   System.out.println("Enter your height in metres:");
   int heightInMeters = inputValue.nextInt();
   int bmiCalc =  sizeInKilo/(heightInMeters*heightInMeters);
    if(bmiCalc < 18.5){
     System.out.println("you are underweight");
}
if(bmiCalc > 18.5 || bmiCalc == 24.9){
 System.out.println("You are normal");
}
  if(bmiCalc > 25||bmiCalc == 29.9){
 System.out.println("You are overweight");
}
if(bmiCalc > 30){
 System.out.println("You are obesed");
    
}
}