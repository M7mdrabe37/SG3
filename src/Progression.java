public class Progression {
    private int first;
    private int diff;

    public Progression(int first, int diff) {
        this.first = first;
        this.diff = diff;
    }

    public Progression() {
        first = -3;
        diff = 2;
    }

    public int getElement(int k) {
        int num = first;

        for (int count = 0;count < k; count++){
            num = num + diff;
        }
        return num;
    }

    public void showProg(int n) {
        int num = first;
        System.out.print(num + ",");
        for (int count = 0; n > count; count++) {
            num = num + diff;
            System.out.print(num + ",");
        }
    }

    public void showProg() {
        showProg(10);
    }

    public void showProgUpTo(int n) {
        for (int num = first; num < n; num = num + diff) {
            System.out.print(num + ",");
        }
    }

    public int sum(int n) {
        int num = first;
        int sum = 0;

        for (int count = 0;count <= n; num = num + diff){
            sum = sum + num;
            count++;
        }
        return sum;
    }
}