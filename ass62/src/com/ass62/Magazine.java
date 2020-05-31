package com.ass62;

public class Magazine extends PostalOffice {
    private int number;
    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
        notifyMsubscriber();
    }
    @Override
    protected void notifyMsubscriber() {
        Mobservers.forEach((Mobserver) -> {
            Mobserver.updateMagazine(number);
        });
    }

    @Override
    protected void notifyPsubscriber() {

    }
}