package com.kodilla.testing.mock;

import com.kodilla.testing.stub.Temperatures;
import com.kodilla.testing.stub.WeatherForecast;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;




public class WeatherForecastTestSuite {
    @Test
    public void testCalculateForecastWithMock() {

        //Given
        Temperatures temperaturesMock = mock(Temperatures.class);
        HashMap<Integer,Double> temperaturesMap = new HashMap<>();
        temperaturesMap.put(0, 25.5);
        temperaturesMap.put(1, 24.5);
        temperaturesMap.put(2, 22.5);
        temperaturesMap.put(3, 25.9);
        temperaturesMap.put(4, 33.5);
        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);


        //When
        int quantityOfSensors = weatherForecast.calculateForecast().size();

        //Then
        Assert.assertEquals(5, quantityOfSensors);


    }
}
