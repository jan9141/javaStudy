package org.java.Loop;

public class ForEx1 {
	public static void main(String[] args) {
		System.out.println("for문");

		for (int i = 0; i < 10; i++) {
//			System.out.print(i+" ");
//			1~10까지 콘솔에 출력
			//마지막 ,를 제거 해보세요, if문사용
//			System.out.print(i + 1);
			if(i==9) {
				System.out.print((i+1));
				break;// 하위 명령문을 실행 안하고
			}
			
			System.out.print((i+1)+",");
					
		}//break문
		
		
		for(int i=0;i<10;i++) {
			
//			String url="";
			System.out.println("url(img/bg"+i+".jpg) no-repeat 50%/cover");
		}
	}
}
