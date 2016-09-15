import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Squad {
  private int mSize;
  private String mGroupName;
  private String mCause;
  private List<Hero> mHeroes;
  private int mId;
  private int mSquadAttack;
  private int mSquadDefense;
  private static List<Squad> squads = new ArrayList<Squad>();

  public Squad(int size, String group, String cause) {
    mSize = size;
    mGroupName = group;
    mCause = cause;
    mHeroes = new ArrayList<Hero>();
    squads.add(this);
    mId = squads.size();
    mSquadDefense = 0;
    mSquadAttack = 0;
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

  public int getSquadAttack(){
    return mSquadAttack;
  }

  public int getSquadDefense(){
    return mSquadDefense;
  }

  public boolean addHero(Hero hero){
    if(mHeroes.size() < mSize){
      mHeroes.add(hero);
      mSquadAttack += hero.getAttack();
      mSquadDefense += hero.getDefense();
      return true;
    } else {
      return false;
    }
  }

  public boolean removeHero(String heroName){
    for(Hero hero:mHeroes){
      if (hero.getName().equals(heroName)){
        mSquadAttack -= hero.getAttack();
        mSquadDefense -= hero.getDefense();
        return mHeroes.remove(hero);
      }
    }
    return false;
  }

  public void clearHeroes(){
    mHeroes.clear();
    mSquadAttack = 0;
    mSquadDefense = 0;
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

  public static Squad fight(Squad squad1, Squad squad2){
    int squad1attack = squad1.getSquadAttack();
    int squad2attack = squad2.getSquadAttack();
    int squad1def = squad1.getSquadDefense();
    int squad2def = squad2.getSquadDefense();
    Random random = new Random();
    while(squad1def > 0 || squad2def > 0){
      squad1def -= random.nextInt(squad2attack+1);
      squad2def -= random.nextInt(squad1attack+1);
    }
    if(squad1def == 0){
      Squad.find(squad2.getId()).clearHeroes();
      return squad1;
    } else {
      Squad.find(squad1.getId()).clearHeroes();
      return squad2;
    }
  }
}
