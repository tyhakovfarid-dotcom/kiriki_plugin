package ru.kiriki;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class Kit_Command implements CommandExecutor {
     @Override
     public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
         if (sender instanceof Player player) {
             player.getInventory().addItem(new ItemStack(Material.NETHERITE_SWORD));
             player.getInventory().addItem(new ItemStack(Material.NETHERITE_PICKAXE));
             player.getInventory().addItem(new ItemStack(Material.NETHERITE_AXE));
             player.getInventory().addItem(new ItemStack(Material.GOLDEN_APPLE, 64));
             player.getInventory().addItem(new ItemStack(Material.NETHERITE_HELMET));
             player.getInventory().addItem(new ItemStack(Material.NETHERITE_CHESTPLATE));
             player.getInventory().addItem(new ItemStack(Material.NETHERITE_LEGGINGS));
             player.getInventory().addItem(new ItemStack(Material.NETHERITE_BOOTS));
             player.sendMessage("§aТы получил свой незеритовый кит!");
             return true;
         }
         return false;
     }
}
