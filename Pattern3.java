public class Pattern3 {
    public static void main(String[] args) {
    int row=7;
    for (int i = 1; i < row; i++) {
        for (int j = 0; j < i; j++) {
            System.out.print(i+" ");
        }
        System.out.println();
    }
    for (int k = row-1; k >=1; k--) {
        for (int l = k; l >=1; l--) {
            System.out.print(k+" ");
        }
        System.out.println();
    }
    }
}
