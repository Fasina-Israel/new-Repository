//user input number as score
//if the number is greater than 90 and equal to 100 it prints out A
//if the number is greater than or equal to 80 and lesser than 90 print out B
//if the number is greater than or equal to 70 and lesser than 80 print out C
//if the number is greater than or equal to 60 and lesser than 70 print out D
//if the number is greater than or equal to 50 and lesser than 60 print out F


import java.util.Scanner;
public class ScoreChecker{
 public static void main(String[] args){

  Scanner inputScore = new Scanner(System.in);
  System.out.print("Input your score");

  int number = inputScore.nextInt();
 if (number >= 90 && number <=100){
  System.out.print("A");
}
if (number >= 80 && number <= 89){
  System.out.print("B");
}
if (number >= 70 && number <=79){
  System.out.print("C");
}
if (number >= 60 && number <= 69){
  System.out.print("D");
}
if(number >= 50 && number <= 59){
  System.out.print("F");

}
 
}
}