import java.util.ArrayList;

/**
 * Created by Nóra on 2017. 04. 10..
 */
public class Character extends GameObject {
  static ArrayList<Character> characterList = new ArrayList<>();

  public Character() {
  }

  public Character(int column, int row) {
    super(column, row);
  }
}
