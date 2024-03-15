public class Investidor implements Observer {
    private String id;
    private double minPrice;
    private double maxPrice;
    private AcaoBroker broker;
    private String stockId; // Novo campo para identificar a ação

    public Investidor(String id, double minPrice, double maxPrice, AcaoBroker broker, String stockId) {
        this.id = id;
        this.minPrice = minPrice;
        this.maxPrice = maxPrice;
        this.broker = broker;
        this.stockId = stockId;
    }

    @Override
    public void update(double price) {
        if (price <= minPrice) {
            broker.buyShares(stockId, id, price);
        } else if (price >= maxPrice) {
            broker.sellShares(stockId, id, price);
        }
    }
}
