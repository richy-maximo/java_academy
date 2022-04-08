package com.example.patrones.chain;

public interface IChain {
    void setNextChain(IChain nextChain);
    int calculate(Numbers request);
}
