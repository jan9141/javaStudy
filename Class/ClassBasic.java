package org.java.Class;

// ����� ���� Ÿ��
public class ClassBasic {
	
	
	//�ʵ�(�Ӽ�)
	public String userId; //�ν��Ͻ� ���
	public String userPw; //�ν��Ͻ� ���
	public int userAge; //�ν��Ͻ� ���
	// ĸ��ȭ
	private String projectName; //�ν��Ͻ� ���
	// Ŭ�������(static)
	public static int projectYear=2022;
	
	public ClassBasic() {
		//��ü ������ �ʿ��� Ư���� �޼���
		System.out.println("������(construct)");
	}
	//�޼���
	//�ν��Ͻ� �޼���
	public void instanceMethod() {
		System.out.println("�ν��Ͻ��޼���");
	}
	@Override
	public String toString() {
		return "ClassBasic [userId=" + userId + ", userPw=" + userPw + ", userAge=" + userAge + ", projectName="
				+ projectName + "]";
	}
	//Ŭ���� �޼���
	public static void ClassMethod() {
		System.out.println("Ŭ���� �޼���");
	}
	//private ���(�ʵ�)�� �ʱ�ȭ set
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	//private ���(�ʵ�)�� get
	public String getProjectName() {
		return this.projectName;// ȣ���� �� ���� ��ȯ�Ѵ�.
	}
}
