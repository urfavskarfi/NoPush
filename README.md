NoPush – Fabric Client Mod

NoPush is a simple Fabric client-side mod for Minecraft that prevents the player from being pushed or moved horizontally by the game.
It runs only on the client and stops horizontal movement whenever the game would normally push the player — for example, during collisions or while standing in fluids.

🚀 Features

Blocks horizontal push/knock movement.

Works when the player:
collides with a wall,
is touching water,
is in lava.

Does not affect vertical movement (jumping, falling, swimming up/down).

📦 How It Works

The mod listens to the END_CLIENT_TICK event and checks the player’s state.
If a collision or fluid contact is detected, the player’s horizontal velocity is set to zero:

if (player.horizontalCollision || player.isTouchingWater() || player.isInLava()) {
    player.setVelocity(0.0, player.getVelocity().y, 0.0);
}

📁 Installation

Install Fabric Loader.

Place the compiled .jar file into your:

.minecraft/mods


Launch the game using the Fabric profile.

🛠 Requirements

Minecraft - 1.20.1

Fabric Loader

Fabric API

🔧 Developer Notes

This mod can be banned on some server's, check the rules before downloading it.
