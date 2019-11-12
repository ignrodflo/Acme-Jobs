
package acme.features.authenticated.comprecords;

import java.util.Collection;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import acme.entities.comprecords.Comprecord;
import acme.framework.repositories.AbstractRepository;

@Repository
public interface AuthenticatedComprecordRepository extends AbstractRepository {

	@Query("Select a from Comprecord a where a.id = ?1")
	Comprecord findOneById(int id);

	@Query("Select a from Comprecord a")
	Collection<Comprecord> findManyAll();

}
