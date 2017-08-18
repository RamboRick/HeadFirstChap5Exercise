# DugeonGame-
chap14CodeMagnets
package chap14;
import java.io.*;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class DungeonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DugeonGame d = new DugeonGame();
		System.out.println(d.getX() + d.getY() + d.getZ());
		try {
			FileOutputStream fos = new FileOutputStream("dg.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(d);
			oos.close();
			FileInputStream fis = new FileInputStream("dg.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			d = (DugeonGame) ois.readObject();
			ois.close();
		} catch (Exception e){
			e.printStackTrace();
		}
		System.out.println(d.getX() + d.getY() + d.getZ());
	}

}

class DugeonGame implements Serializable {
	public int x = 3;
	transient long y = 4;
	private short z = 5;
	int getX(){
		return x;
	}
	long getY(){
		return y;
	}
	short getZ(){
		return z;
	}
}
