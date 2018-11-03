package org.erp_microservices.core.repository.specification;

public interface Specification<E> {

	boolean isSatisfiedBy(E entity);

	Specification<E> and(final Specification<E> specification);

	Specification<E> or(final Specification<E> specification);

	Specification<E> not(final Specification<E> specification);
}
