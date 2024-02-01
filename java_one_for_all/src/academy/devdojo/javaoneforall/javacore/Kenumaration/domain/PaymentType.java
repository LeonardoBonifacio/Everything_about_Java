package academy.devdojo.javaoneforall.javacore.Kenumaration.domain;

public enum PaymentType {
    // for each object/Enum(DEBIT OR CREDIT) i'm overrinding a abstract method
    // created inside this Class Enumeration PaymentType,so that will peform different things for each type of payment
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

    // since one method which i write in my program are going to be overriding for
    // all of the objects(in this case Enumerations), it's more clever declare this method like abstract
    public abstract double calculationDiscount(double value);
    // abstract methods can never have a body
    // they were created to be overriden
    // you are saying that this calculationDiscount must be override
}
