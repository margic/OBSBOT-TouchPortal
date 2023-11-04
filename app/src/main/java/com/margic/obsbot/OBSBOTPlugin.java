package com.margic.obsbot;

import com.christophecvb.touchportal.annotations.Category;
import com.christophecvb.touchportal.annotations.Plugin;
import com.christophecvb.touchportal.model.TPBroadcastMessage;
import com.christophecvb.touchportal.model.TPInfoMessage;
import com.christophecvb.touchportal.model.TPListChangeMessage;
import com.christophecvb.touchportal.model.TPNotificationOptionClickedMessage;
import com.christophecvb.touchportal.model.TPSettingsMessage;
import com.google.gson.JsonObject;

import java.util.logging.Level;
import java.util.logging.Logger;

import com.christophecvb.touchportal.TouchPortalPlugin;


@Plugin(version = BuildConfig.VERSION_CODE, colorDark = "#203060", colorLight = "#4070F0", name = "OBSBOT Touch Portal Plugin")
public class OBSBOTPlugin extends TouchPortalPlugin implements TouchPortalPlugin.TouchPortalPluginListener {

    private final static Logger LOGGER = Logger.getLogger(TouchPortalPlugin.class.getName());

    /**
     * Constructor calling super
     */
    public OBSBOTPlugin() {
        super(true);
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

    public static void main(String[] args) {
        LOGGER.log(Level.INFO, "plugin start");
    }



    @Override
    public void onDisconnected(Exception exception) {
        // TODO Auto-generated method stub
        LOGGER.log(Level.INFO, "onDisconnect");
        throw new UnsupportedOperationException("Unimplemented method 'onDisconnected'");
    }



    @Override
    public void onReceived(JsonObject jsonMessage) {
        // TODO Auto-generated method stub
        LOGGER.log(Level.INFO, "onReceived");
        throw new UnsupportedOperationException("Unimplemented method 'onReceived'");
    }



    @Override
    public void onInfo(TPInfoMessage tpInfoMessage) {
        // TODO Auto-generated method stub
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
