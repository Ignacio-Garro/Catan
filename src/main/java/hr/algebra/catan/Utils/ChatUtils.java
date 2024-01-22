package hr.algebra.catan.Utils;

import hr.algebra.catan.MainApplication;
import hr.algebra.catan.chat.service.RemoteChatService;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.rmi.RemoteException;
import java.util.List;


public class ChatUtils {

    public static void sendChatMessage(TextField chatMessageTextField, RemoteChatService remoteChatService,
                                       TextArea chatMessagesTextArea)
    {
        String chatMessage = chatMessageTextField.getText();

        try {
            remoteChatService.sendMessage(MainApplication.activeUserRole.name() + ": " + chatMessage);

            chatMessageTextField.clear();

            List<String> chatMessages = remoteChatService.getAllChatMessages();

            chatMessagesTextArea.clear();

            for (String message : chatMessages) {
                chatMessagesTextArea.appendText(message + "\n");
            }
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

}
