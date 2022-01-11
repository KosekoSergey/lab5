import java.util.*; 

public class Processor {
	
	String name;  //�������� ����������
	int rate; //�������
	int bitness;  //����������� ����������
	
	public Processor() {}

	public Processor(String myName, int myRate, int myBitness) {  //�����������
		name = myName;
		rate = myRate;
		bitness = myBitness;
	}

	public String getName() {  //����� ��������� �������� ����������
		return name;
	} 

	public int getRate() {  //�������
		return rate;
	}

	public int getBitness() {  //�����������
		return bitness;
	}

	public void setName(String name) {  //����� ���������� �������� ����������
		this.name = name;
	}

	public void setRate(int rate) {  //�������
		this.rate = rate;
	}

	public void setMemory(int bitness) {  //�����������
		this.bitness = bitness;
	}

	public int check() {  //�������� ����������
		if (name == null) return 0;
		else return 1;
	}

	public void print() {
		System.out.println("�������� ����������: " + name);
		System.out.println("������� ����������: " + rate);
		System.out.println("����������� ����������: " + bitness);
	}

	public void unput() {  //���� � ����������
		Scanner inp = new Scanner(System.in);
		name = inp.nextLine();
		rate = inp.nextInt();
		bitness = inp.nextInt();
		inp.close();
	}
}