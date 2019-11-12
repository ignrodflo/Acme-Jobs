
package acme.features.authenticated.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import acme.entities.roles.Consumer;
import acme.framework.components.Model;
import acme.framework.components.Request;
import acme.framework.entities.Authenticated;
import acme.framework.services.AbstractShowService;

@Service
public class AuthenticatedConsumerShowService implements AbstractShowService<Authenticated, Consumer> {
	//Internal State

	@Autowired
	private AuthenticatedConsumerRepository repository;


	@Override
	public boolean authorise(final Request<Consumer> request) {
		assert request != null;

		return true;
	}

	@Override
	public Consumer findOne(final Request<Consumer> request) {
		assert request != null;

		Consumer result;
		int id;

		id = request.getModel().getInteger("id");
		result = this.repository.findOneConsumerByUserAccountId(id);

		return result;
	}

	@Override
	public void unbind(final Request<Consumer> request, final Consumer entity, final Model model) {
		assert request != null;
		assert entity != null;
		assert model != null;

		request.unbind(entity, model, "company", "sector");
	}

}
