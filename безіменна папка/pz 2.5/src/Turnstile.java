import exceptions.RegularPassNotEnoughMoneyException;
import exceptions.SchoolPassOverdueException;
import exceptions.SchoolPassTripFinishedException;
import exceptions.StudentPassOverdueException;
import passes.MetroPass;
import passes.RegularPass;
import passes.SchoolPass;
import passes.StudentPass;
import java.time.YearMonth;

/**  The turnstile reads data from the card and performs its verification.
        *  If the card has expired, there are no travel credits left,
        *  or there are insufficient funds, then the passage is prohibited.*/
public class Turnstile {

    /**  The turnstile reads data from the card and performs its verification
     * If the card has expired, there are no travel funds left,
     * or there are insufficient funds, then the passage is prohibited.
     * @param metroPass a parameter that defines what types of checks will be used for the metro card
     */
    public void validateEntryPermission(MetroPass metroPass) throws
            SchoolPassOverdueException, StudentPassOverdueException,
            SchoolPassTripFinishedException, RegularPassNotEnoughMoneyException{

        if (metroPass instanceof RegularPass x) {
            if (x.getAmountOfMoney() >= KyivSmartCard.FARE){
                KyivSmartCard.addPermission();
                KyivSmartCard.subtractFare((RegularPass) metroPass);
            } else {
                KyivSmartCard.addProhibition();
                throw new RegularPassNotEnoughMoneyException((RegularPass) metroPass);
            }

        } else if (metroPass instanceof SchoolPass) {
            if (YearMonth.now().isBefore(((SchoolPass)metroPass).getMonth())){
                if (((SchoolPass) metroPass).getCountOfTrip() > 0){
                    ((SchoolPass) metroPass).setCountOfTrip(((SchoolPass) metroPass).getCountOfTrip() - 1);
                    KyivSmartCard.addPermission();
                } else {
                    KyivSmartCard.addProhibition();
                    throw new SchoolPassTripFinishedException((SchoolPass) metroPass);
                }
            } else {
                KyivSmartCard.addProhibition();
                throw new SchoolPassOverdueException((SchoolPass) metroPass);
            }

        } else if (metroPass instanceof StudentPass){
            if (YearMonth.now().isBefore(((StudentPass) metroPass).getMonth())){
                KyivSmartCard.addPermission();
            } else {
                KyivSmartCard.addProhibition();
                throw new StudentPassOverdueException((StudentPass) metroPass);
            }
        }

    }
}