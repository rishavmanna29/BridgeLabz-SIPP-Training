public class CircularBuffer {
    private int[] buffer;
    private int head = 0, size = 0;

    public CircularBuffer(int capacity) {
        buffer = new int[capacity];
    }

    public void insert(int value) {
        buffer[(head + size) % buffer.length] = value;
        if (size < buffer.length)
            size++;
        else
            head = (head + 1) % buffer.length;
    }

    public void printBuffer() {
        for (int i = 0; i < size; i++)
            System.out.print(buffer[(head + i) % buffer.length] + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        CircularBuffer cb = new CircularBuffer(3);
        cb.insert(1);
        cb.insert(2);
        cb.insert(3);
        cb.insert(4);
        cb.printBuffer(); // [2, 3, 4]
    }
}
