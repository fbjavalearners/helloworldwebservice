package testws;



import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.ParameterStyle;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;

//Service Endpoint Interface
@WebService
@SOAPBinding(parameterStyle=ParameterStyle.BARE)
public interface HelloWorld{
	
	@WebMethod String getHelloWorldAsString(@WebParam(name = "firstarg") String name);
	
}