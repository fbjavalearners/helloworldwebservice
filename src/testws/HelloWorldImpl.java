package testws;

import javax.jws.WebParam;
import javax.jws.WebService;

//Service Implementation Bean

@WebService(endpointInterface = "testws.HelloWorld")
public class HelloWorldImpl implements HelloWorld{

	@Override
	public String getHelloWorldAsString(String name) {
		return "Welcome "+name+" to JAX-WS world ";
	}
}

