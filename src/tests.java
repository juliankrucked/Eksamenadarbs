import java.io.*;
import java.util.*;
class Jautajumi{
	String jautajumi;
	List<String> atbildes;
	char pareizatb;
	
	public Jautajumi(String jautajumi, List<String> atbildes, char pareizatb) {
		this.jautajumi = jautajumi;
		this.atbildes = atbildes;
		this.pareizatb = pareizatb;
	}
	public boolean AtbilParbaude(char atbilde) {
		return atbilde == pareizatb;
	}
}



public class tests {
	public static void main(String[] args) {

	}
}
