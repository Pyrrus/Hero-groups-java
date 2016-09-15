import org.junit.*;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

public class HeroTest{
  //REMEMBER TO RENAME!!!!!!1!one!
  @Test
  public void Hero_instantiatesCorrectly() {
    Hero hero = new Hero("Steve", 47, "Having a midlife crisis");
    assertEquals(true, hero instanceof Hero);
  }

  @Test
  public void getName_instantiatesCorrectly() {
    Hero hero = new Hero("Steve", 47, "Having a midlife crisis");
    assertEquals("Steve", hero.getName());
  }

  @Test
  public void getAge_instantiatesCorrectly() {
    Hero hero = new Hero("Steve", 47, "Having a midlife crisis");
    assertEquals(47, hero.getAge());
  }

  @Test
  public void getPower_instantiatesCorrectly() {
    Hero hero = new Hero("Steve", 47, "Having a midlife crisis");
    assertEquals("Having a midlife crisis", hero.getPower());
  }

  @Test
  public void getWeakness_instantiatesCorrectly() {
    Hero hero = new Hero("Steve", 47, "Having a midlife crisis");
    assertEquals(true, hero.getWeakness() instanceof String);
  }
}
