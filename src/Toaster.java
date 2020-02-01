public class Toaster implements Orderer {

    private KitchenDuties aToaster;

    public Toaster(KitchenDuties aDuties) {
        this.aToaster = aDuties;
    }

    @Override
    public void doOrder() {
        aToaster.makeSnack();
    }
}
