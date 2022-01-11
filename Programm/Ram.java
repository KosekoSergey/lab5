import java.util.*; 

public class Ram {
	
	String name;  //�������� ����������� ������
	int rate; //�������
	int memory;  //����� ������
	
	public Ram() {}

	public Ram(String myName, int myRate, int myMemory) {  //�����������
		name = myName;
		rate = myRate;
		memory = myMemory;
	}

	public String getName() {  //����� ��������� �������� ����������� ������
		return name;
	} 

	public int getRate() {  //�������
		return rate;
	}

	public int getMemory() {  //������ ������
		return memory;
	}

	public void setName(String name) {  //����� ���������� �������� ����������� ������
		this.name = name;
	}

	public void setRate(int rate) {  //�������
		this.rate = rate;
	}

	public void setMemory(int memory) {    //������ ������
		this.memory = memory;
	}

	public int check() {  //�������� ����������� ������
		if (name == null) return 0;
		else return 1;
	}

	public void print() {
		System.out.println("�������� ����������� ������: " + name);
		System.out.println("������� ����������� ������: " + rate);
		System.out.println("����� ����������� ������: " + memory);
	}

	public void unput() {  //���� � ����������
		Scanner inp = new Scanner(System.in);
		name = inp.nextLine();
		rate = inp.nextInt();
		memory = inp.nextInt();
		inp.close();
	}
}