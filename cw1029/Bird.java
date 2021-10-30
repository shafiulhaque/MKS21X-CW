public class Bird extends Animal {
    private double height;
    private String color;

    public Bird(String noise, int age, String name, double height, String color){
      super (noise, age, name);
      this.height=height;
      this.color=color;
        //construct the Bird
    }


    public void speak(){
      super.speak();
      System.out.println("I am " + color + ".");
      System.out.println("I am " + height + " inches tall.");

      /*WITHOUT REPEATING CODE:
      print the following message replacing the ? with name/age/noise/color/height:
      My name is ?.
      I am ? years old.
      I say ?.
      I am ?
      I am ? inches tall
      */
      //warning, you cannot access private variables, so you CAN'T duplicate the code!
    }
}
