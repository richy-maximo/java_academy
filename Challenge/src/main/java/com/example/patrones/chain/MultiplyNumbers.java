package com.example.patrones.chain;

public class MultiplyNumbers implements IChain{

    private IChain nextChain;

    @Override
    public void setNextChain(IChain nextChain) {
        this.nextChain = nextChain;
        
    }

    @Override
    public int calculate(Numbers request) {
        if("mult".equals(request.getOperation())){
            return request.getNumber1() * request.getNumber2();
        }
        return Integer.MAX_VALUE;
    }
    
}
