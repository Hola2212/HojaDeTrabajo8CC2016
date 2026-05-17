import java.util.ArrayList;

public class VectorPriorityQueue<T extends Comparable<T>> implements IPriorityQueue<T> {

    private ArrayList<T> data;

    public VectorPriorityQueue() {
        data = new ArrayList<>();
    }

    @Override
    public void add(T value) {
        data.add(value);
        percolateUp(data.size() - 1);
    }

    @Override
    public T remove() {
        if (isEmpty()) {
            return null;
        }
        T min = data.get(0);
        T last = data.remove(data.size() - 1);
        if (!data.isEmpty()) {

            data.set(0, last);

            pushDownRoot(0);
        }

        return min;
    }

    @Override
    public boolean isEmpty() {
        return data.isEmpty();
    }

    @Override
    public int size() {
        return data.size();
    }

    private void percolateUp(int index) {
        while (index > 0) {
            int parent = (index - 1) / 2;
            if (data.get(index).compareTo(data.get(parent)) < 0) {
                swap(index, parent);
                index = parent;
            } else {
                break;
            }
        }
    }

    private void pushDownRoot(int index) {
        int heapSize = data.size();
        while (true) {
            int left = 2 * index + 1;
            int right = 2 * index + 2;
            int smallest = index;
            if (left < heapSize && data.get(left).compareTo(data.get(smallest)) < 0) {
                smallest = left;
            }
            if (right < heapSize &&
                    data.get(right)
                            .compareTo(data.get(smallest)) < 0) {
                smallest = right;
            }
            if (smallest != index) {
                swap(index, smallest);
                index = smallest;
            } else {
                break;
            }
        }
    }

    private void swap(int i, int j) {
        T temp = data.get(i);
        data.set(i, data.get(j));
        data.set(j, temp);
    }
}