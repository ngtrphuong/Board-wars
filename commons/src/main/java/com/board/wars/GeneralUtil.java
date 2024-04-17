package com.board.wars;

import java.security.SecureRandom;
import java.util.Random;
import java.util.function.Consumer;

public class GeneralUtil {

    static public <T> T setAndGet(T prop, Consumer<T> consumer){
        consumer.accept(prop);
        return prop;
    }

    static public Long randomCodeGenerator(long lower, long upper) {
        return lower+((long)(new SecureRandom().nextDouble()*(upper-lower)));
    }
}
