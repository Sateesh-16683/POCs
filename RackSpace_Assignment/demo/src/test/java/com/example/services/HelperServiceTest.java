package com.example.services;

import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;
import org.springframework.util.StringUtils;

import com.example.demo.services.HelperService;

import static org.assertj.core.api.Assertions.assertThat;


public class HelperServiceTest {

    @Test
    public void testGetReverseString(){

        String input = "This is my test string";
        HelperService helperService = new HelperService();
        String actualResult = helperService.getReverseString(input);
        String expectedResult = "string test my is This";
        assertThat(actualResult).isEqualTo(expectedResult);
    }

    @Test
    public void testGetReverseStringForEmptyString(){

        String input = "";
        HelperService helperService = new HelperService();
        String actualResult = helperService.getReverseString(input);
        String expectedResult = "";
        assertThat(actualResult).isEqualTo(expectedResult);
    }


    @Test
    public void testGetReverseStringForException() throws Exception{
        new HelperService().getReverseString(null);
    }
}
