package com.inqoo;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class SimpleTest {

    int counter = 0;

    @BeforeEach
    public void initEachTestMethod(){
        System.out.printf("Counter value before init: %d%n", counter);
        counter++;
    }

    @AfterEach
    public void cleanUpAfterEachTestMethod(){
        System.out.printf("Counter value before cleanup: %d%n", counter);
        counter = 0;
    }

    @Test
    public void firstCounterTest(){
        System.out.println(counter);
        org.junit.jupiter.api.Assertions.assertEquals(counter, 1);
        counter += 5;
    }

    @Test
    public void secondCounterTest(){
        System.out.println(counter);
        counter -= 3;
    }

    @Test
    public void assertJExample() {
        assertThat(counter).isEqualTo(1);
        assertThat(1).isSameAs(2);
        List<Integer> integers = List.of(1, 2, 3);
        assertThat(integers).containsAnyOf(3,5,8);
    }
}
