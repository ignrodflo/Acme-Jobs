
package acme.features.authenticated.comprecords;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import acme.entities.comprecords.Comprecord;
import acme.framework.components.Model;
import acme.framework.components.Request;
import acme.framework.entities.Authenticated;
import acme.framework.services.AbstractShowService;

@Service
public class AuthenticatedComprecordShowService implements AbstractShowService<Authenticated, Comprecord> {

	//Internal State

	@Autowired
	private AuthenticatedComprecordRepository repository;


	@Override
	public boolean authorise(final Request<Comprecord> request) {
		assert request != null;

		return true;
	}

	@Override
	public Comprecord findOne(final Request<Comprecord> request) {
		assert request != null;

		Comprecord result;
		int id;

		id = request.getModel().getInteger("id");
		result = this.repository.findOneById(id);

		return result;
	}

	@Override
	public void unbind(final Request<Comprecord> request, final Comprecord entity, final Model model) {
		assert request != null;
		assert entity != null;
		assert model != null;

		request.unbind(entity, model, "companyname", "sector", "ceoname", "activdescription", "website", "phone", "email", "companytype", "rating");
	}

}
