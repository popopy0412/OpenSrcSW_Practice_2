package ku.opensrcsw;

import java.lang.Math;
import java.util.Scanner;

public class GetPI {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = 1; // 시그마 안의 n값
		double val = 1, PI = 0; // val은 n에 크기에 따라 정해지는 식의 값, PI는 시그마 연산의 결과값
		
		while(val >= 0.0000000001 || val <= -0.000000001) { // 오차 범위는 +-0.00000001이다
			PI += val;
			n++;
			val = Math.pow(-1, n+1) / (2.0*n - 1); // 라이프니츠 급수 적용 식
		}
		PI *= 4.0; // 결과가 ㅠ/4이므로 4를 곱해준다.
		System.out.println("원주율 : " + PI);
	}
}
