public class Main {
	public static void main(String[] args) {
		Motherboard mb1 = new Motherboard("??????????? ?????-1", 1200, 8);
		Videocard vc1 = new Videocard("??????????-1", 3200, 64);
		Ram ram1 = new Ram("??????????? ??????-1", 1600, 8);
		Processor proc1 = new Processor("?????????-1", 2400, 2);
		Computer [] comps = new Computer[2];
		comps[0] = new Computer("?????????-1", proc1, ram1, vc1, mb1);
		comps[0].turnon();
		comps[0].check();
		comps[1] = new Computer();
		comps[1].turnon();
		comps[1].check();
		comps[1].setProcessor(proc1);
		ram1.setRate(2200);
		comps[1].setRam(ram1);
		comps[0].check();
		comps[1].check();
	}
}