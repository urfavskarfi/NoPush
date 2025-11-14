package pl.skarfi.nopush;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.network.ClientPlayerEntity;

public class NoPush implements ClientModInitializer {

    private final MinecraftClient mc = MinecraftClient.getInstance();

    @Override
    public void onInitializeClient() {
        System.out.println("NoPush");

        ClientTickEvents.END_CLIENT_TICK.register(client -> {
            ClientPlayerEntity player = mc.player;
            if (player == null) return;

            if (player.horizontalCollision || player.isTouchingWater() || player.isInLava()) {
                player.setVelocity(0.0, player.getVelocity().y, 0.0);
            }
        });
    }
}
