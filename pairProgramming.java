public class pairProgramming{
  public static int myLastIndex(String str, String sub){
    int len = sub.length();
    int index = 0;
    for (int i = 0; i < str.length() - len; i++){
      if (str.substring(i, i+len).equals(sub)){
        index = i;
      }
    }
    return index;
  }
  public static void main(String[] args){
    String hairy = "Happy and Here";
    String Joe = "Here";
    System.out.println(myLastIndex(hairy,Joe));
  }
}
