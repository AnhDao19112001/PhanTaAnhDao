package ss3;
import java.util.Scanner;
public class PhanTuNhoNhat {
        public static void main(String[] args) {
            //khai báo một mảng numberArr sau đó khởi tạo các giá trị cho các phần tử.
            double[] numberArr = { 12.3, -4, 10, 4.24, 2, 71, -2, -6 };
            //gán giá trị của phần tử đầu tiên cho max, sau đó dùng max so sánh với các phần tử còn lại trong mảng.
            double max = numberArr[0];
            //in các phần tử trong mảng ra màn hình
            System.out.println("\n\nCác phần tử trong mảng là: ");
            for(double i : numberArr){
                System.out.print(i + ", ");
            }
            //dùng vòng lặp for duyệt các phần tử trong mảng. so sánh max với từng phần tử nếu số nào lớn hơn max thì gán nó cho max.
            // cứ lặp như vậy cho đến hết các phần tử thì max sẽ là giá trị lớn nhất trong mảng
            for (double num: numberArr) {
                if(max < num)
                    max = num;
            }
            System.out.printf("\nSố lớn nhất trong mảng là: %.2f", max);
        }
    }

