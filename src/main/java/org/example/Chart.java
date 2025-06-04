package org.example;

public interface Chart
{
    void notifyChartUpdate(String artist, String title, double quantitySold);

    int getChartPosition(String artist, String title);
}
