import java.util.HashMap;

public class hashh{
  
  public static void main(String[] args)
  {
    HashMap<String, Integer> h = new HashMap<>();
    
    h.put("vinoth", 1);
    h.put("lakshman", 2);
    
    System.out.println("sizeee" +h);
    System.out.println("sizeee" +h.size());
    
    if(h.containsKey("vinoth")){
      Integer a = h.get("vinoth");
    }
  }
}
