package com.mylaesoftware.annotations.validators;

import java.util.Collection;
import java.util.function.Function;

@FunctionalInterface
public interface ConfigValidator<T> extends Function<T, Collection<ValidationError>> {
}
