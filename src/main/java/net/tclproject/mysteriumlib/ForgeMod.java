package net.tclproject.mysteriumlib;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.common.MinecraftForge;

import java.util.Collections;

@Mod(modid = ForgeMod.MODID, useMetadata = true, version = ForgeMod.VERSION, name = ForgeMod.NAME)
public class ForgeMod {
    public static final String MODID = "MysteriumLib";
    public static final String NAME = "Mysterium Lib";
    public static final String VERSION = "1.5.7";

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent e) {
        MinecraftForge.EVENT_BUS.register(this);
        e.getModMetadata().autogenerated = false;

        e.getModMetadata().name = ForgeMod.NAME;
        e.getModMetadata().version = ForgeMod.VERSION;
        e.getModMetadata().credits = "Matrix (TCLProject) , HRudyPlayZ";

        Collections.addAll(e.getModMetadata().authorList, "Tesseract");

        e.getModMetadata().url = "";

        e.getModMetadata().description = "A library mod used for multiple things including easy ASM fixes and more.";

        e.getModMetadata().logoFile = "assets/" + ForgeMod.MODID + "/logo.png";
    }
}
