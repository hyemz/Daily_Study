import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class BOJ_11279_최대힙 {
	
	public static void main(String[] args) throws NumberFormatException, IOException  {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < N; i++) {
			int tmp = Integer.parseInt(br.readLine());
			if(tmp == 0) {
				if(pq.isEmpty()) {
					sb.append(0).append('\n');
				}
				else 
					sb.append(pq.poll()).append('\n');
			}
			else pq.add(tmp);
		}
		System.out.println(sb.toString());
	}
}
