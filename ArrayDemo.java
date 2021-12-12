public class ArrayDemo{
  public static void main(String[]args){
    
    int[][] joe = {{29, 43, 2, 12}, {24, -3, 12, -37}, {4}, {6, 29}};
    int[][] joe2 = copy(joe);
    System.out.println(arrToString(joe));
    System.out.println(countZeros2D(joe));
    replaceNegative(joe);
    System.out.println(arrToString(joe));
    System.out.println(countZeros2D(joe));
    System.out.println(arrToString(joe2));
    System.out.println("\n");
    
    int[][] joe3 = {{3, 3, 3}, {}, {5, 23, -5}, {-4, -4, -16, -22}};
    int[][] joe4 = copy(joe3);
    System.out.println(arrToString(joe3));
    System.out.println(countZeros2D(joe3));
    replaceNegative(joe3);
    System.out.println(arrToString(joe3));
    System.out.println(countZeros2D(joe3));
    System.out.println(arrToString(joe4));
    System.out.println("\n");
    
    int[][] joe5 = new int[7][];
    replaceNegative(joe5);
    System.out.println(arrToString(joe5));
    System.out.println(countZeros2D(joe5));
  }

  //0. Include function to help you print a 1D/2D array of ints.
  public static String arrToString(int[]ary){
    String result = "{";
    for (int i = 0; i < ary.length; i++){
      if (i != ary.length - 1){
        result += ary[i] + ", ";
      } else {
        result += ary[i];
      }
  }
  return result + "}";
}

  //The name can be the same, as long as the parameters are different!
  public static String arrToString(int[][]ary){
    String result = "{";
    for (int i = 0; i < ary.length; i++){
      result += "{";
      if (ary[i] == null){
        result += null;
      } else {
        for (int j = 0; j < ary[i].length; j++){
        if (j == ary[i].length - 1){
          result += ary[i][j];
        } else {
        result += ary[i][j] + ", ";
      }
    }
  }
    if (i == ary.length - 1){
      result += "}";
    } else {
    result += "}, ";
  }
  }
    return result + "}";
  }

  //1. Calculate and return how many zeros are in the parameter.
  public static int countZeros2D(int[][] nums){
    int joe = 0;
    for (int i = 0; i < nums.length; i++){
      if (nums[i] != null){
      for (int j = 0; j < nums[i].length; j++){
        if (nums[i][j] == 0) joe++;
      }
    }
    }
    return joe;
  }

  //2. Modify a given 2D array of integers as follows:
  //Replace all the negative values:
  //When the row number is the same as the column number replace negative with 1
  //all other negatives replace with 0
  public static void replaceNegative(int[][] vals){
    for (int i = 0; i < vals.length; i++){
      if (vals[i] != null){
      for (int j = 0; j < vals[i].length; j++){
        if (vals[i][j] < 0){
          if (i == j){
            vals[i][j] = -1;
          } else {
            vals[i][j] = 0;
          }
        }
      }
    }
    }
  }

  //3. Make a copy of the given 2d array. Make sure that changing the original does NOT change the copy.
  //DO NOT use any built in methods that "copy" an array.
  public static int[][] copy(int[][] nums){
    int[][] joemama = new int[nums.length][];
    for (int i = 0; i < nums.length; i++){
      joemama[i] = new int[nums[i].length];
      for (int j = 0; j < nums[i].length; j++){
        joemama[i][j] = nums[i][j];
      }
    }
    return joemama;
  }
}
