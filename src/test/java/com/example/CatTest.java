package com.example;

import org.junit.Assert;
import org.junit.Test;

public class CatTest {


  Feline feline = new Feline();
  Cat cat = new Cat(feline);

  @Test
  public void getSoundSuccess () {
    Assert.assertEquals("Мяу", cat.getSound());
  }



}
