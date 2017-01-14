package org.telegram.ak;

import org.telegram.telegrambots.api.methods.BotApiMethod;
import org.telegram.telegrambots.api.methods.send.SendMessage;
import org.telegram.telegrambots.api.objects.Update;
import org.telegram.telegrambots.bots.TelegramWebhookBot;

public class AkWebhookBot extends TelegramWebhookBot{
    @Override
    public BotApiMethod onWebhookUpdateReceived(Update update) {
        if (update.hasMessage() && update.getMessage().hasText()) {
            SendMessage sendMessage = new SendMessage();
            sendMessage.setChatId(update.getMessage().getChatId().toString());
            sendMessage.setText("AkWebhookBot: Well, 123.");
            return sendMessage;
        }
        return null;
    }

    @Override
    public String getBotUsername() {
        return "AkWebhookBot";
    }

    @Override
    public String getBotToken() {
        return "276613085:AAHzmzWO66pO0Vo2RN0TQI7ojQQe3u5Hh3w";
    }


    @Override
    public String getBotPath() {
        return "https://tg-ak-tmp-bot.herokuapp.com";
    }

}
