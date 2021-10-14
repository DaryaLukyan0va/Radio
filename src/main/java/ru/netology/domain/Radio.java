package ru.netology.domain;

public class Radio {
    public int currentStation;
    public int currentVolume;

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if(currentStation >= 0 && currentStation <= 9) {
            this.currentStation = currentStation;
        }
        else {
            System.out.println("Вы указали неверную станцию");
        }
    }

    public void nextStation() {
        if (currentStation < 9) {
            currentStation = currentStation + 1;
        }
        else {
            currentStation = 0;
        }
    }
    public void prevStation() {
        if (currentStation > 0) {
            currentStation = currentStation - 1;
        }
        else {
            currentStation = 9;
        }
    }

    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
        else {
            currentVolume = 10;
            System.out.println("Максимальная громкость");
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
        else {
            currentVolume = 0;
            System.out.println("Минимальная громкость");
        }
    }
}