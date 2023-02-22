import java.util.*;

class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        MySet mySet = new MySet();

        for (int i = 1; i <= 9; i++) {
            mySet.add(i);
        }

        if (num == 1) {
            System.out.println("" + mySet.list.size());
        } else {
            num--;
            while (num != 0) {
                int listSize = mySet.list.size();
                for (int i = 0; i < listSize; i++) {
                    for (int j = 1; j <= 9; j++) {
                        mySet.add(mySet.list.get(i) * j);
                    }
                }
                num--;
            }
            System.out.println("" + mySet.list.size());
        }
    }
}

class MySet {
    ArrayList<Integer> list;

    public MySet() {
        this.list = new ArrayList<Integer>();
    }

    public MySet(int[] arr) {
        this();
        for (int i = 0; i < arr.length; i++) {
            this.list.add(arr[i]);
        }
    }

    public void add(int x) {
        for (int item: this.list) {
            if (x == item) {
                return;
            }
        }
        this.list.add(x);
    }
}