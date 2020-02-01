public class Oven implements Orderer {

    private KitchenDuties anOven;

    public Oven(KitchenDuties aDuties) {
        this.anOven = aDuties;
    }

    @Override
    public void doOrder() {
        anOven.bakeFood();
    }
}
