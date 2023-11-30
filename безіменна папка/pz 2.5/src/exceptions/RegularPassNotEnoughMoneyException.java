package exceptions;

import passes.RegularPass;

public class RegularPassNotEnoughMoneyException extends RuntimeException {
    private RegularPass pass;

    public RegularPassNotEnoughMoneyException(RegularPass pass){
        this.pass = pass;
    }

    @Override
    public String toString() {
        return " on the pass id " + pass.getUid() + " lefts only " + ((RegularPass) pass).getAmountOfMoney() + " UAN";
    }
}