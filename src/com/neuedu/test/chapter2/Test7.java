package com.neuedu.test.chapter2;

public class Test7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=5;
		int b=2;
		
		double c=(double)5/2;
		
		
		//a+b�ĺ��ǣ�=>�ַ���ƴ��
		System.out.println("a+b�ĺ���"+(a+b));
		System.out.println("a-b�Ĳ���"+(a-b));
		System.out.println(a*b);
		System.out.println(a%b);
		System.out.println(c);
		
		//��ӡ�����ǰ೤
		String str="ëë";
		System.out.println(str+"�ǰ೤");

		int money=50000;
		//���У�Ǯ
		System.out.println("����"+money+"Ǯ");
		
		//�����еĸ���
		System.out.println(5/2);
		System.out.println(5/-2);
		System.out.println(-5/2);
		System.out.println(-5/-2);
		
		
		System.out.println("=======================");
		
		//������(��������������������)
		System.out.println(5%2);
		System.out.println(5%-2);
		System.out.println(-5%2);
		System.out.println(-5%-2);
		
		
		//�������Լ�
		int x=1;
		/*
		 * //���ú��
		x++;
		//�ȼӺ���
		++x;
		*/
		int y=x++;
		System.out.println(x);
		System.out.println(y);
		
		//i=i++     û�б仯������
		int h=1;
		h=h++;
		System.out.println(h);
		
		
		
		
		
	}

}