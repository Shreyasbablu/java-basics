import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController 
{
	// to nagivate home page 
	@RequestMapping("/")
	public string homePage()
	{
		System.out.println("executing method home page");
		return "home";
	}

}
