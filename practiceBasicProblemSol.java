#practice problem beginers
#We have a loud talking parrot. The "hour" parameter is the current hour time in the range 0..23. 
#We are in trouble if the parrot is talking and the hour is before 7 or after 20. Return true if we are in trouble.


public boolean parrotTrouble(boolean talking, int hour) {
  if(talking & hour < 7){
    return true;
  }else if(talking & hour >20){
    return true;
  }else{
    return false;
  }
}


#Given 2 ints, a and b, return true if one if them is 10 or if their sum is 10.
public boolean makes10(int a, int b) {
   int sum = a+ b;
  if(a == 10 || b == 10 || sum == 10 ){
    return true;
  }else{
    return false;
  }
}

#Given an int n, return true if it is within 10 of 100 or 200. Note: Math.abs(num) computes the absolute value of a number.

public boolean nearHundred(int n) {
  return ((Math.abs(100 - n) <= 10) ||
    (Math.abs(200 - n) <= 10));
}

#Given 2 int values, return true if one is negative and one is positive. Except if the parameter "negative" is true, then return true only if both are negative.
public boolean posNeg(int a, int b, boolean negative) {
  if(negative){
    return(a<0 && b<0);
  }else{
     return ((a < 0 && b > 0) || (a > 0 && b < 0));
  }
}

#Given a string, return a new string where "not " has been added to the front. However, if the string already begins with "not", return the string unchanged. Note: use .equals() to compare 2 strings.
public String notString(String str) {
  if(str.length()>=3 && str.substring(0, 3).equals("not")){
    return str;
  }else{
    return "not"+str;
  }
}

#Given a string, return a new string where the first and last chars have been exchanged.
#frontBack("code") → "eodc"
#frontBack("a") → "a"
#frontBack("ab") → "ba"
  
  public String frontBack(String str) {
  if(str.length() <=1)
  return str;
  
  String mid = str.substring(1, str.length()-1);
  return str.charAt(str.length()-1) +mid +str.charAt(0);
}

#Given a string, we'll say that the front is the first 3 chars of the string. If the string length is less than 3, the front is whatever is there. Return a new string which is 3 copies of the front.


#front3("Java") → "JavJavJav"
#front3("Chocolate") → "ChoChoCho"
#front3("abc") → "abcabcabc"
  
  public String front3(String str) {
  String first;
  if(str.length() >= 3){
    first = str.substring(0 , 3);
    
  }else{
    first = str;
  }
  return first+first+first
}

#Given a string, return true if the string starts with "hi" and false otherwise.


startHi("hi there") → true
startHi("hi") → true
startHi("hello hi") → false
  
public boolean startHi(String str) {
  if(str.length()<2)
  return false;
  String two = str.substring(0,2);
  if(two.equals("hi")){
    return true
  }else{
    return false;
  }
}




