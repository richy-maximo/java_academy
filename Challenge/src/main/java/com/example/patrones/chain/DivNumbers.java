package com.example.patrones.chain;

public class DivNumbers implements IChain{

    private IChain nextChain;

    @Override
    public void setNextChain(IChain nextChain) {
        this.nextChain = nextChain;
        
    }

    @Override
    public int calculate(Numbers request) {
        if("div".equals(request.getOperation())){
            return request.getNumber1() / request.getNumber2();
        }
        return Integer.MAX_VALUE;
    }
    
}
