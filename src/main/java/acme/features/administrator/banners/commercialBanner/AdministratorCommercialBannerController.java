
package acme.features.administrator.banners.commercialBanner;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import acme.entities.banners.CommercialBanner;
import acme.framework.components.BasicCommand;
import acme.framework.controllers.AbstractController;
import acme.framework.entities.Administrator;

@Controller
@RequestMapping("/administrator/banner/commercial-banner/")
public class AdministratorCommercialBannerController extends AbstractController<Administrator, CommercialBanner> {

	//Internal state

	@Autowired
	private AdministratorCommercialBannerListService	listService;

	@Autowired
	private AdministratorCommercialBannerShowService	showService;

	@Autowired
	private AdministratorCommercialBannerCreateService	createService;

	@Autowired
	private AdministratorCommercialBannerUpdateService	updateService;

	@Autowired
	private AdministratorCommercialBannerDeleteService	deleteService;


	//Constructores

	@PostConstruct
	private void initialise() {
		super.addBasicCommand(BasicCommand.LIST, this.listService);
		super.addBasicCommand(BasicCommand.SHOW, this.showService);
		super.addBasicCommand(BasicCommand.CREATE, this.createService);
		super.addBasicCommand(BasicCommand.UPDATE, this.updateService);
		super.addBasicCommand(BasicCommand.DELETE, this.deleteService);
	}

}
