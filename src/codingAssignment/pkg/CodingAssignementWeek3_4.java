package codingAssignment.pkg;

import java.util.Arrays;

public class CodingAssignementWeek3_4 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub

 // #1   
    //a.
    int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
    System.out.println("#1 a. answer: "+ sumOfFirstAndLast(ages));
    
    //b. added an additional age to show my method works no matter what
    int[] agesTwo = {3, 9, 23, 64, 2, 8, 28, 93, 101};
    System.out.println("#1 b. answer: "+ sumOfFirstAndLast(agesTwo));

    //c. add all elements together, then calculate average
    double sum = 0;
    for (int i = 0; i < ages.length; i++) {
    sum += ages[i];
    }
    double average = sum / ages.length;
    System.out.println("#1 c. answer: "+ average);
    
    
 // #2
     //a. using a method to convert the string array to an integer 
    //  array, then calculating the sum of each integer and then calculating the average
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
  public static int sumOfFirstAndLast(int[]x) {
    int sum = x[0] + x[x.length - 1];
        return sum;
  }
  
  
  
// #2 methods
  public static int[] convertWordsToIntegers(String[]x) {
    int[] in = new int[x.length];
    for (int j = 0; j< x.length; j++) {
      in[j] = x[j].length();
    }
    return in;
  }
  
  public static String concatenateStringArray(String[] y) {
    String concatString = "";
    for (int k=0; k <= y.length - 1; k++) {
      concatString = concatString + y[k] + " ";
    } return concatString;
  }
  
 // #5 method
 public static int[] nameLengthsArrayMaker(String[]z, int[]a) {
   for(int n=0; n<a.length; n++) {
     a[n] = z[n].length();
   }
  return a;
 }
  
 // #7 method
 public static String concatenateStrings(String b, int c) {
   String answer = "";
   for(int m= 1; m<= c; m++) {
     answer = answer + b;
     }
   return answer;
 }
 
 // #8 method
 public static String fullNameCreator(String e, String f) {
   String fullName = e + " " + f; 
   return fullName;
 }
 
 
 // #9 method
 public static boolean isGreaterThanHundred(int[]num) {
   int totalNum = 0;
   for (int p=0; p<num.length; p++) {
     totalNum += num[p];
   } if (totalNum > 100) {
     return true;
   } 
   return false;
 }
 
 // #10 method
 public static double averageOfDoubleArray(double[] g) {
   double sm = 0;
   for (int q= 0; q<g.length; q++) {
     sm += g[q];
   }
   return sm / g.length;
 }
 
 
 // #11 method
 public static boolean isDoubleAvgGreater(double[] a, double[] b) {
   double sm = 0;
   double sm2 = 0;
   for (int i=0; i<a.length; i++) {
     sm += a[i];
     double davg = sm / a.length;
     
     for (int j=0; j<b.length; j++) {
       sm2 += b[j];
       double davg2 = sm2 / b.length;
       if ( davg > davg2) {
         return true;
       }
   }
   }
   return false;
 }
 
 
 // #12 method
 public static boolean willBuyDrink(boolean x, double y) {
   if (x == true && y > 10.50) {
     return true;
   }
   return false;
 }
 
 
 // #13 method 
 public static String willYouGetTheJob(int w, boolean x, String[] b) {
   for(int i = 0; i< b.length; i++) {
   if(w >= 5 && x == true && b[i] == "Technology") {
     String str = "You will definitely get the job!";
     return str;
   } else if(w >= 5 && x == false && b[i] == "Technology") {
     String str = "You will likely not get the job";
     return str;
   } else if (w >= 5 && x == true && b[i] == "Office Administration") {
     String str = "You will likely get the job";
     return str;
   } else if (w >= 5 && x == false && b[i] == "Office Administration") {
     String str = "You will likely not the job";
     return str;
   } else if (w < 5 && x == true && b[i] == "Technology") {
     String str = "You might get the job";
     return str;     
   } else if (w < 5 && x == true && b[i] == "Office Administration") {
     String str = "You may get this job";
     return str; 
   } else if (w < 5 && x == false && b[i] == "Technology") {
     String str = "You will surely not the job";
     return str; 
   } else if (w < 5 && x == false && b[i] == "Office Administration") {
     String str = "You will absolutely not the job";
     return str; 
}
 }
  return "something went wrong";
 
 }
}