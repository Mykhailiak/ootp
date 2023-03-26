package labs.lab2;

public class Main {
    public static void main(String[] args) {
        ContractBuilder contractBuilder = new ContractBuilder();
        Director director = new Director();

        director.constructCommitmentDocument(contractBuilder);

        Contract contract = contractBuilder.build();

        System.out.println(contract.getStringifiedVersion());
    }
}
