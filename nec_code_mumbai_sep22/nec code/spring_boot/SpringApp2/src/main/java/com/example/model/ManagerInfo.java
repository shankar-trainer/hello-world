package com.example.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Component(value = "managerInfo")
@Data
public class ManagerInfo {

	private List<Manager> managerList;
	
	@Value("#{managerInfo.managerList[0]}")
	private Manager firstManager;

	@Value("#{managerInfo.managerList[2]}")
	public Manager lastManager;

	public ManagerInfo() {
		managerList = new ArrayList<>();
		Manager manager[] = new Manager[3];

		manager[0] = new Manager(1001, "akash verma", LocalDate.of(1977, 11, 10), 89000);
		manager[1] = new Manager(1002, "vimal verma", LocalDate.of(1987, 10, 15), 69000);
		manager[2] = new Manager(1003, "shyam verma", LocalDate.of(1978, 1, 22), 58000);

		for (Manager m : manager)
			managerList.add(m);
	}

}
