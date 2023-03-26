package labs.lab2;

import labs.lab2.elements.ContractDate;
import labs.lab2.elements.Logo;
import labs.lab2.elements.SignatureField;

public class Contract {
    private Logo logo;
    private String text;
    private ContractDate date;
    private SignatureField signatureField;
    public Contract(Logo logo, String text, SignatureField signatureField, ContractDate date) {
        this.logo = logo;
        this.text = text;
        this.signatureField = signatureField;
        this.date = date;
    }

    String getStringifiedVersion() {
        return String.format("Date: %s; %s, Signature: %s", date.getDateString(), text, signatureField.getSigner());
    }
}
