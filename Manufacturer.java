public class Manufacturer extends Thread {

    private Stockroom goodsCounter;

    public Manufacturer(Stockroom goodsCounter) {
        this.goodsCounter = goodsCounter;
    }

    public Manufacturer() {

    }

    public Stockroom getGoodsCounter() {
        return goodsCounter;
    }


    public void increaseStockroom() {
        Stockroom.getGoodsCounter()++;
    }

    public void run() {
        synchronized (getGoodsCounter()) {
            for (int i = 0; i < 5; i++) {
                getGoodsCounter().increaseStockroom();
            }
        }
    }


}
