package ru.mirea.task16.src.com.metanit;

import org.junit.Assert;

import java.util.ArrayList;
import java.util.List;

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