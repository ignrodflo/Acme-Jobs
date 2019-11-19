
package acme.entities.banners;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.CreditCardNumber;

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
	@Temporal(TemporalType.TIMESTAMP)
	private Date				expirationDate;

	@NotBlank
	private String				cvv;
}
