package org.urr.screenner_bot.service.telegram;

import org.springframework.stereotype.Component;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.urr.screenner_bot.config.bot.BotConfig;

@Component
public class TelegramBot extends TelegramLongPollingBot {

    final BotConfig config;

    public TelegramBot(BotConfig config){
        this.config = config;

    }
    @Override
    public String getBotUsername() {
        return config.getBotName();
    }

    public String getBotToken(){
        return config.getToken();
    }

    @Override
    public void onUpdateReceived(Update update) {
        System.out.println(123456);
        if(update.hasMessage() && update.getMessage().hasText()){
            String messageText = update.getMessage().getText();
            long id = update.getMessage().getChatId();
            switch (messageText){
                case "/start":
                    startCommandReceived(update);
                    break;
                case "/lox":
                    sendMessage(id, "Привет");
                    break;
                default:
                    sendMessage(update.getMessage().getChatId(), "Привет 111");
                    break;
            }
        }
    }

    private void startCommandReceived(Update update){
        String answer = "Привет " + update.getMessage().getChat().getFirstName() + "!";
        sendMessage(update.getMessage().getChatId(), answer);
    }
    private void sendMessage(long chatId, String textToSend){
        SendMessage message = new SendMessage();
        message.setChatId(chatId);
         message.setText(textToSend);
         try {
             execute(message);
         }catch (TelegramApiException e){
             System.out.println("Нихера не получилось ");
         }

    }
}
