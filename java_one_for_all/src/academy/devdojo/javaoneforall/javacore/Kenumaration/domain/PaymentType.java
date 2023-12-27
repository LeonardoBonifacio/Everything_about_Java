package academy.devdojo.javaoneforall.javacore.Kenumaration.domain;

public enum PaymentType {
    // for each object(DEBIT OR CREDIT) which is been called i'm overrinding a
    // method
    // so tha it's peforms like i want for each type o payment
    DEBIT {
        @Override
        public double calculationDiscount(double value) {
            return value * 0.1;
        }
    },
    CREDIT {
        @Override
        public double calculationDiscount(double value) {
            return value * 0.04;
        }
    };

    // since one method whitch i write in my program are going to be overriding for
    // all of the objects, it's more clever declare this method like abstract
    public abstract double calculationDiscount(double value);
    // abstract methods can never have a body
    // they were created to be overwritten
    // you are saying that this calculationDiscount must be overwritten 
}
