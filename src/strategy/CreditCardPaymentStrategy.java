package strategy;

public class CreditCardPaymentStrategy implements PaymentStrategy{
    /*
    * Atribtos do cartão, como:
    * número do cartão,
    * cvc,
    * validade,
    * nome do titular.
    * Construtor
    */
    @Override
    public void pay(Double amount) {
        if(validaion()) {
            System.out.println("####Pagando####");
            System.out.println("Forma de pagamento: Cartão de crédito");
            System.out.println("Valor: R$ " + amount);
            System.out.println("################");

        }
        else{
            System.out.println("Dados do cartão inválidos!");
        }
    }

    public Boolean validaion(){
        /*
        * lógica de validar os dados do cartão, se tem limite, etc...
        */
        return true;
    }
}
