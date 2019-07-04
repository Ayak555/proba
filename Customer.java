public class Customer extends Thread{

    private Stockroom goodsCounter;

    public Customer(Stockroom goodsCounter) {
        this.goodsCounter = goodsCounter;
    }

    public Customer() {

    }


    public Stockroom getGoodsCounter() {
        return goodsCounter;
    }



    public void decreaseStockroom {
        Stockroom.getGoodsCounter()--;
    }

    public void run() {
        synchronized (getGoodsCounter()) {
            for (int i = 0; i < 5; i++) {
                getGoodsCounter().decreaseStockroom();
            }
        }
    }

}
