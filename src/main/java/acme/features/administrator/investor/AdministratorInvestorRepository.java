
package acme.features.administrator.investor;

import java.util.Collection;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import acme.entities.investor.Investor;
import acme.framework.repositories.AbstractRepository;

@Repository
public interface AdministratorInvestorRepository extends AbstractRepository {

	@Query("Select a from Investor a where a.id = ?1")
	Investor findOneInvestorById(int id);

	@Query("Select a from Investor a")
	Collection<Investor> findManyInvestors();

	@Query("Select a from Investor a")
	Collection<Investor> findManyAll();

}
