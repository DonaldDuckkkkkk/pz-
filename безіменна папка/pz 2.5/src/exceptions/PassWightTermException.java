package exceptions;

import java.time.YearMonth;

public abstract class PassWightTermException extends RuntimeException{

    public abstract int calculateTermOfOverdue();

}
