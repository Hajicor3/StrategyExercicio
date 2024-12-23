package entities;

import entities.enums.PaymentStatus;
import strategy.PaymentStrategy;

import java.time.Instant;

public class Payment {

    private Instant moment;
    private PaymentStatus status;

    public Payment(){}

    public Payment(Instant moment) {
        this.status = PaymentStatus.PENDING;
        this.moment = moment;
    }

    public Instant getMoment() {
        return moment;
    }

    public void setMoment(Instant moment) {
        this.moment = moment;
    }

    public PaymentStatus getStatus() {
        return status;
    }

    public void setStatus(PaymentStatus status) {
        this.status = status;
    }

    public void payment(PaymentStrategy payment, Double amount){
        payment.pay(amount);
        setStatus(PaymentStatus.PAID);
    }
}
