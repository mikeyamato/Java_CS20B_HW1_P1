package exercise1;

public class Numbers {

  // hiding properties
  protected int base, exponent;

  public int getBase() {
    return base;
  }

  public int getExponent() {
    return exponent;
  }

  public void setBase(int base) {
    this.base = base;
  }

  public void setExponent(int exponent) {
    this.exponent = exponent;
  }

  public static Number multiply(int base, int exponent){
    // create a keep of number
    int currentVal = base;
    for (int i = 0; i < exponent-1; i++)
      currentVal = currentVal * base;
    return currentVal;
  }

}
