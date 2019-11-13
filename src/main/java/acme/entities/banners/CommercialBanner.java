
package acme.entities.banners;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class CommercialBanner extends Banner {

	private static final long	serialVersionUID	= 1L;

	//Atributos
	@NotBlank
	private String				creditCard;
}
