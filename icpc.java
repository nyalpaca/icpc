package pj;
import java.util.Scanner;

public class icpc {
	public static void main(String[] args) {
		// データセット（D）の上限は２０
		for (int D = 0; D <= 20; D++) {
			
			
		
			Scanner sc = new Scanner(System.in);
			System.out.println("審査員の数を入力");
			int n = sc.nextInt(); //審査員の人数
			
			//審査員数として０が入力された場合、処理を終了する
			if (n == 0) {
				break;
			}
			
			int[] point = new int[n]; // 点数を人数分格納する配列を定義
		
			// 審査員の数だけ点数が入力できるようにする
			for (int i = 0; i < point.length; i++) {
				System.out.println("点数を入力");
			
				point[i] = sc.nextInt();
			}
		
			// 最大値、最小値を求める
			int max = point[0];
			int min = point[0];
			for (int j = 0; j < point.length; j++) {
				if (max < point[j]) {
					max = point[j];
				}
				if (min > point[j]) {
					min = point[j];
				}
			}
		
			// 最小値最大値あわせて合計する
			int sum = 0;	
			for (int k = 0; k < point.length; k++) {	
				sum += point[k];
			}
			
			// 実際の点数
			sum = sum - (max + min);
			int getpoint = sum / (n - 2);
			
			System.out.println(getpoint);
		
		}
	}

}
