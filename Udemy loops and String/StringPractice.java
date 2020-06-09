public class StringPractice{
  public static void main(String args[]){
    //substring or parts of string
    String a="abesh";
    String extractedstring=a.substring(1,3);
    System.out.println(extractedstring);
    //comparing String
    String b="hello";
    String c="there";
      if(a=="hello"){
      //this is a trap dont do this cause string is an object we can use == for int or other prm data types
    }
    if(a.equals("hello")){
      //right way
    }
       if(c.equals("ThEre")){
         System.out.println("not same");
       }
          if (c.equalsIgnoreCase("ThEre")){            //in this case compiler will ignore lower /upper capital
            System.out.println("sameee");
          }
          System.out.println(b.charAt(4));//to find specific charecter 
          //introduction to index position
          String rs="hi abrar ki obostha?";
          int num=rs.indexOf("obostha"); //left to right
          System.out.println(num);
          //if there are same 2 words then num input should be like this num=rs.indexOf("obostha",9);
          int num2=rs.lastIndexOf("abrar");//right to left
          System.out.println(num2) ; 
}
}