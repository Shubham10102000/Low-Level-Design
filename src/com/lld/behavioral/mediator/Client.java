package com.lld.behavioral.mediator;

public class Client {
    public static void main(String[] args) {
        AuctionMediator auctionMediator = new Auction();
        Colleague s = new Bidder("S", auctionMediator);
        Colleague k = new Bidder("K", auctionMediator);

        s.placeBid(100);
        k.placeBid(1000);
        s.placeBid(1001);
    }
}
