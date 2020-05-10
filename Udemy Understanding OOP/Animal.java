public abstract class Animal{
  int age;
  String gender;
  Double weight;
  public Animal (int age,String gender,double weight){
    this.age=age;
    this.gender=gender;
    this.weight=weight;
  }
  public void eat(){
    System.out.println("Eating...");
  }
  public void sleep(){
    System.out.println("Sleeping...");
  }
  public abstract void Move();
}
    