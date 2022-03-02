public class NumberGenerator implements Runnable {
    private Thread number;

    public NumberGenerator() {
        number = new Thread(this, "NumberGenerator");
        System.out.println("my thread is " + number);
    }

    public Thread getNumber() {
        return number;
    }

    public void setNumber(Thread number) {
        this.number = number;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println(i);
                Thread.sleep(500);
                System.out.println("Hashcode is: " + hashCode());

            }
        }
        catch (InterruptedException e) {
            System.out.println("DEAD!");
        }
        System.out.println("DONE!");
    }
}
