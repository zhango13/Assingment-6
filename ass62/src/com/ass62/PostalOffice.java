package com.ass62;

import java.util.ArrayList;

public abstract class PostalOffice {
    protected ArrayList<MagazineSubscriber> Mobservers;
    protected ArrayList<PaperSubscriber> Pobservers;
    public PostalOffice() {
        Mobservers = new ArrayList<>();
        Pobservers = new ArrayList<>();
    }
    public void attachMag(MagazineSubscriber mobserver) {
        Mobservers.add(mobserver);
    }
    public void detachMag(MagazineSubscriber mobserver) {
        Mobservers.remove(mobserver);
    }
    public void attachPap(PaperSubscriber pobserver) {
        Pobservers.add(pobserver);
    }
    public void detachPap(PaperSubscriber pobserver) {
        Pobservers.remove(pobserver);
    }
    protected abstract void notifyMsubscriber();
    protected abstract void notifyPsubscriber();
}