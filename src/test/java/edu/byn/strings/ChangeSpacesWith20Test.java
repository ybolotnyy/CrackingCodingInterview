package test.java.edu.byn.strings;

import main.java.edu.byn.strings.ChangeSpacesWith20;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by ybolotnyy on 2/15/17.
 */
public class ChangeSpacesWith20Test {
  @Test
  public void testNullStringShouldReturnNull() {
    ChangeSpacesWith20 c = new ChangeSpacesWith20();
    assertEquals(c.changeSpacesWith20(null), null, "Null string should return null");
  }

  @Test
  public void testEmptyStringShouldReturnInputString() {
    ChangeSpacesWith20 c = new ChangeSpacesWith20();
    assertEquals(c.changeSpacesWith20(""), "");
  }
}