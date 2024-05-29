public class Store {

    int product;

    public synchronized void buyProduct() throws InterruptedException {
        if (product < 1) {
            wait();
        }
        product--;
        System.out.println("Купили 1 продукт, осталось " + product);
        notify();
    }
    public synchronized void produceProduct() throws InterruptedException {
        if (product >= 3) {
            wait();
        }
        product++;
        System.out.println("Произвели 1 продукт, осталось " + product);
        notify();
    }
}
