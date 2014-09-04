import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;

public class TestBridge {

  @Test
  public void test() {
    List<Integer> toSort = Arrays.asList(2, 1);
    Collections.sort(toSort, new Bridge());
    Assert.assertThat(toSort.get(0), Is.is(1));
  }

}
