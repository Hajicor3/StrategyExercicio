package strategy;

public class BoletoPaymentStrategy implements PaymentStrategy{
    /*
    *código do boleto (atributo)
    *  construtor
    */
    @Override
    public void pay(Double amount) {
        System.out.println("####Pagando####");
        System.out.println("Forma de pagamento: boleto");
        System.out.println("Valor: R$ " + amount);
        gerarBoleto(amount);
        System.out.println("################");
    }

    public void gerarBoleto(Double amount){
        System.out.println("Boleto gerado no valo de R$ " + amount);
    }
}
