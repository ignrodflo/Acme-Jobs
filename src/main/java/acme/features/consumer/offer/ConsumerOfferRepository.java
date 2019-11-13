
package acme.features.consumer.offer;

import java.util.Collection;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import acme.entities.offers.Offer;
import acme.framework.repositories.AbstractRepository;

@Repository
public interface ConsumerOfferRepository extends AbstractRepository {

	@Query("Select a from Offer a where a.id = ?1")
	Offer findOneById(int id);

	@Query("Select a from Offer a")
	Collection<Offer> findManyAll();

	@Query("Select a from Offer a where a.id = ?1")
	Offer findOneOfferById(int id);

	@Query("Select a from Offer a")
	Collection<Offer> findManyOffers();

}
