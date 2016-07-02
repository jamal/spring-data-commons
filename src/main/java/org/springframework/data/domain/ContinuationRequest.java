package org.springframework.data.domain;

public class ContinuationRequest extends AbstractContinuationRequest {

  public ContinuationRequest(int size) {
    super(size);
  }

  public ContinuationRequest(Object continuationValue, int size) {
    super(continuationValue, size);
  }

  @Override
  public Continuable next() {
    // TODO
    return null;
  }

  @Override
  public Continuable previous() {
    // TODO
    return null;
  }

  @Override
  public Continuable first() {
    // TODO
    return null;
  }

}
