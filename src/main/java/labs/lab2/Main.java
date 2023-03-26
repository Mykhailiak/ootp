package labs.lab2;

import labs.lab2.builders.ContractBuilder;
import labs.lab2.contract.Contract;

public class Main {
    public static void main(String[] args) {
        ContractBuilder contractBuilder = new ContractBuilder();
        Director director = new Director();

        director.constructCommitmentDocument(contractBuilder);

        Contract contract = contractBuilder.build();
        Contract contractCopy = contract.clone();

        System.out.println(contract.getStringifiedVersion());
        System.out.println(contractCopy.getStringifiedVersion());
    }
}
