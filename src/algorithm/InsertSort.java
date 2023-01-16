package algorithm;

/**
 * 插入排序
 */
public class InsertSort {

    public static void main(String[] args) {
        byte[] srcArr = {31,41,59,26,41,58};

        byte tmp;

        for (int i = 1; i < srcArr.length; i++) {
            for (int j = 0; j < srcArr.length; j++) {
                if (srcArr[i] > srcArr[j]) {
                    tmp = srcArr[i];
                    srcArr[i] = srcArr[j];
                    srcArr[j] = tmp;
                }
            }
        }

        for (int i = 0; i < srcArr.length; i++) {
            System.out.print(srcArr[i] + " ");
        }
    }
}
