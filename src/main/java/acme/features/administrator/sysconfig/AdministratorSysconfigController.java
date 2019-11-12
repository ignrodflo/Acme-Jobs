
package acme.features.administrator.sysconfig;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import acme.entities.sysconfig.Sysconfig;
import acme.framework.components.BasicCommand;
import acme.framework.controllers.AbstractController;
import acme.framework.entities.Administrator;

@Controller
@RequestMapping("/administrator/sysconfig/")
public class AdministratorSysconfigController extends AbstractController<Administrator, Sysconfig> {

	//Internal state

	@Autowired
	private AdministratorSysconfigListService	listService;

	@Autowired
	private AdministratorSysconfigShowService	showService;


	//Constructores

	@PostConstruct
	private void initialise() {
		super.addBasicCommand(BasicCommand.LIST, this.listService);
		super.addBasicCommand(BasicCommand.SHOW, this.showService);
	}

}
