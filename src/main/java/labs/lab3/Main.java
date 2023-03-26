package labs.lab3;

import labs.lab3.commands.Command;
import labs.lab3.commands.CopyCommand;
import labs.lab3.commands.DeleteCommand;
import labs.lab3.commands.UpdateCommand;
import labs.lab3.document.Document;
import labs.lab3.document.DocumentTypes;
import labs.lab3.eventManager.EventManager;
import labs.lab3.notificationServices.EmailNotificationService;
import labs.lab3.notificationServices.SmsNotificationService;

import java.util.List;

public class Main {
    static String VALIDATION_COMPLETE_EVENT = "VALIDATION_COMPLETE_EVENT";

    public static EventManager setupNotificationService() {
        EventManager eventManager = new EventManager();
        SmsNotificationService smsNotificationService = new SmsNotificationService();
        EmailNotificationService emailNotificationService = new EmailNotificationService();

        eventManager.subscribe(VALIDATION_COMPLETE_EVENT, smsNotificationService);
        eventManager.subscribe(VALIDATION_COMPLETE_EVENT, emailNotificationService);

        return eventManager;
    }

    public static void performDocumentOperations() {
        ActionsHistory actionsRegistry = new ActionsHistory();
        CopyCommand copyCommand = new CopyCommand(1);
        UpdateCommand updateCommand = new UpdateCommand(1);
        DeleteCommand deleteCommand = new DeleteCommand(2);

        actionsRegistry.add(copyCommand);
        actionsRegistry.add(updateCommand);
        actionsRegistry.add(deleteCommand);
        actionsRegistry.remove(deleteCommand);

        System.out.println(actionsRegistry.getHistory());
    }
    public static void main(String[] args) {
        Document validExcelDoc = new Document(DocumentTypes.EXCEL, "A0:B0");
        Document invalidExcelDoc = new Document(DocumentTypes.EXCEL, "random content");
        Document validDocxDoc = new Document(DocumentTypes.DOCX, "header");
        Document invalidDocxDoc = new Document(DocumentTypes.DOCX, "A0:B0");
        Validator validator = new Validator();
        EventManager eventDispatcher = setupNotificationService();

        eventDispatcher.notify(VALIDATION_COMPLETE_EVENT, "Validation of documents has been completed");

        System.out.println(validator.validateDocument(validDocxDoc)); // TRUE
        System.out.println(validator.validateDocument(invalidDocxDoc)); // FALSE
        System.out.println(validator.validateDocument(validExcelDoc)); // TRUE
        System.out.println(validator.validateDocument(invalidExcelDoc)); // FALSE

        performDocumentOperations();
    }
}
