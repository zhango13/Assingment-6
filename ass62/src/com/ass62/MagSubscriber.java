package com.ass62;

public class MagSubscriber implements MagazineSubscriber {
    private int Mnumber;
    public int getMagazineNumber() {
        return Mnumber;
    }
    @Override
    public void updateMagazine(int magazineNumber) {
        this.Mnumber = magazineNumber;
    }
}