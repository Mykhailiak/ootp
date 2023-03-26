package labs.lab2.builders;

public interface Builder {
    void addLogo();

    void addSignatureField(String signer);

    void addDate();

    void addText(String text);
}
