package labs.lab2;

public class Director {
    public void constructCommitmentDocument(Builder builder) {
        builder.addLogo();
        builder.addDate();
        builder.addSignatureField("John Doe");
        builder.addText("Our company is obliged to finish work till the end of the quarter...");
    }
}
