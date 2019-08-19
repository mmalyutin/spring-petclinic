package org.springframework.samples.petclinic.flaky;

import org.junit.Assert;
import org.junit.Test;

import java.util.Random;

public class FlakyTests {

  @Test
  public void randomTest1() {
    Random r = new Random();
    int i = r.nextInt(10);
    Assert.assertTrue(i < 4);
  }

  @Test
  public void randomTest2() {
    Random r = new Random();
    int i = r.nextInt(10);
    Assert.assertTrue(i < 5);
  }

  @Test
  public void randomTest3() {
    Random r = new Random();
    int i = r.nextInt(10);
    Assert.assertTrue(i < 6);
  }
}
