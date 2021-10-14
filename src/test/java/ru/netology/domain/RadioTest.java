package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {

    @Test
    public void theCurrentStationZero() {
        Radio radio = new Radio();
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
        radio.nextStation();
        int actual = radio.getCurrentStation();
        int expected = 1;
        assertEquals(expected, actual);
    }
    @Test
    public void stationNextOne() {
        Radio radio = new Radio();
        radio.setCurrentStation(1);
        radio.nextStation();
        int actual = radio.getCurrentStation();
        int expected = 2;
        assertEquals(expected, actual);
    }
    @Test
    public void stationNextTwo() {
        Radio radio = new Radio();
        radio.setCurrentStation(2);
        radio.nextStation();
        int actual = radio.getCurrentStation();
        int expected = 3;
        assertEquals(expected, actual);
    }
    @Test
    public void stationNextThree() {
        Radio radio = new Radio();
        radio.setCurrentStation(3);
        radio.nextStation();
        int actual = radio.getCurrentStation();
        int expected = 4;
        assertEquals(expected, actual);
    }
    @Test
    public void stationNextFour() {
        Radio radio = new Radio();
        radio.setCurrentStation(4);
        radio.nextStation();
        int actual = radio.getCurrentStation();
        int expected = 5;
        assertEquals(expected, actual);
    }
    @Test
    public void stationNextFive() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);
        radio.nextStation();
        int actual = radio.getCurrentStation();
        int expected = 6;
        assertEquals(expected, actual);
    }
    @Test
    public void stationNextSix() {
        Radio radio = new Radio();
        radio.setCurrentStation(6);
        radio.nextStation();
        int actual = radio.getCurrentStation();
        int expected = 7;
        assertEquals(expected, actual);
    }
    @Test
    public void stationNextSeven() {
        Radio radio = new Radio();
        radio.setCurrentStation(7);
        radio.nextStation();
        int actual = radio.getCurrentStation();
        int expected = 8;
        assertEquals(expected, actual);
    }
    @Test
    public void stationNextEight() {
        Radio radio = new Radio();
        radio.setCurrentStation(8);
        radio.nextStation();
        int actual = radio.getCurrentStation();
        int expected = 9;
        assertEquals(expected, actual);
    }
    @Test
    public void stationNextNine() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.nextStation();
        int actual = radio.getCurrentStation();
        int expected = 0;
        assertEquals(expected, actual);
    }
    @Test
    public void stationPrevZero() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.prevStation();
        int actual = radio.getCurrentStation();
        int expected = 9;
        assertEquals(expected, actual);
    }
    @Test
    public void stationPrevOne() {
        Radio radio = new Radio();
        radio.setCurrentStation(1);
        radio.prevStation();
        int actual = radio.getCurrentStation();
        int expected = 0;
        assertEquals(expected, actual);
    }
    @Test
    public void stationPrevTwo() {
        Radio radio = new Radio();
        radio.setCurrentStation(2);
        radio.prevStation();
        int actual = radio.getCurrentStation();
        int expected = 1;
        assertEquals(expected, actual);
    }
    @Test
    public void stationPrevThree() {
        Radio radio = new Radio();
        radio.setCurrentStation(3);
        radio.prevStation();
        int actual = radio.getCurrentStation();
        int expected = 2;
        assertEquals(expected, actual);
    }
    @Test
    public void stationPrevFour() {
        Radio radio = new Radio();
        radio.setCurrentStation(4);
        radio.prevStation();
        int actual = radio.getCurrentStation();
        int expected = 3;
        assertEquals(expected, actual);
    }
    @Test
    public void stationPrevFive() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);
        radio.prevStation();
        int actual = radio.getCurrentStation();
        int expected = 4;
        assertEquals(expected, actual);
    }
    @Test
    public void stationPrevSix() {
        Radio radio = new Radio();
        radio.setCurrentStation(6);
        radio.prevStation();
        int actual = radio.getCurrentStation();
        int expected = 5;
        assertEquals(expected, actual);
    }
    @Test
    public void stationPrevSeven() {
        Radio radio = new Radio();
        radio.setCurrentStation(7);
        radio.prevStation();
        int actual = radio.getCurrentStation();
        int expected = 6;
        assertEquals(expected, actual);
    }
    @Test
    public void stationPrevEight() {
        Radio radio = new Radio();
        radio.setCurrentStation(8);
        radio.prevStation();
        int actual = radio.getCurrentStation();
        int expected = 7;
        assertEquals(expected, actual);
    }
    @Test
    public void stationPrevNine() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.prevStation();
        int actual = radio.getCurrentStation();
        int expected = 8;
        assertEquals(expected, actual);
    }
    @Test
    public void increaseVolumeZero() {
        Radio radio = new Radio();
        radio.currentVolume = 0;
        radio.increaseVolume();
        int actual = radio.currentVolume;
        int expected = 1;
        assertEquals(expected, actual);
    }
    @Test
    public void increaseVolumeOne() {
        Radio radio = new Radio();
        radio.currentVolume = 1;
        radio.increaseVolume();
        int actual = radio.currentVolume;
        int expected = 2;
        assertEquals(expected, actual);
    }
    @Test
    public void increaseVolumeTwo() {
        Radio radio = new Radio();
        radio.currentVolume = 2;
        radio.increaseVolume();
        int actual = radio.currentVolume;
        int expected = 3;
        assertEquals(expected, actual);
    }
    @Test
    public void increaseVolumeThree() {
        Radio radio = new Radio();
        radio.currentVolume = 3;
        radio.increaseVolume();
        int actual = radio.currentVolume;
        int expected = 4;
        assertEquals(expected, actual);
    }
    @Test
    public void increaseVolumeFour() {
        Radio radio = new Radio();
        radio.currentVolume =4;
        radio.increaseVolume();
        int actual = radio.currentVolume;
        int expected = 5;
        assertEquals(expected, actual);
    }
    @Test
    public void increaseVolumeFive() {
        Radio radio = new Radio();
        radio.currentVolume = 5;
        radio.increaseVolume();
        int actual = radio.currentVolume;
        int expected = 6;
        assertEquals(expected, actual);
    }
    @Test
    public void increaseVolumeSix() {
        Radio radio = new Radio();
        radio.currentVolume = 6;
        radio.increaseVolume();
        int actual = radio.currentVolume;
        int expected = 7;
        assertEquals(expected, actual);
    }
    @Test
    public void increaseVolumeSeven() {
        Radio radio = new Radio();
        radio.currentVolume = 7;
        radio.increaseVolume();
        int actual = radio.currentVolume;
        int expected = 8;
        assertEquals(expected, actual);
    }
    @Test
    public void increaseVolumeEight() {
        Radio radio = new Radio();
        radio.currentVolume = 8;
        radio.increaseVolume();
        int actual = radio.currentVolume;
        int expected = 9;
        assertEquals(expected, actual);
    }
    @Test
    public void increaseVolumeNine() {
        Radio radio = new Radio();
        radio.currentVolume = 9;
        radio.increaseVolume();
        int actual = radio.currentVolume;
        int expected = 10;
        assertEquals(expected, actual);
    }
    @Test
    public void increaseVolumeTen() {
        Radio radio = new Radio();
        radio.currentVolume = 10;
        radio.increaseVolume();
        int actual = radio.currentVolume;
        int expected = 10;
        assertEquals(expected, actual);
    }
    @Test
    public void increaseVolumeMore() {
        Radio radio = new Radio();
        radio.currentVolume = 100;
        radio.increaseVolume();
        int actual = radio.currentVolume;
        int expected = 10;
        assertEquals(expected, actual);
    }
    @Test
    public void decreaseVolumeZero() {
        Radio radio = new Radio();
        radio.currentVolume = 0;
        radio.decreaseVolume();
        int actual = radio.currentVolume;
        int expected = 0;
        assertEquals(expected, actual);
    }
    @Test
    public void decreaseVolumeOne() {
        Radio radio = new Radio();
        radio.currentVolume = 1;
        radio.decreaseVolume();
        int actual = radio.currentVolume;
        int expected = 0;
        assertEquals(expected, actual);
    }
    @Test
    public void decreaseVolumeTwo() {
        Radio radio = new Radio();
        radio.currentVolume = 2;
        radio.decreaseVolume();
        int actual = radio.currentVolume;
        int expected = 1;
        assertEquals(expected, actual);
    }
    @Test
    public void decreaseVolumeThree() {
        Radio radio = new Radio();
        radio.currentVolume = 3;
        radio.decreaseVolume();
        int actual = radio.currentVolume;
        int expected = 2;
        assertEquals(expected, actual);
    }
    @Test
    public void decreaseVolumeFour() {
        Radio radio = new Radio();
        radio.currentVolume = 4;
        radio.decreaseVolume();
        int actual = radio.currentVolume;
        int expected = 3;
        assertEquals(expected, actual);
    }
    @Test
    public void decreaseVolumeFive() {
        Radio radio = new Radio();
        radio.currentVolume = 5;
        radio.decreaseVolume();
        int actual = radio.currentVolume;
        int expected = 4;
        assertEquals(expected, actual);
    }
    @Test
    public void decreaseVolumeSix() {
        Radio radio = new Radio();
        radio.currentVolume = 6;
        radio.decreaseVolume();
        int actual = radio.currentVolume;
        int expected = 5;
        assertEquals(expected, actual);
    }
    @Test
    public void decreaseVolumeSeven() {
        Radio radio = new Radio();
        radio.currentVolume = 7;
        radio.decreaseVolume();
        int actual = radio.currentVolume;
        int expected = 6;
        assertEquals(expected, actual);
    }
    @Test
    public void decreaseVolumeEight() {
        Radio radio = new Radio();
        radio.currentVolume = 8;
        radio.decreaseVolume();
        int actual = radio.currentVolume;
        int expected = 7;
        assertEquals(expected, actual);
    }
    @Test
    public void decreaseVolumeNine() {
        Radio radio = new Radio();
        radio.currentVolume = 9;
        radio.decreaseVolume();
        int actual = radio.currentVolume;
        int expected = 8;
        assertEquals(expected, actual);
    }
    @Test
    public void decreaseVolumeTen() {
        Radio radio = new Radio();
        radio.currentVolume = 10;
        radio.decreaseVolume();
        int actual = radio.currentVolume;
        int expected = 9;
        assertEquals(expected, actual);
    }
    @Test
    public void decreaseVolumeSmaller() {
        Radio radio = new Radio();
        radio.currentVolume = -100;
        radio.decreaseVolume();
        int actual = radio.currentVolume;
        int expected = 0;
        assertEquals(expected, actual);
    }
}