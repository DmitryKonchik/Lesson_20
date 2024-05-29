public class Producer implements Runnable{

    Store store;

    public Producer(Store store) {
        this.store = store;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            try {
                store.produceProduct();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
