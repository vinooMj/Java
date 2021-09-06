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

