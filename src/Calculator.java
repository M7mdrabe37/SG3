public class Calculator {

    public int countDigits(int num) {
        if (num == 0)
            return 1;

        int count = 0;

        while (num != 0) {
            num = num / 10;
            count++;
        }
        return count;
    }

    public boolean evenOdd(int num) {
        int even = 0;
        int odd = 0;

        while (num != 0) {

            int a = num % 10;
            num = num / 10;
            if (a % 2 == 0) {
                even = even + a;
            } else {
                odd = odd + a;
            }
        }
        if (even > odd) {
            return true;
        } else {
            return false;
        }
    }

    public int getLastDigit(int num) {
        return num % 10;
    }

    public int getDigit(int num, int k) {
        int count = 0;

        while (num != 0) {
            if (count == k) {
                num = num % 10;
                return num;
            } else {
                num = num / 10;
                ++count;
            }
        }//while
        return num;
    }

    public int setDigit(int num, int k, int d) {
        int result = 0, multiply = 1, count = 0, numCount = countDigits(num), dCopunt = countDigits(d);

        if (numCount <= k || k < 0 || dCopunt > 1) {
            return num;
        }

        if (num == 0 && k == 0) {
            return d;
        }

        while (num != 0) {
            int reminder = num % 10;
            if (count == k)
                result = result + d * multiply;
            else
                result = result + reminder * multiply;
            multiply *= 10;
            num = num / 10;
            ++count;
        }//while
//        if (num==0){
        return result;
//        }
//        if (num == k)
//            result = result + d * multiply;
//        else
//            result = result + num * multiply;
//            return result;
    }

    public int getDigit2(int num) {
        int k = countDigits(num) - 1;
        return getDigit(num, k);
    }

    public int countMinDigit(int num) {
        int number = num, i = 0, min = num % 10, r;
        int c = countDigits(num), count = 0;

        while (i < c) {
            r = num % 10;
            if (min > r)
                min = r;

            num = num / 10;
            i++;
        }
        for (int j = 0; j < c; j++) {
            int r1 = number % 10;
            if (r1 == min) {
                count++;
            }
            number = number / 10;
        }
        return count;
    }

    public boolean isSymmetric(int num) {
        int reverse = +num;
        int sum = 0;

        while (num != 0){
            int reminder = num %10;
            num = num /10;
            sum = sum * 10 + reminder;
        }
        if (sum==reverse){
            return true;
        }else {
            return false;
        }
    }
    public int search(int num, int d) {
        int count = 0;

        while (num != 0) {
            int reminder = num % 10;
            num = num / 10;
            if (reminder == d) {
                count++;
            }
        }
        return count;
    }
}