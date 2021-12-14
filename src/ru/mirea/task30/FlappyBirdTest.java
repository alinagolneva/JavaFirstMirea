package ru.mirea.task30;

import org.junit.Assert;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FlappyBirdTest {

    @org.junit.jupiter.api.Test
    void unit() {
        List<Integer> expected = FlappyBird.unit();
        List<Integer> actual = new ArrayList<>();
        for (int i=0; i< 10; i++) //создание стенки каждой итерации
        {
            actual.add(i);
        }
        Assert.assertEquals(expected, actual);
    }
}