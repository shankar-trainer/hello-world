package database;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import database.util.DatabaseUtil;

public class ImagePrg {
	public static void main(String[] args) throws SQLException, FileNotFoundException {
		Connection connection = DatabaseUtil.retrieveConnection();

		PreparedStatement preparedStatement = connection.prepareStatement
				("insert into myimage values(?,?)");
		preparedStatement.setInt(1, 1004);
		File file = new File("C:\\workspace1\\corejava\\rose.jpg");

		FileInputStream fin = new FileInputStream(file);

		preparedStatement.setBinaryStream(2, fin,(int) file.length());

		if (preparedStatement.executeUpdate() == 1)
			System.out.println("Image Inserted");

	}
}
