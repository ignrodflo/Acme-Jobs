
package acme.entities.banners;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;

import org.hibernate.validator.constraints.URL;

import acme.framework.entities.DomainEntity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class NonCommercialBanner extends DomainEntity {

	private static final long	serialVersionUID	= 1L;

	//Atributos

	@NotBlank
	@URL
	private String				picture;

	@NotBlank
	@URL
	private String				slogan;

	@NotBlank
	@URL
	private String				targetURL;

	@URL
	private String				jingle;
}
