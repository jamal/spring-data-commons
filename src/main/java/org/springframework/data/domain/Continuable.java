package org.springframework.data.domain;

/**
 * Abstract interface for pagination based on continuations information.
 *
 * @see {@link org.springframework.data.domain.Pageable}
 */
public interface Continuable {

  Object getContinuationValue();

  int getPageSize();

  Continuable next();

  Continuable previousOrFirst();

  Continuable first();

  boolean hasPrevious();

}
