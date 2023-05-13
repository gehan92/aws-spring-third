package aws.deploye.app.one.awsDeployeJar;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@GetMapping("/get")
	public String firstAwsDeployment() {
		return "thank you..........................";
	}
}
