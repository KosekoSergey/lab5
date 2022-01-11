public class Computer {

	String name = "��� ��������";  //�������� ����������
	Processor processor = new Processor();  //���������
	Ram ram = new Ram();  //����������� ������
	Videocard videocard = new Videocard();  //����������
	Motherboard motherboard = new Motherboard();  //����������� �����
	int state = 0;  //��������� ����������(0 - ��������)

	public Computer() {}

	public Computer(String name, Processor processor, Ram ram, Videocard videocard, Motherboard motherboard) {  //�����������
		this.name = name;
		this.processor = processor;
		this.ram = ram;
		this.videocard = videocard;
		this.motherboard = motherboard;
	}

	public void turnon() {  //�������� ���������
		if (state == 0) { 
			state = 1; 
			System.out.println("��������� �������: " + name);
		}
		else System.out.println("��������� ��� �������: " + name);
	}

	public void turnoff() {  //��������� ���������
		if (state == 1) { 
			state = 0; 
			System.out.println("��������� ��������: " + name); 
		}
	}

	public void check() {  //��������� � ������� ������������ ���������� �� �����
		if (state == 1) {
			System.out.println("���������: " + name);
			System.out.println("�������� ���������� � �� ��������������:");
			if (motherboard.check() == 1) motherboard.print();
			else System.out.println("����������� ����� �����������");
			if (processor.check() == 1) processor.print();
			else System.out.println("��������� �����������");
			if (ram.check() == 1) ram.print();
			else System.out.println("����������� ������ �����������");
			if (videocard.check() == 1) videocard.print();
			else System.out.println("���������� �����������");
			System.out.println();
		}
	}

	public void setName(String name) {  //����� ���������� �����
		this.name = name;
	}

	public void setMotherboard(Motherboard motherboard) {  //����� ���������� ����������� �����
		this.motherboard = motherboard;
	}

	public void setRam(Ram ram) {  //����� ���������� ����������� ������
		this.ram = ram;
	}

	public void setVideocard(Videocard videocard) {  //����� ���������� ����������
		this.videocard = videocard;
	}

	public void setProcessor(Processor processor) {  //����� ���������� ����������
		this.processor = processor;
	}
}