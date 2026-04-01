interface PaymentService {
    void pay(double amount);
}

class BankAPI implements PaymentService {
    @Override
    public void pay(double amount) {
        System.out.println("Paid via Bank: " + amount);
    }
}

class PayPalAPI implements PaymentService {
    @Override
    public void pay(double amount) {
        System.out.println("Paid via PayPal: " + amount);
    }
}

class PaymentProcessor {

    private PaymentService service;

    public PaymentProcessor(PaymentService service) {
        this.service = service;
    }

    public void process(double amount) {
        service.pay(amount);
    }
}