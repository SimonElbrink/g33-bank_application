package se.lexicon.data;

import se.lexicon.model.BankClient;

import java.util.Arrays;

public class ClientStorage {

    private BankClient[] bankClients;

    public ClientStorage(){
        this.bankClients = new BankClient[0];
    }



    public BankClient[] addBankClient(BankClient toAdd){
        //Goal: Add BankClient to a Array.

        //1. Expand the array
        BankClient[] newArray = Arrays.copyOf(this.bankClients, this.bankClients.length + 1);

        //2. Adding to the array
        newArray[newArray.length - 1] = toAdd;
        //3. Return new array with added client.
        return newArray;
    }


}
