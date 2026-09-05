package com.meeran.dynamicprogramming;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class TrainMapPathTest {

    @Test
    public void testShortestPath() {
        TrainMapPath.TrainMap trainMap = new TrainMapPath.TrainMap();

        trainMap.addStation("King's Cross St Pancras").addStation("Angel").addStation("Old Street")
                .addStation("Moorgate").addStation("Farringdon").addStation("Barbican").addStation("Russel Square")
                .addStation("Holborn").addStation("Chancery Lane").addStation("St Paul's").addStation("Bank");

        trainMap.connectStations(trainMap.getStation("King's Cross St Pancras"), trainMap.getStation("Angel"))
                .connectStations(trainMap.getStation("King's Cross St Pancras"), trainMap.getStation("Farringdon"))
                .connectStations(trainMap.getStation("King's Cross St Pancras"), trainMap.getStation("Russel Square"))
                .connectStations(trainMap.getStation("Russel Square"), trainMap.getStation("Holborn"))
                .connectStations(trainMap.getStation("Holborn"), trainMap.getStation("Chancery Lane"))
                .connectStations(trainMap.getStation("Chancery Lane"), trainMap.getStation("St Paul's"))
                .connectStations(trainMap.getStation("St Paul's"), trainMap.getStation("Bank"))
                .connectStations(trainMap.getStation("Angel"), trainMap.getStation("Old Street"))
                .connectStations(trainMap.getStation("Old Street"), trainMap.getStation("Moorgate"))
                .connectStations(trainMap.getStation("Moorgate"), trainMap.getStation("Bank"))
                .connectStations(trainMap.getStation("Farringdon"), trainMap.getStation("Barbican"))
                .connectStations(trainMap.getStation("Barbican"), trainMap.getStation("Moorgate"));

        String solution = "King's Cross St Pancras->Russel Square->Holborn->Chancery Lane->St Paul's";

        assertEquals(solution, TrainMapPath.TrainMap
                .convertPathToStringRepresentation(trainMap.shortestPath("King's Cross St Pancras", "St Paul's")));
    }
}
