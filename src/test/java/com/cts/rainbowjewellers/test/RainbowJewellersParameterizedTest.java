package com.cts.rainbowjewellers.test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.cts.rainbowjewellers.service.RainbowJewellersService;

@RunWith(Parameterized.class)
public class RainbowJewellersParameterizedTest {
    private RainbowJewellersService service = new RainbowJewellersService();

    private double input;
    private double output;

    public RainbowJewellersParameterizedTest(double input, double output) {
        this.input = input;
        this.output = output;
    }

    @Parameters
    public static Collection<Double[]> testConditions(){
        Double [][]expectedOutputs = {
            {9.6, 48401.76},
            {56.0, 282343.6},
            {24.5, 123525.325},
            {0.0, 0.0},
            {-1.0, -5041.85}
        };
        return Arrays.asList(expectedOutputs);
    }

    @Test
    public void testCalculateGoldPrice(){
        assertEquals(output, service.calculategoldprice(input), 0.001);
    }
}
