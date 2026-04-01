class Invoice {
    private double amount;

    public Invoice(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}

class InvoiceCalculator {
    public double calculateTotal(Invoice invoice) {
        return invoice.getAmount() * 1.20;
    }
}

class InvoiceRepository {
    public void save(Invoice invoice) {
        System.out.println("Saving invoice to database...");
    }
}

class InvoiceService {
    public void sendEmail(Invoice invoice) {
        System.out.println("Sending invoice email...");
    }
}