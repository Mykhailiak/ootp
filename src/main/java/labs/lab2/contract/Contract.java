package labs.lab2.contract;

import labs.lab2.elements.ContractDate;
import labs.lab2.elements.Logo;
import labs.lab2.elements.SignatureField;

public class Contract implements ContractPrototype {
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

    public String getStringifiedVersion() {
        return String.format("Date: %s; %s, Signature: %s", date.getDateString(), text, signatureField.getSigner());
    }

    public Contract clone() {
        return new Contract(logo, text, signatureField, date);
    }
}
