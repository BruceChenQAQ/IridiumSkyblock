package com.iridium.iridiumskyblock.configs;

/**
 * The message configuration used by IridiumSkyblock.
 * Is deserialized automatically on plugin startup and reload.
 */
public class Messages {

    public String reloaded = "%prefix% &7Configuration reloaded.";
    public String noPermission = "%prefix% &7You don't have permission for that.";
    public String mustBeAPlayer = "%prefix% &7You must be a player to execute this command.";
    public String unknownCommand = "%prefix% &7Unknown Command, Try /is help";
    public String creatingIsland = "%prefix% &7Creating Island...";
    public String regeneratingIsland = "%prefix% &7Regenerating Island...";
    public String alreadyHaveIsland = "%prefix% &7You already have an Island.";
    public String dontHaveIsland = "%prefix% &7You dont have an Island.";
    public String islandWithNameAlreadyExists = "%prefix% &7An Island with that name already exists.";
    public String islandSchematicNotFound = "%prefix% &7No schematic with that name exists.";
    public String islandDeleted = "%prefix% &7Your island has been deleted.";
    public String teleportingHome = "%prefix% &7Teleporting Home...";
    public String invitedPlayer = "%prefix% &7You have invited %player% to join your island";
    public String userInvitedPlayer = "%prefix% &7%inviter% has invited %player% to join your island";
    public String youHaveBeenInvited = "%prefix% &7%inviter% has invited you to join their island";
    public String inviteRevoked = "%prefix% &7Island invite for %player% has been revoked";
    public String inviteDoesntExist = "%prefix% &7%player% has no active invite for your island.";
}
