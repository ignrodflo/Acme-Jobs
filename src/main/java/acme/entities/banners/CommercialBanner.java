
package acme.entities.banners;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.CreditCardNumber;
import org.hibernate.validator.constraints.Range;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class CommercialBanner extends Banner {

	private static final long	serialVersionUID	= 1L;

	//Atributos

	@NotBlank
	private String				accountHolder;

	@NotBlank
	@CreditCardNumber
	private String				creditCardNumber;

	@NotNull
	@Range(min = 1, max = 12)
	private Integer				expirationMonth;

	@NotNull
	@Pattern(regexp = "^\\d{4}$")
	private String				expirationYear;

	@NotBlank
	@Pattern(regexp = "^\\d{3}$")
	private String				cvv;
}
