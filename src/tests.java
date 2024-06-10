import java.io.*;
import java.util.*;
class Jautajumi{
	String jautajumi;
	List<String> atbildes;
	char pareizAtb;
	
	public Jautajumi(String jautajumi, List<String> atbildes, char pareizAtb) {
		this.jautajumi = jautajumi;
		this.atbildes = atbildes;
		this.pareizAtb = pareizAtb;
	}
	public boolean AtbilParbaude(char atbilde) {
		return atbilde == pareizAtb;
	}
}
class Test{
	List<Jautajumi> jautajumi = new ArrayList<>();
	int punkti =0;
	int parezasatb = 0;
	int nepareizasAtb = 0;
}


public class tests {
	public static void main(String[] args) {

	}
}
