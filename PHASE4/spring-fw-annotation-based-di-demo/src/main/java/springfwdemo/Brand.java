package springfwdemo;

import org.springframework.stereotype.Component;

@Component
public class Brand {
	
	String name = "Phillps";
	
	public Brand() {
	}
	
	public Brand(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}	

}
