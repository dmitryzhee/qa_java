package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class FelineTest {
  @Spy
  Feline feline;


  @Test
  public void getFoodPredatorSuccess() throws Exception {
    feline.eatMeat();
    Mockito.verify(feline, Mockito.times(1)).getFood("Хищник");
  }

  @Test
  public void getFamilyFeline() {
    Feline familyFeline = new Feline();
    Assert.assertEquals("Кошачьи", familyFeline.getFamily());
  }

  @Test
  public void getKittenSuccess() {
    feline.getKittens();
    Mockito.verify(feline, Mockito.times(1)).getKittens();}


  @Test
  public void getKittensSuccess() {
    feline.getKittens(3);
    Mockito.verify(feline, Mockito.times(1)).getKittens(3);}

}


