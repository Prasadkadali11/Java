package durga.prasad;

public class ContructorsPractice {
	public int i;
	public static void main(String[] args) {
		
		ContructorsPractice cp = new ContructorsPractice();
		System.out.println(cp.i);
	}
	public ContructorsPractice() {
		i = 20;
		System.out.println("contructor is called");
	}
	public ContructorsPractice(int a) {
		i = a;
	}

}
