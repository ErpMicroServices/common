package org.erp_microservices.model;

import java.io.Serializable;
import java.util.UUID;

public interface Entity extends Serializable {

	UUID getId();
}
