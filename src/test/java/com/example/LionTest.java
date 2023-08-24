package com.example;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {
  @Mock
  IFeline feline;


    @Test
  public void getKittenSuccess() throws Exception {
    Lion lion = new Lion(feline, "Самка");
    lion.getKittens();
    Mockito.verify(feline, Mockito.times(1)).getKittens();
  }

  @Test
  public void lionGetFoodSuccess() throws Exception {
    Lion lion = new Lion(feline, "Самец");
    lion.getFood();
    Mockito.verify(feline, Mockito.times(1)).getFood("Хищник");
  }


}
