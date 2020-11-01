package arraylist;

public class ArrayList {
    private int[] array;
    private int count;

    public ArrayList(int length) {
        this.array = new int[length];
    }

    public void add(int item) {
        if (isArrayFull()) {
            int[] newArray = new int[count * 2];
            //Not doing system.copy to do for-loop implementation
            for (int i = 0; i < count; i++) {
                newArray[i] = this.array[i];
            }
            this.array = newArray;
        }
        this.array[count] = item;
        this.count++;
    }

    public void add(int item, int position) {
        if (position >= count) {
            System.out.println("IndexOutOfBound");
            System.out.println("***********");
            return;
        }
        this.array[position] = item;
    }

    public void remove(int position) {
        if (position >= count) {
            System.out.println("IndexOutOfBound");
            System.out.println("***********");
            return;
        }
        //Not doing system.copy to do for-loop implementation
        for (int i = position; i < count; i++) {
            array[i] = array[i + 1];
        }
        count--;
    }

    public void print() {
        for (int i = 0; i < count; i++) {
            System.out.println(this.array[i]);
        }
        System.out.println("***********");
    }

    private boolean isArrayFull() {
        return count == array.length;
    }
}
