package org;

import java.math.BigDecimal;

public abstract class Friend implements Participant {
    private String name;
    private NewlyWedsType newlyWedsType;
    private BigDecimal giftMoney;
    private boolean isParticipate;

    @Override
    public void checkIn() {
        writeGuestBook(name, newlyWedsType);
        bless();
    }

    @Override
    public void giveWeddingMoney() {
        
    }

    @Override
    public void takePhoto() {

    }

    @Override
    public void clap() {

    }

    @Override
    public void checkOut() {

    }

    @Override
    public boolean isParticipate(){
        return isParticipate;
    }

    private void writeGuestBook(String name, NewlyWedsType newlyWedsType) {
        GuestBook.printName(name, newlyWedsType);
    }

    private void bless() {
        System.out.println("この度はご結婚おめでとうございます");
    }
}
