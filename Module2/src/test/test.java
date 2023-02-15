import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

    public class test {

            static int data[]=new int [15];
            static int visit[]=new int [15];
            static int N;
            static int K;
            static int a[]=new int [15];

            public static void solve(int x) {
                if(x>K) {
                    int S=data[a[1]];
                    for(int i=2; i<=K; i++) {
                        S=S+data[a[i]];
                    }
                    if(S==0) {
                        for(int i=1;i<=K;i++) {
                            System.out.print(data[a[i]]+" ");
                        }
                        System.out.println();
                    }
                    return ;
                }

                for(int i=a[x-1]+1;i<=N;i++) {
                    if(visit[i]==0) {
                        a[x]=i;
                        visit[i]=1;
                        solve(x+1);
                        a[x]=0;
                        visit[i]=0;
                    }
                }
            }
            public static void main(String[] args) throws FileNotFoundException {
                Scanner sc =new Scanner(new FileInputStream("D:\\trung.txt"));
//Scanner sc =new Scanner(System.in);
// int n;
                N=sc.nextInt();
// K=3;
                for(int i=1;i<=N;i++) {
                    data[i]=sc.nextInt();


                }

                for( K=1;K<=N;K++) {
                    solve(1);
                }


            }

        }



