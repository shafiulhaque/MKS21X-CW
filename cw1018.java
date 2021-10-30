public class cw1018{
  public static String arr2DToString(int[][] nums){
    String result = "";
    for (int i = 0; i < nums.length; i++){
      for (int j = 0; j < nums[i].length; j++){
        result += nums[i][j] + ", ";
      }
    }
    return result;
  }
  public static void main(String[] args){
    int[][] ary = {{2, 7, 8, 3}, {4, 6}, {4, 7, 9, 1, 5}};
    System.out.println(arr2DToString(ary));
  }
}
