package corejava;

import java.util.Random;

class MedicineMain {

	public static void main(String[] args) {
		Medicine medicine[] = new Medicine[10];

		Random random = new Random();
		int max = 3, min = 1;
		for (int i = 0; i < medicine.length; i++) {

			switch (random.nextInt(max - min + 1) + min) {
			case 1:
				medicine[i] = new Tablet("a pharma", "surat");
				break;
			case 2:
				medicine[i] = new Syrup("amilin", "chennai");
				break;
			case 3:
				medicine[i] = new Ointment("c pharma", "barodara");
				break;
			default:
				break;
			}
		}

		for (Medicine medicine2 : medicine) {
			medicine2.displyLabel();
		}

	}

}