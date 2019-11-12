
package acme.features.authenticated.comprecords;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import acme.entities.comprecords.Comprecord;
import acme.framework.components.BasicCommand;
import acme.framework.controllers.AbstractController;
import acme.framework.entities.Authenticated;

@Controller
@RequestMapping("/authenticated/comprecord/")
public class AuthenticatedComprecordController extends AbstractController<Authenticated, Comprecord> {

	//Internal state

	@Autowired
	private AuthenticatedComprecordListService	listService;

	@Autowired
	private AuthenticatedComprecordShowService	showService;


	//Constructores

	@PostConstruct
	private void initialise() {
		super.addBasicCommand(BasicCommand.LIST, this.listService);
		super.addBasicCommand(BasicCommand.SHOW, this.showService);
	}

}
