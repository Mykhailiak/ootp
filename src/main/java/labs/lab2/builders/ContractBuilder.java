package labs.lab2.builders;

import labs.lab2.Contract;
import labs.lab2.elements.ContractDate;
import labs.lab2.elements.Logo;
import labs.lab2.elements.Position;
import labs.lab2.elements.SignatureField;

public class ContractBuilder implements Builder {
    private Logo logo;
    private ContractDate date;
    private SignatureField signatureField;
    private String text;

    @Override
    public void addLogo() {
        this.logo = new Logo(new Position(5, 5), "STANDARD");
    }

    @Override
    public void addDate() {
        this.date = new ContractDate();
    }

    @Override
    public void addSignatureField(String signer) {
        this.signatureField = new SignatureField(signer, new Position(5, 50));
    }

    @Override
    public void addText(String text) {
        this.text = text;
    }

    public Contract build() {
        return new Contract(logo, text, signatureField, date);
    }
}
