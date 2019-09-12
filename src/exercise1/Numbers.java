package exercise1;

public class Numbers {

  public static Number multiply(int base, int exponent){
    // create a keep of number
    int currentVal = base;
    for (int i = 0; i < exponent-1; i++)
      currentVal = currentVal * base;
    return currentVal;
  }

}
