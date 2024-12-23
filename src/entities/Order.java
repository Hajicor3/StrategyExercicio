package entities;

import java.util.HashSet;
import java.util.Set;

public class Order {
   private Integer id;
   private Payment payment;
   private Set<OrderItem> orderItem = new HashSet<>();

    public Order(Integer id, Payment payment) {
        this.id = id;
        this.payment = payment;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public Set<OrderItem> getOrderItem() {
        return orderItem;
    }

    public void setOrderItem(OrderItem item){
        orderItem.add(item);
    }

    public Double totalOrder(){
        Double sum = 0d;
        for(OrderItem item: orderItem){
            sum += item.getTotal();
        }
        return sum;
    }
}
