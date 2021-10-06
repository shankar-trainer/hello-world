package database;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import database.util.DatabaseUtil;

public class ImagePrg2 {
	public static void main(String[] args) throws SQLException, IOException {
		Connection connection = DatabaseUtil.retrieveConnection();

		PreparedStatement preparedStatement = connection.prepareStatement("select * from myimage where id=1004");
		ResultSet rs = preparedStatement.executeQuery();
		rs.next();
		int x = rs.getBinaryStream(2).read();
		FileOutputStream stream = new FileOutputStream("ss.jpg");

		while (x != -1) {
			stream.write(x);

			x = rs.getBinaryStream(2).read();
		}
		stream.close();

	}
}
