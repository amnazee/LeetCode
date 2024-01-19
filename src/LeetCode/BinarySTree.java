package LeetCode;

public class BinarySTree {
    int[] tree;
    int size;

    BinarySTree(int sizeOfArray) {
        tree = new int[sizeOfArray];
        size = 0;
    }

    void insertData(int data) {
        int i = 0;
        while (i < size) {
            if (data < tree[i]) {
                int temp = tree[i];
                tree[i] = data;
                data = temp;
                i = 2 * i + 1;
            } else {
                i = 2 * i + 2;
            }
        }
        tree[i] = data;
        size++;
    }
    void searchTree(int data) {
        int i = 0;
        while (i < size) {
            if (tree[i] == data) {
                System.out.println("Data found at index " + i);
                return;
            } else if (data < tree[i]) {
                i = 2 * i + 1;
            } else {
                i = 2 * i + 2;
            }
        }
        System.out.println("Data not found in the tree");
    }

    public static void main(String[] arg) {
        BinarySTree var1 = new BinarySTree(10);
        var1.insertData(10);
        var1.insertData(7);
        var1.insertData(14);
        var1.insertData(20);
        var1.insertData(1);
        var1.insertData(5);
    }
}

