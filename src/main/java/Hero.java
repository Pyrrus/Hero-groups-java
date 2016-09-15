import java.util.Random;

//REMEMBER TO RENAME
public class Hero {
  private String mName;
  private int mAge;
  private String mPower;
  private String mWeakness;
  private int mAttack;
  private int mDefense;
  private static String[] weaknesses = {"water", "cake", "old people", "being outside", "the color fuchsia", "logic", "hugs"};

  public Hero(String name, int age, String power){
    mName = name;
    mAge = age;
    mPower = power;
    Random random = new Random();
    mWeakness = weaknesses[random.nextInt(weaknesses.length)];
    mAttack = random.nextInt(10)+1;
    mDefense = random.nextInt(10)+1;
  }

  public String getName(){
    return mName;
  }

  public int getAge(){
    return mAge;
  }

  public String getPower(){
    return mPower;
  }

  public String getWeakness(){
    return mWeakness;
  }

  public int getAttack(){
    return mAttack;
  }

  public int getDefense(){
    return mDefense;
  }

}
