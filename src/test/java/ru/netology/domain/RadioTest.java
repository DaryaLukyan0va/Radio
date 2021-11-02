package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {

    @Test
    public void theCurrentStationZero() {
        Radio radio = new Radio(10);
        radio.setCurrentStation(0);
        int actual = radio.getCurrentStation();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void theCurrentStationOne() {
        Radio radio = new Radio();
        radio.setCurrentStation(1);
        int actual = radio.getCurrentStation();
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void theCurrentStationTwo() {
        Radio radio = new Radio();
        radio.setCurrentStation(2);
        int actual = radio.getCurrentStation();
        int expected = 2;
        assertEquals(expected, actual);
    }

    @Test
    public void theCurrentStationThree() {
        Radio radio = new Radio();
        radio.setCurrentStation(3);
        int actual = radio.getCurrentStation();
        int expected = 3;
        assertEquals(expected, actual);
    }

    @Test
    public void theCurrentStationFour() {
        Radio radio = new Radio();
        radio.setCurrentStation(4);
        int actual = radio.getCurrentStation();
        int expected = 4;
        assertEquals(expected, actual);
    }

    @Test
    public void theCurrentStationFive() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);
        int actual = radio.getCurrentStation();
        int expected = 5;
        assertEquals(expected, actual);
    }

    @Test
    public void theCurrentStationSix() {
        Radio radio = new Radio();
        radio.setCurrentStation(6);
        int actual = radio.getCurrentStation();
        int expected = 6;
        assertEquals(expected, actual);
    }

    @Test
    public void theCurrentStationSeven() {
        Radio radio = new Radio();
        radio.setCurrentStation(7);
        int actual = radio.getCurrentStation();
        int expected = 7;
        assertEquals(expected, actual);
    }

    @Test
    public void theCurrentStationEight() {
        Radio radio = new Radio();
        radio.setCurrentStation(8);
        int actual = radio.getCurrentStation();
        int expected = 8;
        assertEquals(expected, actual);
    }

    @Test
    public void theCurrentStationNine() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        int actual = radio.getCurrentStation();
        int expected = 9;
        assertEquals(expected, actual);
    }

    @Test
    public void theCurrentStationSmaller() {
        Radio radio = new Radio();
        radio.setCurrentStation(-1);
        int actual = radio.getCurrentStation();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void theCurrentStationMore() {
        Radio radio = new Radio();
        radio.setCurrentStation(11);
        int actual = radio.getCurrentStation();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void stationNextZero() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        int actual = radio.nextStation();
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void stationNextOne() {
        Radio radio = new Radio();
        radio.setCurrentStation(1);
        int actual = radio.nextStation();
        int expected = 2;
        assertEquals(expected, actual);
    }

    @Test
    public void stationNextTwo() {
        Radio radio = new Radio();
        radio.setCurrentStation(2);
        int actual = radio.nextStation();
        int expected = 3;
        assertEquals(expected, actual);
    }

    @Test
    public void stationNextThree() {
        Radio radio = new Radio();
        radio.setCurrentStation(3);
        int actual = radio.nextStation();
        int expected = 4;
        assertEquals(expected, actual);
    }

    @Test
    public void stationNextFour() {
        Radio radio = new Radio();
        radio.setCurrentStation(4);
        int actual = radio.nextStation();
        int expected = 5;
        assertEquals(expected, actual);
    }

    @Test
    public void stationNextFive() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);
        int actual = radio.nextStation();
        int expected = 6;
        assertEquals(expected, actual);
    }

    @Test
    public void stationNextSix() {
        Radio radio = new Radio();
        radio.setCurrentStation(6);
        int actual = radio.nextStation();
        int expected = 7;
        assertEquals(expected, actual);
    }

    @Test
    public void stationNextSeven() {
        Radio radio = new Radio();
        radio.setCurrentStation(7);
        int actual = radio.nextStation();
        int expected = 8;
        assertEquals(expected, actual);
    }

    @Test
    public void stationNextEight() {
        Radio radio = new Radio();
        radio.setCurrentStation(8);
        int actual = radio.nextStation();
        int expected = 9;
        assertEquals(expected, actual);
    }

    @Test
    public void stationNextNine() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        int actual = radio.nextStation();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void stationPrevZero() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        int actual = radio.prevStation();
        int expected = 9;
        assertEquals(expected, actual);
    }

    @Test
    public void stationPrevOne() {
        Radio radio = new Radio();
        radio.setCurrentStation(1);
        int actual = radio.prevStation();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void stationPrevTwo() {
        Radio radio = new Radio();
        radio.setCurrentStation(2);
        int actual = radio.prevStation();
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void stationPrevThree() {
        Radio radio = new Radio();
        radio.setCurrentStation(3);
        int actual = radio.prevStation();
        int expected = 2;
        assertEquals(expected, actual);
    }

    @Test
    public void stationPrevFour() {
        Radio radio = new Radio();
        radio.setCurrentStation(4);
        int actual = radio.prevStation();
        int expected = 3;
        assertEquals(expected, actual);
    }

    @Test
    public void stationPrevFive() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);
        int actual = radio.prevStation();
        int expected = 4;
        assertEquals(expected, actual);
    }

    @Test
    public void stationPrevSix() {
        Radio radio = new Radio();
        radio.setCurrentStation(6);
        int actual = radio.prevStation();
        int expected = 5;
        assertEquals(expected, actual);
    }

    @Test
    public void stationPrevSeven() {
        Radio radio = new Radio();
        radio.setCurrentStation(7);
        int actual = radio.prevStation();
        int expected = 6;
        assertEquals(expected, actual);
    }

    @Test
    public void stationPrevEight() {
        Radio radio = new Radio();
        radio.setCurrentStation(8);
        int actual = radio.prevStation();
        int expected = 7;
        assertEquals(expected, actual);
    }

    @Test
    public void stationPrevNine() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        int actual = radio.prevStation();
        int expected = 8;
        assertEquals(expected, actual);
    }


    @Test
    public void increaseVolumeZero() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.increaseVolume();
        int actual = radio.getCurrentVolume();
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeNinetyEight() {
        Radio radio = new Radio();
        radio.setCurrentVolume(98);
        radio.increaseVolume();
        int actual = radio.getCurrentVolume();
        int expected = 99;
        assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeNinetyNine() {
        Radio radio = new Radio();
        radio.setCurrentVolume(99);
        radio.increaseVolume();
        int actual = radio.getCurrentVolume();
        int expected = 100;
        assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeOneHundred() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.increaseVolume();
        int actual = radio.getCurrentVolume();
        int expected = 100;
        assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeOneHundredOne() {
        Radio radio = new Radio();
        radio.setCurrentVolume(101);
        radio.increaseVolume();
        int actual = radio.getCurrentVolume();
        int expected = 100;
        assertEquals(expected, actual);
    }


    @Test
    public void decreaseVolumeMinusOne() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
        radio.decreaseVolume();
        int actual = radio.getCurrentVolume();
        int expected = 0;
        assertEquals(expected, actual);
    }


    @Test
    public void decreaseVolumeZero() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.decreaseVolume();
        int actual = radio.getCurrentVolume();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolumeOne() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);
        radio.decreaseVolume();
        int actual = radio.getCurrentVolume();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolumeTwo() {
        Radio radio = new Radio();
        radio.setCurrentVolume(2);
        radio.decreaseVolume();
        int actual = radio.getCurrentVolume();
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolumeOneHundred() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.decreaseVolume();
        int actual = radio.getCurrentVolume();
        int expected = 99;
        assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolumeOneHundredOne() {
        Radio radio = new Radio();
        radio.setCurrentVolume(101);
        radio.decreaseVolume();
        int actual = radio.getCurrentVolume();
        int expected = 100;
        assertEquals(expected, actual);
    }


}