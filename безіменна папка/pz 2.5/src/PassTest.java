import exceptions.RegularPassNotEnoughMoneyException;
import exceptions.SchoolPassOverdueException;
import exceptions.SchoolPassTripFinishedException;
import exceptions.StudentPassOverdueException;
import passes.RegularPass;
import passes.SchoolPass;
import passes.StudentPass;

import java.time.YearMonth;
import java.util.ArrayList;

public class PassTest {
    static Turnstile turnstile = new Turnstile();
    public static void main(String[] args) {
        regularPassCall();
        regularPassCallException();
        schoolPassCall();
    }
    private static void regularPassCall(){
        var passRegular = KyivSmartCard.createPass(PassType.REGULAR_PASS);
        RegularPass regularPass = (RegularPass) passRegular;
        regularPass.setAmountOfMoney(10);
        try {
            turnstile.validateEntryPermission(regularPass);
        } catch (RegularPassNotEnoughMoneyException e) {
            e.printStackTrace();
        }
    }
    private static void regularPassCallException(){
        var passRegular = KyivSmartCard.createPass(PassType.REGULAR_PASS);
        RegularPass regularPass = (RegularPass) passRegular;
        regularPass.setAmountOfMoney(15);
        try {
            turnstile.validateEntryPermission(regularPass);
            turnstile.validateEntryPermission(regularPass);
        } catch (RegularPassNotEnoughMoneyException e) {
            e.printStackTrace();
        }
    }
    private static void schoolPassCall(){
        var pass = KyivSmartCard.createPass(PassType.SCHOOL_PASS);
        SchoolPass schoolPass = (SchoolPass) pass;
        schoolPass.setMonth(YearMonth.of(2023,12));
        try {
            turnstile.validateEntryPermission(schoolPass);
        } catch (SchoolPassOverdueException | SchoolPassTripFinishedException e) {
            e.printStackTrace();
        }
    }
    private static void studentPassCall(){
        var pass = KyivSmartCard.createPass(PassType.STUDENT_PASS);
        StudentPass studentPass = (StudentPass) pass;
        studentPass.setMonth(YearMonth.of(2023, 10));
        try {
            turnstile.validateEntryPermission(studentPass);
        } catch (StudentPassOverdueException e) {
            e.printStackTrace();
        }
    }
}