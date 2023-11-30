import passes.MetroPass;
import passes.RegularPass;
import passes.SchoolPass;
import passes.StudentPass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;

/** This class consists of a system that maintains a register of issued cards
 *  and static methods that interact with this system.
        *   The register system stores cards according to data:
        *  unique identifier,expiration date, number of trips remaining, etc.
        *
        * @author  Datsenko Vitali
        * @see Turnstile
        * @since  20
        *  */
public class KyivSmartCard {
    /**
     * Default count of school trip per month
     */
    public static final int COUNT_OF_SCHOOL_TRIP_PER_MONTH = 50;
    /**
     * Fare of trip for regular pass
     */
    public static final int FARE = 8;
    /**
     * List system registry
     */
    private static final ArrayList<MetroPass> internalCardStorage = new ArrayList<>();
    /**
     * Count of permissions for metro pass
     */
    private static int countOfPermissions;
    /**
     * Count of prohibitions for metro pass
     */
    private static int countOfProhibitions;

    /**
     * Issues a card of the specified type and adds it to the registry system.
     *
     * @param passType the PassType creating the appropriate type of metro card.
     * @throws InputMismatchException if the argument is incorrect or has a null value.
     */
    public static MetroPass createPass(PassType passType) {
        switch (passType) {
            case STUDENT_PASS -> {
                StudentPass studentPass = new StudentPass();
                internalCardStorage.add(studentPass);
                return studentPass;
            }
            case SCHOOL_PASS -> {
                SchoolPass schoolPass = new SchoolPass(COUNT_OF_SCHOOL_TRIP_PER_MONTH);
                internalCardStorage.add(schoolPass);
                return schoolPass;
            }
            case REGULAR_PASS -> {
                RegularPass regularPass = new RegularPass();
                internalCardStorage.add(regularPass);
                return regularPass;
            }
        }
        throw new InputMismatchException();
    }

    /**
     * The method adds a permission to the registry system.
     */
    public static void addPermission() {
        countOfPermissions = countOfPermissions + 1;
    }

    /**
     * The method adds a prohibitions to the registry system in the event that the validation timeout caused
     * an exceptions: RegularPassNotEnoughMoneyException, SchoolPassOverdueException, SchoolPassTripFinishedException, StudentPassOverdueException
     */
    public static void addProhibition() {
        countOfProhibitions = countOfProhibitions + 1;
    }

    /**
     * Get count of prohibitions system registry
     *
     * @return int count of prohibitions system registry
     */
    public static int getCountOfPermissions() {
        return countOfPermissions;
    }

    /**
     * Get count of permission system registry
     *
     * @return int count of permission system registry
     */
    public static int getCountOfProhibitions() {
        return countOfProhibitions;
    }

    /**
     * Get the total number of overdue and empty tickets in the metro system register
     *
     * @return int total number of overdue and empty tickets
     */
    public static int getTotalCountOfOverdueAndEmptyPass() {
        return countOfPermissions + countOfProhibitions;
    }

    /**
     * Adds the specified amount of funds to the specified account.
     *
     * @param regularPass the RegularPass to which card the funds are transferred
     * @param income      int the amount of transferred funds, cannot be negative
     * @see RegularPass
     */
    public static void addFounds(RegularPass regularPass, int income) {
        regularPass.setAmountOfMoney(regularPass.getAmountOfMoney() + income);
    }

    /**
     * Charges the fare to the specified card
     *
     * @param regularPass the RegularPass from which card the fare is charged
     * @see RegularPass
     */
    public static void subtractFare(RegularPass regularPass) {
        regularPass.setAmountOfMoney(regularPass.getAmountOfMoney() - FARE);
    }
}