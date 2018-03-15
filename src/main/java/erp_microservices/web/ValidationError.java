package erp_microservices.web;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

public class ValidationError extends WebApplicationException {


	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	public ValidationError(Errors errors) {
		super(Response.status(new UnprocessableEntity())
				.entity(errors)
				.type(MediaType.APPLICATION_JSON)
				.build());
	}


}