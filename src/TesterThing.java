public class TesterThing {

    public static void main(String[] asdlaskdlaskd) {
        KitchenDuties aDuties = new KitchenDuties();

        Oven aOven = new Oven(aDuties);
        Toaster aToaster = new Toaster(aDuties);

        Worker aWorker = new Worker();
        aWorker.doWork(aOven);
        aWorker.doWork(aToaster);
    }
}
