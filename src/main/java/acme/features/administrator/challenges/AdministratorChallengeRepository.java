
package acme.features.administrator.challenges;

import java.util.Collection;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import acme.entities.challenges.Challenge;
import acme.framework.repositories.AbstractRepository;

@Repository
public interface AdministratorChallengeRepository extends AbstractRepository {

	Challenge findOneById(int id);

	@Query("Select a from Challenge a")
	Collection<Challenge> findManyAll();
}
