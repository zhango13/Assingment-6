package com.ass61;

public class character {
    private action act;

    public void setAct(action a) {
        this.act = a;
    }

    public action getAct() {
        return act;
    }
    public void whaticando(){
        act.whaticando();
    }
    public void StartGame(){
        System.out.println("You have finished choosing, so game is starting...");
    }
}
