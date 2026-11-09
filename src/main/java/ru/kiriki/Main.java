package ru.kiriki;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        getLogger().info("Плагин KirklPlugin успешно запущен!");

        // регистрируем наш класс как слушателя событий (подключаем его к Event Bus сервера)
        getServer().getPluginManager().registerEvents(this, this);

        //принимаем комманду /kit
        this.getCommand("kit").setExecutor(new Kit_Command());
    }

    @Override
    public void onDisable() {
        getLogger().info("Плагин выключен.");
    }

    //ну выводим приветствие для игрока
    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        // получаем имя игрока
        String playerName = event.getPlayer().getName();

        // отправляем ему сообщение в чат
        event.getPlayer().sendMessage("Привет, " + playerName + "! Добро пожаловать на сервер.");
    }
}