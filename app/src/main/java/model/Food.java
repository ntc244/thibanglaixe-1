package model;

import java.io.Serializable;

public class Food extends BaseModel implements Serializable {

	private static final long serialVersionUID = 1L;

	private String name;

	public Food() {
	}

	public Food(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
