package exceptions;

import passes.SchoolPass;

public class SchoolPassTripFinishedException extends RuntimeException {
    private SchoolPass pass;
    public SchoolPassTripFinishedException(SchoolPass pass){
        this.pass = pass;
    }

    @Override
    public String toString() {
        return "school pass with id " + pass.getUid() + " has no more trip";
    }
}