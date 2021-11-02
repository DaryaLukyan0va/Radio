package ru.netology.domain;

public class Radio {
    private int numberStation;
    private int currentStation;
    private int currentVolume;
    private int minVolume = 0;
    private int maxVolume = 100;

    public Radio(int numberStation) {
        this.numberStation = numberStation;
    }

    public Radio() {
        this.numberStation = 10;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        this.currentVolume = currentVolume;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation >= 0 && currentStation < numberStation) {
            this.currentStation = currentStation;
        } else {
            System.out.println("Вы указали неверную станцию");
        }
    }

    public int nextStation() {
        if (currentStation == numberStation - 1) {
            currentStation = 0;
        } else {
            currentStation = currentStation + 1;
        }
        return currentStation;
    }

    public int prevStation() {
        if (currentStation > 0) {
            currentStation = currentStation - 1;
        } else {
            currentStation = numberStation - 1;
        }
        return currentStation;
    }


    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        } else {
            currentVolume = maxVolume;
            System.out.println("Максимальная громкость");
        }
    }

    public void decreaseVolume() {
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
        } else {
            currentVolume = minVolume;
            System.out.println("Минимальная громкость");
        }
    }

}