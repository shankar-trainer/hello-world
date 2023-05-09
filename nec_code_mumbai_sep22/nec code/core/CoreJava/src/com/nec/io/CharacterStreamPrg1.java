package com.nec.io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterStreamPrg1 {

	public static void main(String[] args) {

		try {
			FileWriter writer = new FileWriter("hello.c", true);

			// writer.write("void main()\n".toCharArray());
			String ar[] = { "#include<stdio.h>\n", "\tvoid main()\n", "\t{\n", "\tprintf(\"hello world\");\n", "\t}\n",
					"\n=============================\n" };

			for (String s : ar) {

				writer.write(s);
			}

			writer.close();

			FileReader reader = new FileReader("hello.c");

			int x;
			while ((x = reader.read()) != -1) {
				System.out.print((char) x);
			}
			reader.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
