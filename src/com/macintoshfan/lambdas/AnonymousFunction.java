package com.macintoshfan.lambdas;

/**
 * A simple anonymous function program.
 *
 * @param <R> the returned value
 * @author Macintosh_Fan
 * @see AnonymousFunctionExample An example of using this class
 */
@FunctionalInterface
public interface AnonymousFunction<R> {
    R get();
}
