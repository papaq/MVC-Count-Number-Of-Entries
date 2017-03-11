package ExploreArrays;

public final class ArrayCount {
    static int[] ArrayOfNumbers(String[] arrA) {

        if (arrA.length == 1 && arrA[0].isEmpty())
            return new int[0];

        int arrB[] = new int[arrA.length];

        for (int i = 0; i < arrA.length; i++) {
            arrB[i] = CountNumberOfEqualElements(arrA[i], arrA);
        }

        return arrB;
    }

    public static int[] ArrayOfNumbers(int[] arrA) {

        if (arrA.length == 0)
            return new int[0];

        int arrB[] = new int[arrA.length];

        for (int i = 0; i < arrA.length; i++) {
            arrB[i] = CountNumberOfEqualElements(arrA[i], arrA);
        }

        return arrB;
    }

    private static int CountNumberOfEqualElements(String str, String[] arr) {
        int sum = 0;
        for (String anArr : arr) {
            if (str.equals(anArr))
                sum++;
        }

        return sum;
    }

    private static int CountNumberOfEqualElements(int str, int[] arr) {
        int sum = 0;
        for (int anArr : arr) {
            if (str == anArr)
                sum++;
        }

        return sum;
    }
}
