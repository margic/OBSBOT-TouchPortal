package com.margic.obsbot;

import com.christophecvb.touchportal.annotations.Category;
import com.christophecvb.touchportal.annotations.Plugin;
import com.christophecvb.touchportal.helpers.PluginHelper;
import com.christophecvb.touchportal.model.TPBroadcastMessage;
import com.christophecvb.touchportal.model.TPInfoMessage;
import com.christophecvb.touchportal.model.TPListChangeMessage;
import com.christophecvb.touchportal.model.TPNotificationOptionClickedMessage;
import com.christophecvb.touchportal.model.TPSettingsMessage;
import com.google.gson.JsonObject;
import com.christophecvb.touchportal.TouchPortalPlugin;

import java.util.logging.Level;
import java.util.logging.Logger;

@Plugin(version = BuildConfig.VERSION_CODE, colorDark = "#203060", colorLight = "#4070F0", name = "OBSBOT Plugin")
public class OBSBOTPlugin extends TouchPortalPlugin implements TouchPortalPlugin.TouchPortalPluginListener {
    
    private static final Logger LOGGER = Logger.getLogger(TouchPortalPlugin.class.getName());
    /**
     * Constructor calling super
     */
    public OBSBOTPlugin() {
        super(true);
        OBSBOTPlugin.LOGGER.log(Level.INFO, "Constructing OBSBOT plugin");
    }

    private enum Categories {
        /**
         * Category definition
         */
        @Category(name = "Touch Portal Plugin Category", imagePath = "images/icon-24.png")
        BaseCategory,
        // @Category(name = "Touch Portal Plugin Example Second Category", imagePath = "images/icon-24.png")
        // SecondCategory
    }    

    public static void main(String... args) {
        OBSBOTPlugin.LOGGER.log(Level.INFO, "STARTED MY PLUGIN");
        if (args != null && args.length == 1) {
            if (PluginHelper.COMMAND_START.equals(args[0])) {
                // Initialize your Plugin
                OBSBOTPlugin plugin = new OBSBOTPlugin();
                // Initiate the connection with the Touch Portal Plugin System (will trigger an onInfo message with a confirmation from TouchPortal and the initial settings)
                boolean connectedPairedAndListening = plugin.connectThenPairAndListen(plugin);
            }
        }
    }



    @Override
    public void onDisconnected(Exception exception) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'onDisconnected'");
    }



    @Override
    public void onReceived(JsonObject jsonMessage) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'onReceived'");
    }



    @Override
    public void onInfo(TPInfoMessage tpInfoMessage) {
        OBSBOTPlugin.LOGGER.log(Level.INFO, "onInfo call received");
        throw new UnsupportedOperationException("Unimplemented method 'onInfo'");
    }



    @Override
    public void onListChanged(TPListChangeMessage tpListChangeMessage) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'onListChanged'");
    }



    @Override
    public void onBroadcast(TPBroadcastMessage tpBroadcastMessage) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'onBroadcast'");
    }



    @Override
    public void onSettings(TPSettingsMessage tpSettingsMessage) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'onSettings'");
    }



    @Override
    public void onNotificationOptionClicked(TPNotificationOptionClickedMessage tpNotificationOptionClickedMessage) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'onNotificationOptionClicked'");
    }
}
