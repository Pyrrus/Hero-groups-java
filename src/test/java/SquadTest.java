import org.junit.*;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

public class SquadTest{
  @After
  public void tearDown() {
    Squad.clear();
  }

  @Test
  public void make_Squad() {
    Squad group = new Squad(2, "C.A.T.S.", "catching and talking to spiders");
    assertEquals(true, group instanceof Squad);
  }

  @Test
  public void getSize_oftheGroup () {
    Squad group = new Squad(2, "C.A.T.S.", "catching and talking to spiders");
    assertEquals(2, group.getSize());
  }

  @Test
  public void getGroupName_oftheGroup () {
    Squad group = new Squad(2, "C.A.T.S.", "catching and talking to spiders");
    assertEquals("C.A.T.S.", group.getGroupName());
  }

  @Test
  public void getCause_oftheGroup () {
    Squad group = new Squad(2, "C.A.T.S.", "catching and talking to spiders");
    assertEquals("catching and talking to spiders", group.getCause());
  }

  @Test
  public void getHeroes_instantiatesCorrectly () {
    Squad group = new Squad(2, "C.A.T.S.", "catching and talking to spiders");
    assertEquals(0, group.getHeroes().size());
  }

  @Test
  public void getHeroes_sizeIncreasesWhenHeroAdded () {
    Squad group = new Squad(2, "C.A.T.S.", "catching and talking to spiders");
    Hero hero = new Hero("Steve", 47, "Having a midlife crisis");
    group.addHero(hero);
    assertEquals(1, group.getHeroes().size());
  }

  @Test
  public void getHeroes_cannotAddWhenTooManyHeroes () {
    Squad group = new Squad(2, "C.A.T.S.", "catching and talking to spiders");
    Hero hero = new Hero("Steve", 47, "Having a midlife crisis");
    Hero hero2 = new Hero("Bob the MonkeyPerson", 12, "Whining");
    Hero hero3 = new Hero("Jane the Magnificent", 23, "keeping beverages hot");
    group.addHero(hero);
    group.addHero(hero2);
    assertEquals(false, group.addHero(hero3));
  }

  @Test
  public void removeHero_returnsTrueOnRemove () {
    Squad group = new Squad(2, "C.A.T.S.", "catching and talking to spiders");
    Hero hero = new Hero("Steve", 47, "Having a midlife crisis");
    group.addHero(hero);
    assertEquals(true, group.removeHero("Steve"));
  }

  @Test
  public void removeHero_returnsFalseIfNotFound () {
    Squad group = new Squad(2, "C.A.T.S.", "catching and talking to spiders");
    Hero hero = new Hero("Steve", 47, "Having a midlife crisis");
    group.addHero(hero);
    assertEquals(false, group.removeHero("Bob"));
  }

  @Test
  public void getId_returnsId () {
    Squad group = new Squad(2, "C.A.T.S.", "catching and talking to spiders");
    assertEquals(1, group.getId());
  }

  @Test
  public void All_returnsAll () {
    Squad group = new Squad(2, "C.A.T.S.", "catching and talking to spiders");
    Squad otherGroup = new Squad(17, "Too Many Heroes", "arguing amongst each other");
    assertTrue(Squad.all().contains(group));
    assertTrue(Squad.all().contains(otherGroup));
  }

  @Test
  public void clear_clearsList () {
    Squad group = new Squad(2, "C.A.T.S.", "catching and talking to spiders");
    Squad.clear();
    assertEquals(0, Squad.all().size());
  }

  @Test
  public void find_returnsCorrectSquad () {
    Squad group = new Squad(2, "C.A.T.S.", "catching and talking to spiders");
    Squad otherGroup = new Squad(17, "Too Many Heroes", "arguing amongst each other");
    assertEquals(Squad.find(otherGroup.getId()), otherGroup);
  }
}
