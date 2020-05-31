package com.ass62;

public class Paper extends PostalOffice {
    private int number;
    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
        notifyPsubscriber();
    }
    @Override
    protected void notifyPsubscriber() {
        Pobservers.forEach((Pobserver) -> {
            Pobserver.updatePaper(number);
        });
    }

    @Override
    protected void notifyMsubscriber() {

    }
}