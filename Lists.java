import java.util.ArrayList;
import java.util.List;
public class Lists{
  public static void main(String[] args){
    
    ArrayList<String> favorite = new ArrayList<String>(List.of("interstellar", "the dark knight", "the godfather"));
    favorite.add("se7en");
    favorite.add("harry potter");

    favorite.remove(2);

    for(String movie : favorite){
      System.out.println(movie);
    }
  }

}