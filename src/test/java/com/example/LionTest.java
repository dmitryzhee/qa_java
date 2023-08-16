package com.example;

import jdk.jfr.BooleanFlag;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.Mockito.mock;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {
  @Spy
  IFeline feline = new Feline();

  Lion lion;

  @Before
  public void setUp() {
   lion = new Lion(feline);
  }


    @Test
  public void getKittenSuccess() {
    Assert.assertTrue(lion.getKittens() == 1 );
  }

  @Test
  public void lionGetFoodSuccess() throws Exception {
    lion.getFood();
    Mockito.verify(feline, Mockito.times(1)).getFood("Хищник");
  }
}
