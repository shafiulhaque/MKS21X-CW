public class Tester{
  public static void main(String[] args) {
    Animal dog = new Animal("woof", 5, "Benny");
    dog.speak();
    Bird Hawk = new Bird("caw", 2, "Rex", 8, "pink");
    Hawk.speak();
  //  Bird canary = new Animal("coo", 3, "Penny");
  //  canary.speak();
  // this doesn't work because bird is a sub class of animal, so you can't say new Animal when the object is a Bird
  // however, you can do the opposite with Animal cow = new Bird because a bird is an animal
    Animal cow = new Bird("moo", 2, "Joe", 13, "white");
    cow.speak();
  }
}
