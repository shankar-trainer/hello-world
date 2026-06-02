To disable JSR-303 validation specifically for the "show all" button (and other buttons like "search by id" or "delete by id" that don't require a fully completed form), you have a slight mismatch between your Controller and your JSP file:

Your Controller is expecting a @RequestParam("submit") and matches strings like "show all".

Your JSP is using name="action" and submits values like "showAll".

The most robust way to handle multi-button forms with selective validation in Spring MVC is to bypass the automatic @Valid check on the entire method and trigger validation programmatically only when the user intends to "add record" or "update record".

Here is how you can fix it cleanly.

Step 1: Update your JSP Buttons
First, make sure the name and value attributes in your JSP align with what your InsuranceController expects. Note that we should change the form action to match your controller's @RequestMapping("/insurance").

HTML
<form:form modelAttribute="insurance" action="${pageContext.request.contextPath}/insurance/addRecord" method="post">
    <div>
        <button type="submit" name="submit" value="add record">Add Record</button>
        <button type="submit" name="submit" value="update record">Update Record</button>
        <button type="submit" name="submit" value="search by id">Search by ID</button>
        <button type="submit" name="submit" value="delete by id">Delete by ID</button>
        <button type="submit" name="submit" value="show all">Show All</button>
    </div>
</form:form>
Step 2: Modify the Controller
Remove the @Valid annotation from the method signature. Instead, inject Spring's SmartValidator (or Validator) and call it manually only inside the switch cases that actually require a valid form.

Java
import org.springframework.validation.SmartValidator; // Add this import

@Controller
@RequestMapping("/insurance")
public class InsuranceController {

	@Autowired
	private InsuranceService service;

	@Autowired
	private SmartValidator validator; // Inject the validator manually

	@GetMapping("/form")
	public String hello(ModelMap map) {
		Insurance insurance = new Insurance();
		map.addAttribute("insurance", insurance);
		return "insuranceform";
	}

	@PostMapping("/addRecord")
	public String addRecord(@ModelAttribute Insurance insurance, BindingResult result,
			@RequestParam("submit") String submit, ModelMap map) {

		System.out.println("submit is " + submit);

		switch (submit) {
		case "add record":
			// Programmatically trigger validation ONLY for this action
			validator.validate(insurance, result);
			if (result.hasErrors()) {
				return "insuranceform";
			}
			service.addInsurance(insurance);
			break;
            
		case "update record":
			// Programmatically trigger validation ONLY for this action
			validator.validate(insurance, result);
			if (result.hasErrors()) {
				return "insuranceform";
			}
			var ins3 = service.updateRecord(insurance);
			map.addAttribute("ins3", ins3);
			break;

		case "show all":
			// Validation is completely bypassed here!
			List<Insurance> allInsurance = service.getAllInsurance();
			map.addAttribute("allInsurance", allInsurance);
			break;

		case "search by id":
			// Bypasses regular form validation
			int id = insurance.getId();
			Insurance insurance1 = service.searchById(id);
			map.addAttribute("insurance1", insurance1);
			break;
            
		case "delete by id":
			// Bypasses regular form validation
			int id1 = insurance.getId();
			var ins = service.deleteById(id1);
			map.addAttribute("ins", ins);
			break;

		default:
			break;
		}

		map.addAttribute("msg", submit);
		return "insuranceresult";
	}
}
Why this works:
Selective Validation: By removing @Valid from the method signature, Spring no longer forces validation the moment the request hits the controller.

Granular Control: The validator.validate(insurance, result) manually populates the BindingResult only when the user clicks "add record" or "update record".

Seamless Bypassing: When clicking "show all", the app skips validation entirely and directly fetches your data without returning validation errors to the UI.