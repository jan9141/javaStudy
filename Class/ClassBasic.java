package org.java.Class;

// 사용자 정의 타입
public class ClassBasic {
	
	
	//필드(속성)
	public String userId; //인스턴스 멤버
	public String userPw; //인스턴스 멤버
	public int userAge; //인스턴스 멤버
	// 캡슐화
	private String projectName; //인스턴스 멤버
	// 클래스멤버(static)
	public static int projectYear=2022;
	
	public ClassBasic() {
		//객체 생성시 필요한 특수한 메서드
		System.out.println("생성자(construct)");
	}
	//메서드
	//인스턴스 메서드
	public void instanceMethod() {
		System.out.println("인스턴스메서드");
	}
	@Override
	public String toString() {
		return "ClassBasic [userId=" + userId + ", userPw=" + userPw + ", userAge=" + userAge + ", projectName="
				+ projectName + "]";
	}
	//클래스 메서드
	public static void ClassMethod() {
		System.out.println("클래스 메서드");
	}
	//private 멤버(필드)를 초기화 set
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	//private 멤버(필드)를 get
	public String getProjectName() {
		return this.projectName;// 호출함 그 곳에 반환한다.
	}
}
