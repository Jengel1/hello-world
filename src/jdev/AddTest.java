package jdev;

public class AddTest {
  @Test
  public void testAdd(){
    int x = 1;
    int y = 2;
    assertEquals(2, Hello.add(x,y));
  }
}

