package com.example;

import org.junit.Assert;
import org.junit.Test;

public class LionTest {

  IFeline feline = new Feline();
  Lion lion = new Lion(feline);

    @Test
  public void getKittenSuccess() {
    Assert.assertTrue(lion.getKittens() == 1 );
  }


}
