package org.springframework.samples.petclinic.flaky;

import org.aspectj.apache.bcel.classfile.Code;
import org.junit.Assert;
import org.junit.Test;

import java.util.Random;

import static java.lang.String.format;

public class FlakyTests {

  @Test
  public void randomTest1() {
    Random r = new Random();
    int i = r.nextInt(10);
    System.out.println(format("##teamcity[testMetadata key='randomTest1 value' type='number' value='%d']", i));
    Assert.assertTrue(i < 4);
  }

  @Test
  public void randomTest2() {
    Random r = new Random();
    int i = r.nextInt(10);
    System.out.println(format("##teamcity[testMetadata key='randomTest2 value' type='number' value='%d']", i));
    Assert.assertTrue(i < 5);
  }

  @Test
  public void randomTest3() {
    Random r = new Random();
    int i = r.nextInt(10);
    System.out.println(format("##teamcity[testMetadata key='randomTest3 value' type='number' value='%d']", i));
    Assert.assertTrue(i < 6);
  }
}
