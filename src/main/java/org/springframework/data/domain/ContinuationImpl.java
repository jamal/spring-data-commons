package org.springframework.data.domain;

import java.util.List;

public class ContinuationImpl<T> extends SliceImpl<T> implements Continuation<T> {

  private final Continuable continuable;

  public ContinuationImpl(List<T> content, Continuable continuable, boolean hasNext) {
    super(content, null, hasNext);
    this.continuable = continuable;
  }

  @Override
  public String getContinuationValue() {
    // TODO: Serialize properly
    return continuable.getContinuationValue().toString();
  }

}
