package aws.deploye.app.one.awsDeployeJar;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping
public class Controller {

	@GetMapping("/get")
	public String firstAwsDeployment() {
		return "this is my first spring boot app deployment in AWS..........................";
	}
}
