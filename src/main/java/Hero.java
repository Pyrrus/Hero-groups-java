import java.util.Random;

//REMEMBER TO RENAME
public class Hero {
  private String mName;
  private int mAge;
  private String mPower;
  private String mWeakness;
  private static String[] weaknesses = {"water", "cake", "old people", "being outside", "the color fuchsia", "logic", "hugs"};

  public Hero(String name, int age, String power){
    mName = name;
    mAge = age;
    mPower = power;
    Random random = new Random();
    mWeakness = weaknesses[random.nextInt(weaknesses.length)];
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

}
