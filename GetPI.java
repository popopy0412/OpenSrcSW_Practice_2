package ku.opensrcsw;

import java.lang.Math;
import java.util.Scanner;

public class GetPI {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = 1; // �ñ׸� ���� n��
		double val = 1, PI = 0; // val�� n�� ũ�⿡ ���� �������� ���� ��, PI�� �ñ׸� ������ �����
		
		while(val >= 0.0000000001 || val <= -0.000000001) { // ���� ������ +-0.00000001�̴�
			PI += val;
			n++;
			val = Math.pow(-1, n+1) / (2.0*n - 1); // ���������� �޼� ���� ��
		}
		PI *= 4.0; // ����� ��/4�̹Ƿ� 4�� �����ش�.
		System.out.println("������ : " + PI);
	}
}
