package com.softserve.academy.homeworks.homeWork_2;

import com.softserve.academy.homeWorks.homeWork_2.TrafficLight;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TrafficLightTest {

    @Test
    void trafficLight() {
      //  TrafficLight.trafficLight(5);
        assertEquals("GREEN light", TrafficLight.trafficLight(1));
        assertEquals("GREEN light", TrafficLight.trafficLight(52));
        assertEquals("GREEN light", TrafficLight.trafficLight(3));
        assertEquals("RED light", TrafficLight.trafficLight(4));
        assertEquals("RED light", TrafficLight.trafficLight(19));
    }
}