package de.gyko.gameofcolors.net;

/*
 * Ein Listener der auf das Empfangen eines Packets reagiert.
 *
 * @author Jano Andretzky
 */
public abstract class PacketReceiveListener {
    public abstract PacketSendRequest[] onPacketReceived (PacketReceiveEvent p);
    synchronized PacketSendRequest[] packetReceive (PacketReceiveEvent p) {
        return this.onPacketReceived(p);
    }
}
