import java.util.*; 

public class Motherboard {
	
	String name;  //�������� ����������� �����
	int rate; //�������
	int numOfSlots;  //���-�� ��������
	
	public Motherboard() {}

	public Motherboard(String myName, int myRate, int myNumOfSlots) {  //�����������
		name = myName;
		rate = myRate;
		numOfSlots = myNumOfSlots;
	}

	public String getName() {  //����� ��������� �������� ����������� �����
		return name;
	} 

	public int getRate() {  //�������
		return rate;
	}

	public int getNumOfSlots() {  //���-�� ��������
		return numOfSlots;
	}

	public void setName(String name) {  //����� ���������� �������� ����������� �����
		this.name = name;
	}

	public void setRate(int rate) {  //�������
		this.rate = rate;
	}

	public void setNumOfSlots(int numOfSlots) {    //���-�� ��������
		this.numOfSlots = numOfSlots;
	}

	public int check() {  //�������� ����������� �����
		if (name == null) return 0;
		else return 1;
	}

	public void print() {
		System.out.println("�������� ����������� �����: " + name);
		System.out.println("������� ����������� �����: " + rate);
		System.out.println("���������� �������� ��������: " + numOfSlots);
	}

	public void unput() {  //���� � ����������
		Scanner inp = new Scanner(System.in);
		name = inp.nextLine();
		rate = inp.nextInt();
		numOfSlots = inp.nextInt();
		inp.close();
	}
}