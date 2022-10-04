
package demo;

import java.util.Objects;

    public class Money {
        private int amount;
        private String currency;

        public Money(int amount, String currency) {
            this.amount = amount;
            this.currency = currency;
        }

        @Override
        public String toString() {
            return "Money{" +
                    "amount=" + amount +
                    ", currency='" + currency + '\'' +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof demo.Money)) return false;
            demo.Money money = (demo.Money) o;
            return amount == money.amount && Objects.equals(currency, money.currency);
        }

        @Override
        public int hashCode() {
            return Objects.hash(amount, currency);
        }

        public Money add(Money that) {
            return new Money(this.amount+that.amount,this.currency);
        }
    }


