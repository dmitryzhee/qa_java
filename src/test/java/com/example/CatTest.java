package com.example;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;
import java.util.prefs.PreferencesFactory;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {
    @Spy
    Feline feline = new Feline();

    Cat cat;

    @Before
    public void setUp() {
        cat = new Cat(feline);
    }

    @Test
    public void getFoodSuccess() throws Exception {

        cat.getFood();
        Mockito.verify(feline, Mockito.times(1)).eatMeat();
    }

    @Test
    public void getSoundSuccess() {
        Assert.assertEquals("Мяу",cat.getSound());
    }
}
