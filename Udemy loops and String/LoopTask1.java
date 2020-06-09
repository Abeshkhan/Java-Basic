public class LoopTask1{
  public static void main(String args[]){
    String str=("we have a large inventory of things in our warehouse falling in"+
                "the category : appreal and the slighty" +
                "more in demand category : makeup along with the category : furniture and..");
    PrintCategories(str);
  }

 
// extract all categories from the string argument
  public static void PrintCategories(String str){
    int i=0;
    while(true){
      int found=str.indexOf("category",i); 
      if(found==-1)break; //this line matters to stop searching categories again cause value of i will be increase and couldnt find anymore categories and show -1
      int start = found+11; //category+ +:+ ==total 11 index
      int end= str.indexOf(" ",start);
      System.out.println(str.substring(start,end));
      i=end+1;                   
        }
    }
}
      
    
                