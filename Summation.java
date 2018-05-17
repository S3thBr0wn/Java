class SumObject{
  int sumMethod(int v){
  if (n <=1){
    return 1;
  }else{
    return (n+(sumMethod(n-1))); `  `
  }
  }
}

class Summation{
  public static void main (String a[]){
    int sumvalue = 0;
    int n = 30;
    SumObject s = new SumObject(n);
    sumvalue = s.sumMethod(n);
  }
}


class Summation{
  public static void main (String a[]){
    int sumvalue = 0;
    int n = 30;
    SumObject s = new SumObject(n);
    sumvalue = s.sumMethod(n);
  }
}
