
package com.cg.services;

import com.cg.entity.Theater;

public interface TheaterServiceInterface {

	public Theater addTheater(Theater theater);

	public String updateTheater(Theater theater);

	public String deleteTheater(int theaterId);

	public Theater findTheaterById(int theaterId);

}
