import java.io.*;
import javax.swing.*;
import java.util.*;


class Jautajumi{
	String jautajums;
	List<String> atbildes;
	char pareizAtb;
	
	public Jautajumi(String jautajums, List<String> atbildes, char pareizAtb) {
		this.jautajums = jautajums;
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
	public void JautajumuIelade(String failanosaukums)throws IOException{
		try(BufferedReader lasit = new BufferedReader(new FileReader(failanosaukums))){
			String rinda;
            while ((rinda = lasit.readLine()) != null) 
			if(rinda.trim().isEmpty()) continue;
			String jautajumi = rinda;
			List<String> atbildes = new ArrayList<>();
			for(int i = 0;1<4;i++) {
				rinda = lasit.readLine();
				if(rinda == null) {
					throw new IOException("nepabeigts jautajums  failā");
				}
				atbildes.add(rinda);
			}
			rinda = lasit.readLine();
			if(rinda == null) {
				throw new IOException("zudusi jautajuma pareizā atbilde: "+ jautajumi);
			}
			char parezasatb = rinda.charAt(0);
			jautajumi.add(new Jautajumi(jautajumi, atbildes, parezasatb));
		
		}
	}
}


public class tests {
	public static void main(String[] args) {

	}
}
