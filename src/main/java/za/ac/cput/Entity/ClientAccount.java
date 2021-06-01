package za.ac.cput.Entity;
/*
@Description:ClientAccount.java->ClientAccount class
for ClientAccount Entity
@Author: Asiphiwe Hanjiwe
@Student number:218336675
@Date: 30 May 2021
 */
public class ClientAccount
{
    private String accountNum, numBorrowed;

    private ClientAccount(Builder builder) {
        this.accountNum = builder.accountNum;
        this.numBorrowed = builder.numBorrowed;
    }

    public static class Builder {
        private String accountNum,numBorrowed;

        public Builder setAccountNum(String accountNum) {
            this.accountNum = accountNum;
            return this;
        }

        public Builder setNumBorrowed(String numBorrowed) {
            this.numBorrowed = numBorrowed;
            return this;
        }

        public ClientAccount build() {
            return new ClientAccount(this);
        }

        public ClientAccount.Builder copy(ClientAccount clientAccount) {
            this.accountNum = clientAccount.accountNum;
            this.numBorrowed = clientAccount.numBorrowed;
            return this;
        }

        @Override
        public String toString() {
            return "Builder{" +
                    "accountNum=" + accountNum +
                    ", numBorrowed=" + numBorrowed +
                    '}';
        }

        public String getAccountNum() {
            return accountNum;
        }

        public String getNumBorrowed() {
            return numBorrowed;
        }
    }
}
