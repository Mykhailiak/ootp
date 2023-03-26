package labs.lab2;

import labs.lab2.builders.ContractBuilder;

public class Main {
    public static void main(String[] args) {
        ContractBuilder contractBuilder = new ContractBuilder();
        Director director = new Director();

        director.constructCommitmentDocument(contractBuilder);

        Contract contract = contractBuilder.build();

        System.out.println(contract.getStringifiedVersion());
    }
}
