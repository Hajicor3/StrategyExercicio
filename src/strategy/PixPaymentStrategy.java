package strategy;

public class PixPaymentStrategy implements PaymentStrategy {
    /*
    *informações da conta, como:
    * número da conta,
    * agência,
    * nome do titular,
    * nome da instituição,
    * valor do pix
    */
    @Override
    public void pay(Double amount) {
        if(validaion()) {
            System.out.println("####Pagando####");
            System.out.println("Forma de pagamento: pix");
            System.out.println("Valor: R$ " + amount);
            System.out.println("################");
        }
        else{
            System.out.println("Dados da conta inválidos!");
        }
    }

    public Boolean validaion(){
        /*
         * lógica de validar o pix, os dados da conta, o valor, etc...
         */
        return true;
    }
}
