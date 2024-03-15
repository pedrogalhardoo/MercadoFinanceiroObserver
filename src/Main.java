public class Main {
    public static void main(String[] args) {
        AcaoBroker broker = new AcaoBroker();
        Acao acao = new Acao("PETR4", 100.0);

        Investidor investidor1 = new Investidor("Inv1", 90.0, 110.0, broker, acao.getId());
        Investidor investidor2 = new Investidor("Inv2", 95.0, 105.0, broker, acao.getId());

        acao.registerObserver(investidor1);
        acao.registerObserver(investidor2);

        acao.setPrice(120.0); 
        acao.setPrice(85.0);  
    }
}
