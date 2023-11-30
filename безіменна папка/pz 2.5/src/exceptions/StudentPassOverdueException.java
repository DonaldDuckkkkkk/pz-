package exceptions;

import passes.StudentPass;

import java.time.YearMonth;

public class StudentPassOverdueException extends PassWightTermException{
    StudentPass pass;

    public StudentPassOverdueException(StudentPass pass){
        this.pass = pass;
    }

    @Override
    public int calculateTermOfOverdue(){
        return YearMonth.now().getMonthValue() - pass.getMonth().getMonthValue() ;
    }

    @Override
    public String toString() {
        return "the pass his overdue " + calculateTermOfOverdue() + " month ago";
    }
}