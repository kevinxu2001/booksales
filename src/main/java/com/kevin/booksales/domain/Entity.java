package com.kevin.booksales.domain;

import java.io.Serializable;

public interface Entity<T> extends Serializable {
    boolean sameInentifyAs(T other);
}
