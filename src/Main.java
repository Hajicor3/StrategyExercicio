import entities.Order;
import entities.OrderItem;
import entities.Payment;
import entities.enums.PaymentStatus;
import strategy.BoletoPaymentStrategy;
import strategy.CreditCardPaymentStrategy;
import strategy.PaymentStrategy;
import strategy.PixPaymentStrategy;

import java.time.Instant;

public class Main {
    public static void main(String[] args) {

        PaymentStrategy pix = new PixPaymentStrategy();
        PaymentStrategy creditCard = new CreditCardPaymentStrategy();
        PaymentStrategy boleto = new BoletoPaymentStrategy();
        
        Payment payment1 = new Payment(Instant.now());
        Payment payment2 = new Payment(Instant.now());
        Payment payment3 = new Payment(Instant.now());

        Order order1 = new Order(1,payment1);
        Order order2 = new Order(2,payment2);
        Order order3 = new Order(3,payment3);

        order1.setOrderItem(new OrderItem("Monitor",900.00,1));
        order1.setOrderItem(new OrderItem("Fitas de led",25.00,3));
        order1.setOrderItem(new OrderItem("Cadeira",100.00,1));

        order2.setOrderItem(new OrderItem("geladeira",2000.00,1));

        order3.setOrderItem(new OrderItem("Televisão",1500.00,1));
        order3.setOrderItem(new OrderItem("Filtro de linha",50.00,1));
        order3.setOrderItem(new OrderItem("rack",400.00,1));

        Payment order1Payment = order1.getPayment();
        order1Payment.payment(creditCard, order1.totalOrder());

        Payment order2Payment = order2.getPayment();
        order2Payment.payment(pix, order2.totalOrder());

        Payment order3Payment = order3.getPayment();
        order3Payment.payment(boleto, order3.totalOrder());


    }
}