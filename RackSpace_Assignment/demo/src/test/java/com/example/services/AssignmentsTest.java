package com.example.services;

import org.junit.jupiter.api.Test;

import com.example.demo.services.Assignments;

import static org.assertj.core.api.Assertions.assertThat;


public class AssignmentsTest {

    @Test
    public void testRemoveDuplicateElements(){

        int arr[] = {10,20,20,30,30,40,50,50};
        int actualResult = Assignments.removeDuplicateElements(arr,arr.length);
        int expectedResult = 5;
        assertThat(actualResult).isEqualTo(expectedResult);
    }

    @Test
    public void testRemoveDuplicateElementsWhenNoDuplicatesFound(){

        int arr[] = {10,20,30};
        int actualResult = Assignments.removeDuplicateElements(arr,arr.length);
        int expectedResult = 3;
        assertThat(actualResult).isEqualTo(expectedResult);
    }

    @Test
    public void testRemoveDuplicateElementsWhenSingleDuplicateElementFound(){

        int arr[] = {10,10,10};
        int actualResult = Assignments.removeDuplicateElements(arr,arr.length);
        int expectedResult = 1;
        assertThat(actualResult).isEqualTo(expectedResult);
    }
}
