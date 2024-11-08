package com.lhso.desafiopicpay.project.core.entities.User;

import java.math.BigDecimal;
import java.util.UUID;

public class UserWallet {

    private UUID id;
    private UUID ownerId;
    private UserType ownerType;
    private BigDecimal balance;

    public UserWallet() {

    }

    public UserWallet(UUID id, UUID ownerId, BigDecimal balance, UserType ownerType) {
        this.id = id;
        this.ownerId = ownerId;
        this.balance = balance;
        this.ownerType = ownerType;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public UUID getId() {
        return id;
    }

    public UUID getOwnerId() {
        return ownerId;
    }

    public UserType getOwnerType() {
        return ownerType;
    }
}
