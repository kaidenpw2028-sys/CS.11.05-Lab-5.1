public class ArrayUtility {

    public static void print(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(array[i]);
        }
        System.out.println();
    }

    public static int sum(int[] array) {
        int total = 0;
        for (int number : array) {
            total += number;
        }
        return total;
    }

    public static double average(int[] array) {
        if (array.length == 0) {
            return 0.0;
        }
        double total = sum(array);
        double avg = total / array.length;
        return (int)(avg * 100.0) / 100.0;
    }

    public static int minimum(int[] array) {
        if (array.length == 0) {
            throw new IllegalArgumentException("your array is empty");
        }
        int min = array[0];
        for (int number : array) {
            if (number < min) {
                min = number;
            }
        }
        return min;
    }

    public static int maximum(int[] array) {
        if (array.length == 0) {
            throw new IllegalArgumentException("your array is empty");
        }
        int max = array[0];
        for (int number : array) {
            if (number > max) {
                max = number;
            }
        }
        return max;
    }

    public static int evenCount(int[] array) {
        int count = 0;
        for (int number : array) {
            if (number % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public static int[] reverseOne(int[] array) {
        int[] reverseArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            reverseArray[i] = array[array.length - 1 - i];
        }
        return reverseArray;
    }

    public static void reverseTwo(int[] array) {
        int left = 0;
        int right = array.length - 1;
        while (left < right) {
            int temporary = array[left];
            array[left] = array[right];
            array[right] = temporary;
            left++;
            right--;
        }
    }

    public static boolean linearSearchInt(int[] array, int num) {
        for (int number : array) {
            if (number == num) {
                return true;
            }
        }
        return false;
    }

    public static boolean linearSearchString(String[] array, String str) {
        for (String a : array) {
            if (a.equals(str)) {
                return true;
            }
        }
        return false;

    }

    public static void multiplyByTwo(int[] array) {
        multiplyByN(array, 2);
    }

    public static void multiplyByN(int[] array, int n) {
        for (int i = 0; i < array.length; i++) {
            array[i] *= n;
        }
    }

    public static String toString(int[] array) {
        StringBuilder arraybutstring = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            if (i > 0) {
                arraybutstring.append(", ");
            }
            arraybutstring.append(array[i]);
        }
        return arraybutstring.toString();
    }

    public static boolean twoSum(int[] array, int num) {
        for (int i :array) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == num) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void shiftRight(int[] array) {
        if (array.length > 0) {
            int last = array[array.length - 1];
            for (int i = array.length - 1; i > 0; i--) {
                array[i] = array[i - 1];
            }
            array[0] = last;
        }
    }

    public static void shiftLeft(int[] array) {
        if (array.length > 0) {
            int first = array[0];
            for (int i = 0; i < array.length - 1; i++) {
                array[i] = array[i + 1];
            }
            array[array.length - 1] = first;
        }
    }

    public static void shiftRightNTimes(int[] array, int n) {
        for (int i = 0; i < n; i++) {
            shiftRight(array);
        }
    }

    public static void shiftLeftNTimes(int[] array, int n) {
        for (int i = 0; i < n; i++) {
            shiftLeft(array);
        }
    }


}
