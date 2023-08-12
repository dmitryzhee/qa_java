package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class LionParameterizedTest {

  private final String sex;

  public LionParameterizedTest(String sex) throws Exception {
    this.sex = sex;
  }

  @Parameterized.Parameters
  public static Object [][] getData() {
    return new Object[][] {
            {"Самец"},
            {"Самка"},
            {"Неизвестно"}
    };
  }

  @Test
  public void shouldCheckMain() {
    try {
      Lion lion = new Lion(sex);
      if (sex.equals("Самец")) {
        Assert.assertTrue(lion.doesHaveMane());
      } else if (sex.equals("Самка")) {
        Assert.assertFalse(lion.doesHaveMane());
      }
    } catch (Exception exception) {
      Assert.assertTrue(exception.toString().contains("Используйте допустимые значения пола животного - самей или самка"));
    }
  }
  }







