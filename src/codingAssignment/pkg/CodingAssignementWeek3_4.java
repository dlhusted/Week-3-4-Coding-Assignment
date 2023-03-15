package codingAssignment.pkg;

import java.util.Arrays;

public class CodingAssignementWeek3_4 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub

 // #1   
    //a.
    int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
    System.out.println("#1 a. answer: "+ subtractFirstFromLast(ages));
    
    //b. added an additional age to show my method works all the time
    int[] agesTwo = {3, 9, 23, 64, 2, 8, 28, 93, 101};
    System.out.println("#1 b. answer: "+ subtractFirstFromLast(agesTwo));

    //c. add all elements together, then calculate average
    double sum = 0;
    for (int i = 0; i < ages.length; i++) {
    sum += ages[i];
    }
    double average = sum / ages.length;
    System.out.println("#1 c. answer: "+ average);
    
    
 // #2
     //a. using a method to convert the string array to an integer 
     //   array, then calculating the sum of each integer and then calculating the average
    String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
   int[] integers = convertWordsToIntegers(names);
   double sum2 = 0;
   for (int j = 0; j< integers.length;j++) {
     sum2 += integers[j];
   }
   double avg = sum2 / integers.length;
   System.out.println("#2 a. answer: "+ avg);
   
    
    //b.
   System.out.println("#2 b. answer: "+ concatenateStringArray(names));
    
   
 // #3
   System.out.println("#3 answer: "+ names[names.length-1]);
   
 // #4
   System.out.println("#4 answer: "+ names[0]);
   
 // #5 
   int[] nameLengths = new int[names.length];
    nameLengthsArrayMaker(names, nameLengths);
   System.out.println("#5 answer: "+ Arrays.toString(nameLengths));
   
 // #6
   int s = 0;
   for (int t=0; t<nameLengths.length; t++) {
     s += nameLengths[t];
   }
   System.out.println("#6 answer: " + s);
   
   
 // #7   
   System.out.println("#7 answer: " + concatenateStrings("Hello", 3));
   
   
 // #8
   String firstName = "Caitlyn";
   String lastName = "Brooke";
   System.out.println("#8 answer: " + fullNameCreator(firstName, lastName));
 
   
 // #9
   int[] arrayOfInt = {8, 9, 11, 10, 90, 0, 1};
   System.out.println("#9 answer: " + isGreaterThanHundred(arrayOfInt));
   
   
 // #10 
   double[] arrayOfDouble = {55.48, 678.18, 98.15, 1100.85, 823.65};
   System.out.println("#10 answer (average of double[] arrayOfDouble: " + averageOfDoubleArray(arrayOfDouble));

   
 // #11
   double[] arrayOfDoub2 = {85.483, 48.89, 18.26, 0.02, 0.03, 0.56};
   System.out.println("(average of double[] arrayOfDoub2: " + averageOfDoubleArray(arrayOfDoub2));
   System.out.println("#11 answer: " + isDoubleAvgGreater(arrayOfDouble, arrayOfDoub2));
 
   
 // #12
   boolean isHotOutside = true;
   double moneyInPocket = 12.50;
   System.out.println("#12 answer is: " + willBuyDrink(isHotOutside, moneyInPocket));
 
   
 // #13
   //my method is going to predict whether you got the job or not after your interview!
   int interviewVibeCheckOutOfTen = 8;
   boolean isFastLearner = true;
   String[] industryType = {"Technology", "Office Administration"};
   System.out.println("#13 answer is: " + willYouGetTheJob(interviewVibeCheckOutOfTen, isFastLearner, industryType));
   
   
   
 // METHODS ARE BELOW THIS LINE 
  }
 
// #1 method
  public static int subtractFirstFromLast(int[]num) {
    int subtract = num[num.length - 1] - num[0];
        return subtract;
  }
  
  
// #2 methods
  public static int[] convertWordsToIntegers(String[]str) {
    int[] num = new int[str.length];
    for (int j = 0; j< str.length; j++) {
      num[j] = str[j].length();
    }
    return num;
  }
  
  public static String concatenateStringArray(String[] str) {
    String concatString = "";
    for (int i=0; i <= str.length - 1; i++) {
      concatString = concatString + str[i] + " ";
    } return concatString;
  }
  
 // #5 method
 public static int[] nameLengthsArrayMaker(String[]str, int[]num) {
   for(int i =0; i<num.length; i++) {
     num[i] = str[i].length();
   }
  return num;
 }
  
 // #7 method
 public static String concatenateStrings(String str, int num) {
   String answer = "";
   for(int i= 1; i<= num; i++) {
     answer = answer + str;
     }
   return answer;
 }
 
 // #8 method
 public static String fullNameCreator(String str1, String str2) {
   String fullName = str1 + " " + str2; 
   return fullName;
 }
 
 
 // #9 method
 public static boolean isGreaterThanHundred(int[]num) {
   int total = 0;
   for (int i=0; i<num.length; i++) {
     total += num[i];
   } if (total > 100) {
     return true;
   } 
   return false;
 }
 
 // #10 method
 public static double averageOfDoubleArray(double[] num) {
   double sum = 0;
   for (int i= 0; i<num.length; i++) {
     sum += num[i];
   }
   return sum / num.length;
 }
 
 
 // #11 method
 public static boolean isDoubleAvgGreater(double[] num1, double[] num2) {
   double sum = 0;
   double sum2 = 0;
   for (int i=0; i<num1.length; i++) {
     sum += num1[i];
     double avg = sum / num1.length;
     
     for (int j=0; j<num2.length; j++) {
       sum2 += num2[j];
       double avg2 = sum2 / num2.length;
       if ( avg > avg2) {
         return true;
       }
   }
   }
   return false;
 }
 
 
 // #12 method
 public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
   if (isHotOutside == true && moneyInPocket > 10.50) {
     return true;
   }
   return false;
 }
 
 
 // #13 method 
 public static String willYouGetTheJob(int num, boolean x, String[] str) {
   for(int i = 0; i< str.length; i++) {
   if(num >= 5 && x == true && str[i] == "Technology") {
     String predict = "You will definitely get the job!";
     return predict;
   } else if(num >= 5 && x == false && str[i] == "Technology") {
     String predict = "You will likely not get the job";
     return predict;
   } else if (num >= 5 && x == true && str[i] == "Office Administration") {
     String predict = "You will likely get the job";
     return predict;
   } else if (num >= 5 && x == false && str[i] == "Office Administration") {
     String predict = "You will likely not the job";
     return predict;
   } else if (num < 5 && x == true && str[i] == "Technology") {
     String predict = "You might get the job";
     return predict;     
   } else if (num < 5 && x == true && str[i] == "Office Administration") {
     String predict = "You may get this job";
     return predict; 
   } else if (num < 5 && x == false && str[i] == "Technology") {
     String predict = "You will surely not the job";
     return predict; 
   } else if (num < 5 && x == false && str[i] == "Office Administration") {
     String predict = "You will absolutely not the job";
     return predict; 
}
 }
  return "something went wrong";
 
 }
}