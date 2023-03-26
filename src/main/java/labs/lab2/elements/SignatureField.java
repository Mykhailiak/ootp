package labs.lab2.elements;

public class SignatureField {
    Position position;
    String signer;

    public SignatureField(String signer, Position position) {
        this.position = position;
        this.signer = signer;
    }

    public String getSigner() {
        return this.signer;
    }
}
