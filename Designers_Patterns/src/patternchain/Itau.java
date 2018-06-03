package patternchain;

public class Itau extends BancoChain{

	  public Itau() {
	        super(IDBancos.Itau);
	    }
	 
	    @Override
	    protected void efetuaPagamento() {
	        System.out.println("Pagamento efetuado no no Itau");
	    }

}
