package com.yuo.endless.Gui;

import com.yuo.endless.Tiles.ExtremeCraftTile;
import net.minecraft.inventory.CraftResultInventory;
import net.minecraft.item.ItemStack;

public class ExtremeCraftInventoryResult extends CraftResultInventory {

    private ExtremeCraftTile craftTile;

    public ExtremeCraftInventoryResult(ExtremeCraftTile tile){
        this.craftTile = tile;
    }

    @Override
    public ItemStack getStackInSlot(int index) {
        return craftTile.getStackInSlot(81);
    }

    @Override
    public ItemStack decrStackSize(int par1, int par2) {
        ItemStack stack = craftTile.getStackInSlot(81);
        if (!stack.isEmpty()) {
            craftTile.setInventorySlotContents(81, ItemStack.EMPTY);
            return stack;
        } else {
            return ItemStack.EMPTY;
        }
    }

    @Override
    public void setInventorySlotContents(int par1, ItemStack par2ItemStack) {
        craftTile.setInventorySlotContents(81, par2ItemStack);
    }
}
