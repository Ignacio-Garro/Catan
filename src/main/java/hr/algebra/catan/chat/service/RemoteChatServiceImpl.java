package hr.algebra.catan.chat.service;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

public class RemoteChatServiceImpl implements RemoteChatService {

    private List<String> chatMessages;

    public RemoteChatServiceImpl() {
        chatMessages = new ArrayList<>();
    }
    @Override
    public void sendMessage(String chatMessage) throws RemoteException {
        chatMessages.add(chatMessage);
    }

    @Override
    public List<String> getAllChatMessages() throws RemoteException {
        return chatMessages;
    }
}
