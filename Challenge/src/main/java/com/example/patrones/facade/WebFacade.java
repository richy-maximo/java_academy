package com.example.patrones.facade;

public class WebFacade {
    BillingSystem billingSystem;
    CRMSystem crmSystem;
    EmailSystem emailSystem;
    
    public WebFacade(){
        billingSystem = new BillingSystem();
        crmSystem = new CRMSystem();
        emailSystem = new EmailSystem();
    }

    public void doSomethingEmailSystem(){
        emailSystem.doSomething();
    }

    public void doSomethingCRMSystem(){
        crmSystem.doSomething();
    }


    public void doSomethingBillingSystem(){
        billingSystem.doSomething();
    }
}
