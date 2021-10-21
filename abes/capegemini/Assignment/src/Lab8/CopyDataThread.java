package Lab8;
 
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyDataThread extends Thread {

	FileInputStream fis;
	FileOutputStream fos;

	public CopyDataThread(FileInputStream fis, FileOutputStream fos) {
	this.fis=fis;
	this.fos=fos;
	}
	
	@Override
	public void run() {
		int x = 0;
		int c=1;

		while (x!=-1) {
			try {
				x = fis.read();
				fos.write(x);
				c++;
			} catch (IOException e) {
				e.printStackTrace();
			}

			if (c % 10 == 0) {
				try {
					System.out.println("10 characters are copied");
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		try {
			fis.close();
			fos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
