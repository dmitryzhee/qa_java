package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class LionParameterizedTest {

  private final String sex;
  private final boolean expectedResult;

  public LionParameterizedTest(String sex, boolean expectedResult) throws Exception {
    this.sex = sex;
    this.expectedResult = expectedResult;
  }

  @Parameterized.Parameters
  public static Object [][] getData() {
    return new Object[][] {
            {"Самец", true},
            {"Самка", false},
    };
  }

  @Test
  public void shouldCheckMain() throws Exception {
  Feline feline = new Feline();
  Lion lion = new Lion (feline, sex);
  boolean actualResult = lion.doesHaveMane();
  Assert.assertEquals(expectedResult, actualResult);
  }
}







