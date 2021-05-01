import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class qsort {

    static int n;
    final int maxn = 10000000;
    static int count;
    static void QuickSort(int[] num, int left, int right) {
        //如果left等于right，即数组只有一个元素，直接返回
        if(left>=right) {
            return;
        }
        //设置最左边的元素为基准值
        int key=num[left];
        //数组中比key小的放在左边，比key大的放在右边，key值下标为i
        int i=left;
        int j=right;
        while(i<j){
            //j向左移，直到遇到比key小的值
            while(num[j]>=key && i<j){
                j--;
            }
            //i向右移，直到遇到比key大的值
            while(num[i]<=key && i<j){
                i++;
            }
            //i和j指向的元素交换
            if(i<j){
                int temp=num[i];
                num[i]=num[j];
                num[j]=temp;
            }
        }
        num[left]=num[i];
        num[i]=key;
        count++;
        QuickSort(num,left,i-1);
        QuickSort(num,i+1,right);
    }


    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
        StreamTokenizer in =new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
        try {
            in.nextToken();
        } catch (IOException e) {
            e.printStackTrace();
        }
        n = (int)in.nval;

        int arr[] = new int [1000010];


//        for(int i = 1; i <= n; i++){
//            arr[i] = in.nextInt();
//        }
//        for(int i = 1; i <= n; i++){
//            System.out.println(arr[i]);
//        }
//
//        try {
//            in.nextToken();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        List<Integer> list = new ArrayList<Integer>();
        for(int i = 1; i <= n; i++){
            try {
                in.nextToken();
            } catch (IOException e) {
                e.printStackTrace();
            }
            int x = 0;

                arr[i] = (int)in.nval;


        }
        QuickSort(arr, 1, n);
        for(int i = 1; i <= n; i++){
            out.printf("%d ",arr[i]);


        }
        out.flush();


    }
}
