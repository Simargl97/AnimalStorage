package util;


public class Count implements AutoCloseable {
    private int counter;
    private boolean closed;

    public Counter() {
        counter = 0;
        closed = false;
    }

    public int getCounter() {
        return counter;
    }


    @Override
    public void close() {
        closed = true;
        counter = 0;
    }

    public void add() {
        if (closed) {
            throw new RuntimeException("Added....");
        }
        counter++;
    }
}
