package patternchain;

public class Santander extends BancoChain {
 
    public Santander() {
        super(IDBancos.Santander);
    }
 
    @Override
    protected void efetuaPagamento() {
        System.out.println("Pagamento efetuado no Santander");
    }
}