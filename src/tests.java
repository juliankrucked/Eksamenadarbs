import java.io.*;
import javax.swing.*;
import java.util.*;

class Jautajumi{
	String jaut;
	List<String> atbildes;
	char pareizAtb;
	
	public Jautajumi(String jautajumi, List<String> atbildes, char pareizAtb) {
		this.jaut = jautajumi;
		this.atbildes = atbildes;
		this.pareizAtb = pareizAtb;
	}
	public boolean AtbilParbaude(char atbilde) {
		return atbilde == pareizAtb;
		}
	}
class Test{
	List<Jautajumi> jaut = new ArrayList<>();
	int punkti =0;
	int pareizasatb = 0;
	int nepareizasAtb = 0;
	
	public void JautajumuIelade(String failanosaukums)throws IOException{
		try(BufferedReader lasit = new BufferedReader(new FileReader(failanosaukums))){
			String line;
            while ((line = lasit.readLine()) != null) {
            	if(line.trim().isEmpty()) continue;
            	String jautajums = line;
            	List<String> atbildes = new ArrayList<>();
            	for(int i = 0;i<4;i++) {
            		line = lasit.readLine();
            		if(line == null) {
            			throw new IOException("nepabeigts jautajums  failā");
            		}
            		atbildes.add(line);
            		}
            	line = lasit.readLine();
            	if (line == null) {
                    throw new IOException("Missing correct answer for question: " + jaut);
                }
            	char parezasatb = line.charAt(0);
            	jaut.add(new Jautajumi(jautajums, atbildes, parezasatb));
            	}
            }
		}
	

	public void TestaSakums() {
		for(Jautajumi q : jaut) {
			StringBuilder message = new StringBuilder(q.jaut + "\n");
			for(String atbilde : q.atbildes) {
				message.append(atbilde).append("\n");
			}
			String SpelAtb = JOptionPane.showInputDialog(null, message.toString(),"tests",JOptionPane.QUESTION_MESSAGE);
			if (SpelAtb == null || SpelAtb.isEmpty()) {
				JOptionPane.showMessageDialog(null, "nav dota atbilde dodamies uznākamo jautājumu");
				continue;
				}
			char atbilde = SpelAtb.charAt(0);
            if (q.AtbilParbaude(atbilde)) {
                JOptionPane.showMessageDialog(null, "pareizi! \n+2 punkti");
                punkti += 2;
                pareizasatb++;
            } else {
                JOptionPane.showMessageDialog(null, "nepareizi.\n -1 punkts");
                punkti--;
                nepareizasAtb++;
                }
            }
		}
	public void SaglabatRezultatu(String failanosaukums) throws IOException{
		try(BufferedWriter raksta = new BufferedWriter(new FileWriter(failanosaukums))){
			raksta.write("Punktu skaits: "+punkti+"\n");
			raksta.write("Pareizi atbildēti jautājumi: "+pareizasatb+"\n");
			raksta.write("Nepareizi atbildēti jautājumi: "+nepareizasAtb+"\n");
			}
		}
	}

public class tests {
	public static void main(String[] args) {
		Test test = new Test();
		try {
			test.JautajumuIelade("JautajumiUnAtbildes.txt");
			test.TestaSakums();
			test.SaglabatRezultatu("rezultats.txt");
		}catch(IOException e) {
			JOptionPane.showMessageDialog(null,"An error occurred: " +e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE );
			}
		}
	}


