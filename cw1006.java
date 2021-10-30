// Name: Shafiul Haque, Period: 9
public class cw1006 {
  public static String aryToString(int[]nums){
    String joe = "[";
    for (int i = 0; i < nums.length; i++){
      joe += nums[i];
      if (i != nums.length - 1){
        joe += ", ";
      }
    }
    return joe + "]";
  }

  public static int[] returnCopy(int[]ary){
    int[] joe = new int[ary.length];
    for (int i = 0; i < ary.length; i++){
      joe[i] = ary[i];
    }
    return joe;
  }

  public static int[] concatArray(int[]ary1,int[]ary2){
    int[] joe = new int[ary1.length + ary2.length];
    for (int i = 0; i < joe.length; i++){
      if (i < ary1.length){
        joe[i] = ary1[i];
      } else {
        joe[i] = ary2[i - ary1.length];
      }
    }
    return joe;
  }
  public static void main(String[]args){
    int[] data1 = {1,2,3,4};
    int[] data2 = {1,2,3,4};
    int[] data3 = data2;
    int[] data4 = {};
    int[] data5 = {92032,-7};
    data1[1]=999;
    data2[2]=888;
    data3[3]=777;
    data5[0]=0;
    String sdata1 = aryToString(data1);
    String sdata2 = aryToString(data2);
    String sdata3 = aryToString(data3);
    String sdata4 = aryToString(data4);
    String sdata5 = aryToString(data5);

    System.out.println("Test Cases For aryToString:\ndata1 :\n"+aryToString(data1));
    System.out.println("data2 :\n"+aryToString(data2));
    System.out.println("data3 :\n"+aryToString(data3));
    System.out.println("data4 :\n"+aryToString(data4));
    System.out.println("data5 :\n"+aryToString(data5));
    System.out.println("Test Cases for returnCopy:\nCompare copy of data1:\n"+aryToString(returnCopy(data1)) + ", " + sdata1);
    System.out.println("Good, same copy, but are they the same array?: " + data1.equals(returnCopy(data1)) + "\n");
    System.out.println("Compare copy of data2:\n"+aryToString(returnCopy(data2)) + ", " + sdata2);
    System.out.println("Good, same copy, but are they the same array?: " + data2.equals(returnCopy(data2)) + "\n");
    System.out.println("Compare copy of data3:\n"+aryToString(returnCopy(data3)) + ", " + sdata3);
    System.out.println("Good, same copy, but are they the same array?: " + data3.equals(returnCopy(data3)) + "\n");
    System.out.println("Compare copy of data4:\n"+aryToString(returnCopy(data4)) + ", " + sdata4);
    System.out.println("Good, same copy, but are they the same array?: " + data4.equals(returnCopy(data4)) + "\n");
    System.out.println("Compare copy of data5:\n"+aryToString(returnCopy(data5)) + ", " + sdata5);
    System.out.println("Good, same copy, but are they the same array?: " + data5.equals(returnCopy(data5)) + "\n");
    System.out.println("Test Cases For concatArray:\nCombining data1 and data4:\ndata1 = " + sdata1 + ", data4 = " + sdata4 + "\nconcatenation: " + aryToString(concatArray(data1, data4)));
    System.out.println("Combining data2 and data3:\ndata2 = " + sdata2 + ", data3 = " + sdata3 + "\nconcatenation: " + aryToString(concatArray(data2, data3)));
    System.out.println("Combining data3 and data5:\ndata3 = " + sdata3 + ", data5 = " + sdata5 + "\nconcatenation: " + aryToString(concatArray(data3, data5)));
  }
}
