package erp_microservices.model;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.UUID;

/**
 * Every persistent model needs to have an id and version field, this just keeps
 * me from typing it all the time. Also provides basic equality and hashcode.
 *
 * @author jimbarrows
 */
@MappedSuperclass
public class PersistentEntity implements Entity {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	@GeneratedValue(generator = "uuid2")
	@GenericGenerator(name = "uuid2", strategy = "uuid2")
	@Column(columnDefinition = "uuid", unique = true, nullable = false)
	@Type(type = "pg-uuid")
	@Id
	private UUID id;

	@Version
	private Long version = 0l;

	public PersistentEntity() {
		super();
		id = UUID.randomUUID();
	}

	public PersistentEntity(UUID id, Long version) {
		super();
		this.id = id;
		this.version = version;
	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public Long getVersion() {
		return version;
	}

	public void setVersion(Long version) {
		this.version = version;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PersistentEntity other = (PersistentEntity) obj;
		if (id == null) {
			return other.id == null;
		} else return id.equals(other.id);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("PersistentEntity [id=");
		builder.append(id);
		builder.append(", version=");
		builder.append(version);
		builder.append("]");
		return builder.toString();
	}
}
