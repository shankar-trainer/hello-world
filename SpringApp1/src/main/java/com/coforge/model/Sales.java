package com.coforge.model;

import lombok.Data;

//@Getter
//@Setter
//@ToString

@Data
// Equivalent to @Getter @Setter @RequiredArgsConstructor @ToString @EqualsAndHashCode. 

public class Sales {

	public void init() {
		this.salesId = 887878;
		this.salesCost = 68000;
		this.salesName = "shoes";
		System.out.println("sales init called ");
	}

	public void cleanup() {

		System.out.println("sales clean up called");
	}

	private int salesId;
	private String salesName;
	private float salesCost;

}
