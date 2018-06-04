package ex09_1;

public class Next extends BancoChain {
 
    public Next() {
        super(IDBancos.Next);
    }
 
    @Override
    protected void efetuaPagamento() {
        System.out.println("Pagamento efetuado no Next");
    }
}