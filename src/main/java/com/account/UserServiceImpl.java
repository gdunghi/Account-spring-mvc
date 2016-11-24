package com.account;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.account.dto.UserDto;

public class UserServiceImpl {

	public long save(UserDto user) {
		DBUtils db = new DBUtils();

		StringBuilder sb = new StringBuilder();
		sb.append(
				" INSERT INTO USER ( name,last_name ) VALUES ('" + user.getName() + "','" + user.getLastName() + "') ");
		try (Connection conn = db.getConnection()) {
			Statement stmt = conn.createStatement();
			stmt.execute(sb.toString());
			return 1l;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0l;
	}

	public List<UserDto> getAllBy() {
		DBUtils db = new DBUtils();
		List<UserDto> users = new ArrayList<UserDto>();
		StringBuilder sb = new StringBuilder();
		sb.append(" SELECT * FROM USER ");
		try (Connection conn = db.getConnection();
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(sb.toString());) {
			UserDto user;
			while (rs.next()) {
				user = new UserDto();
				// Retrieve by column name

				user.setId(rs.getLong("id"));
				user.setName(rs.getString("name"));
				user.setLastName(rs.getString("last_name"));
				users.add(user);
			}
			return users;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return users;
	}

}
