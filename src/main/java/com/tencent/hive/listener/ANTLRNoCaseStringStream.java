package com.tencent.hive.listener;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.IntStream;

public class ANTLRNoCaseStringStream extends ANTLRInputStream {
    public ANTLRNoCaseStringStream(String input){
        super(input);
    }

    @Override
    public int LA(int i){
        int la = super.LA(i);
        if (la == 0 || la == IntStream.EOF){
            return la;
        } else {
            return Character.toUpperCase(la);
        }
    }
}
