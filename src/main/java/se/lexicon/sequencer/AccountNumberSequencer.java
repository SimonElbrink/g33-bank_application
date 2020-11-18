package se.lexicon.sequencer;

public class AccountNumberSequencer {

    private static int accountNumberSequence;


    public static int getNextId(){

        accountNumberSequence = accountNumberSequence + 1;

        return AccountNumberSequencer.accountNumberSequence;

    }




}
