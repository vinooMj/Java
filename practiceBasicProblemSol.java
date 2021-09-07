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


