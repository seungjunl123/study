import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_2491_수열 {
	static int N;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		} // 이 곳에 입력받은 0~9사이의 숫자가 수열로 등록이 된다.
			// 예제 = 1,2,2,4,4,5,7,7,2
		
		int count = 1;
		int maxCount = 1;
		for(int i = 0; i < N-1; i++) {
			if(arr[i] <= arr[i+1]) { //다음번이 같다면 count ++ 
				count++;
			}
			else {
				count = 1; //아니면 1로 변경하여 수열 끝을 알림
			}
			maxCount = Math.max(maxCount, count);
		}
		int count2 = 1;
		
		for(int i = 0; i < N-1; i++) {
			if(arr[i]>=arr[i+1]) {
				count2++; //방법 동일
			}
			else {
				count2 = 1; 
			}
			maxCount = Math.max(maxCount, count2);
		}
		
		System.out.println(maxCount);
	}

}
