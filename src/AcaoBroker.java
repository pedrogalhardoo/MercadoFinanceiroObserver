public class AcaoBroker {
    public void buyShares(String stockId, String investorId, double price) {
        System.out.println("Investidor " + investorId + " comprou ações do " + stockId + " a " + price);
    }

    public void sellShares(String stockId, String investorId, double price) {
        System.out.println("Investidor " + investorId + " vendeu ações do " + stockId + " a " + price);
    }
}
