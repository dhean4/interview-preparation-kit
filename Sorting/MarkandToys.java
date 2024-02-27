import io.github.pixee.security.BoundedLineReader;
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) throws IOException {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(BoundedLineReader.readLine(br, 5_000_000));
        int n=Integer.parseInt(st.nextToken());
        int k=Integer.parseInt(st.nextToken());
        int[] ar=new int[n];
        st=new StringTokenizer(BoundedLineReader.readLine(br, 5_000_000));
        for(int i=0;i<n;i++){
            ar[i]=Integer.parseInt(st.nextToken());
        }
        Arrays.sort(ar);
        int sum=0,count=0;
        while(sum<=k){
            sum=sum+ar[count];
            count++;
        }
        System.out.println(count-1);
    }
}
