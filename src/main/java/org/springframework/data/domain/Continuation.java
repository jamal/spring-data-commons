package org.springframework.data.domain;

import org.springframework.data.domain.Slice;

public interface Continuation<T> extends Slice<T> {

  String getContinuationValue();

}
