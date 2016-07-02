package org.springframework.data.domain;

import com.google.common.base.Objects;

import java.io.Serializable;

public abstract class AbstractContinuationRequest implements Continuable, Serializable {

  private final Object continuationValue;
  private final int size;

  public AbstractContinuationRequest(int size) {
    this(null, size);
  }

  public AbstractContinuationRequest(Object continuationValue, int size) {
    if (size < 1) {
      throw new IllegalArgumentException("Page size must not be less than one!");
    }

    this.continuationValue = continuationValue;
    this.size = size;
  }

  public Object getContinuationValue() {
    return continuationValue;
  }

  public int getPageSize() {
    return size;
  }

  public boolean hasPrevious() {
    // TODO
    return false;
  }

  public Continuable previousOrFirst() {
    return hasPrevious() ? previous() : first();
  }

  public abstract Continuable next();

  public abstract Continuable previous();

  public abstract Continuable first();

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AbstractContinuationRequest that = (AbstractContinuationRequest) o;
    return size == that.size &&
        Objects.equal(continuationValue, that.continuationValue);
  }

  @Override
  public int hashCode() {
    return Objects.hashCode(continuationValue, size);
  }
}
