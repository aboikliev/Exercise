public class CharTasks {
    private static void swap(char[] array, int startPos, int endPos) {
        char tmp = array[startPos];
        array[startPos] = array[endPos];
        array[endPos] = tmp;
    }

    private static void reverseArray(char[] array, int startPos, int length) {
        for (int i = 0; i < length / 2; i++) {
            swap(array, startPos+i, startPos+length - i - 1);
        }
    }

    public static void reverse(char[] array) {
        reverseArray(array, 0, array.length);

        int wordStart = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == ' ') {
                reverseArray(array, wordStart, i - wordStart);
                wordStart = i + 1;
            }
        }
        reverseArray(array, wordStart, array.length - wordStart);
    }
}
