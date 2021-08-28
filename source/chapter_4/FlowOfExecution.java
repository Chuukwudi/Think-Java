package chapter_4;

public class FlowOfExecution {
	public static void main(String[] args) {
		zippo("rattle", 13);
		}
	
	public static void baffle(String blimp) {
		System.out.println(blimp);
		zippo("ping", -5);
		}
	
	public static void zippo(String quince, int flag) {
		if (flag < 0) {
		System.out.println(quince + " zoop");
		} else {
		System.out.println("ik");
		baffle(quince);
		System.out.println("boo-wa-ha-ha");
		}
	}

}


// --1-- main executes first
// --2-- zippo comes next
// --3-- baffle follows
// --4-- zippo 

