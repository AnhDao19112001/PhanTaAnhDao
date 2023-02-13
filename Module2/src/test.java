import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

    public class test {
        static int Save[][];
        static int map[];
        static int soPhanTu;

        static int max(int a, int b) {
            if (a > b) {
                return a;
            } else {
                return b;
            }
        }

        static int min(int a, int b) {
            if (a < b) {
                return a;
            } else {
                return b;
            }
        }

        static int stupid(int L, int R) {
            int stupid1, stupid2, stupid3, stupid4;
            if (L > R) return 0;
            if (Save[L][R] != 0) return Save[L][R];
            stupid1 = map[L] + stupid(L+2, R);
            stupid2 = map[L] + stupid(L+1, R-1);
            stupid3 = map[R] + stupid(L+1, R-1);
            stupid4 = map[R] + stupid(L, R-2);
            int ketQua = max(max(stupid1, stupid2), max(stupid3, stupid4));
            Save[L][R] = ketQua;
            return ketQua;
        }

        static int smart(int L, int R) {
            int smart1, smart2, smart3, smart4;
            if (L > R) return 0;
            if (Save[L][R] != 0) return Save[L][R];
            smart1 = map[L] + smart(L+2, R);
            smart2 = map[L] + smart(L+1, R-1);
            smart3 = map[R] + smart(L+1, R-1);
            smart4 = map[R] + smart(L, R-2);
            int ketQua = max(min(smart1, smart2), min(smart3, smart4));
            Save[L][R] = ketQua;
            return ketQua;
        }

        static void fomart() {
            for (int i = 0; i < soPhanTu; i++) {
                for (int j = 0; j < soPhanTu; j++) {
                    Save[i][j] = 0;
                }
            }
        }

        public static void main(String[] args) {

//System.setIn(new FileInputStream("C:\\Users\\Administrator\\eclipse-workspace\\Practice\\src\\string\\input.txt"));

            Scanner scanner = new Scanner(System.in);
            int testcase = scanner.nextInt();
            for (int tc = 1; tc <= testcase; tc++) {
                soPhanTu = scanner.nextInt();
                map = new int[soPhanTu];
                Save = new int[soPhanTu][soPhanTu];
                for (int i = 0; i < soPhanTu; i++) {
                    map[i] = scanner.nextInt();
                }
                fomart();
                System.out.println("Case #" + tc);
                System.out.print(stupid(0, soPhanTu-1));
                fomart();
                System.out.println(" " + smart(0, soPhanTu-1));
            }
        }
    }



