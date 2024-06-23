package com.lld.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Auction implements AuctionMediator {
    private final List<Colleague> colleagues = new ArrayList<>();

    @Override
    public void addBidder(Colleague bidder) {
        colleagues.add(bidder);
    }

    @Override
    public void placeBid(Colleague bidder, int bidAmount) {
        for (Colleague colleague : colleagues) {
            if (!Objects.equals(bidder.getName(),colleague.getName())) {
                colleague.receiveBidNotification(bidAmount);
            }
        }
    }
}
