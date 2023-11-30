package exceptions;

import passes.SchoolPass;

import java.time.YearMonth;

public class SchoolPassOverdueException extends PassWightTermException {
    SchoolPass pass;
    public SchoolPassOverdueException(SchoolPass pass){
        this.pass = pass;
    }

    @Override
    public int calculateTermOfOverdue(){
        return YearMonth.now().getMonthValue() - pass.getMonth().getMonthValue() ;
    }

    @Override
    public String toString() {
        return "the pass his overdue " + (calculateTermOfOverdue() > 1 ? calculateTermOfOverdue() + " months ago" : calculateTermOfOverdue() + " month ago");
    }
}