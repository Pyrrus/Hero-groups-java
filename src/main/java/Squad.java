import java.util.ArrayList;
import java.util.List;

public class Squad {
  private int mSize;
  private String mGroupName;
  private String mCause;
  private List<Hero> mHeroes;
  private int mId;
  private static List<Squad> squads = new ArrayList<Squad>();

  public Squad(int size, String group, String cause) {
    mSize = size;
    mGroupName = group;
    mCause = cause;
    mHeroes = new ArrayList<Hero>();
    squads.add(this);
    mId = squads.size();
  }

  public int getSize() {
    return mSize;
  }

  public String getGroupName() {
    return mGroupName;
  }

  public String getCause() {
    return mCause;
  }

  public List<Hero> getHeroes(){
    return mHeroes;
  }

  public int getId(){
    return mId;
  }

  public boolean addHero(Hero hero){
    if(mHeroes.size() < mSize){
      mHeroes.add(hero);
      return true;
    } else {
      return false;
    }
  }

  public boolean removeHero(String heroName){
    for(Hero hero:mHeroes){
      if (hero.getName().equals(heroName)){
        return mHeroes.remove(hero);
      }
    }
    return false;
  }

  public static List<Squad> all(){
    return squads;
  }

  public static void clear(){
    squads.clear();
  }

  public static Squad find(int id){
    try{
      return squads.get(id-1);
    } catch(IndexOutOfBoundsException e){
      return null;
    }
  }
}
