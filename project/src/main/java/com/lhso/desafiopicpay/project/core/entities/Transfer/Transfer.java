package com.lhso.desafiopicpay.project.core.entities.Transfer;

import java.math.BigDecimal;
import java.util.UUID;

public class Transfer {

    private UUID transferId;
    private UUID payee;
    private UUID payer;
    private BigDecimal value;

    public Transfer() {

    }

    public Transfer(UUID transferId, UUID payee, UUID payer, BigDecimal value) {
        this.transferId = transferId;
        this.payee = payee;
        this.payer = payer;
        this.value = value;
    }

    public UUID getPayee() {
        return payee;
    }

    public UUID getPayer() {
        return payer;
    }

    public BigDecimal getValue() {
        return value;
    }

    public UUID gettransferId() {
        return transferId;
    }
}
