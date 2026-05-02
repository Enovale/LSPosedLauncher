package sox.fzer0x.lsposedlauncher

import android.service.notification.NotificationListenerService
import android.service.notification.StatusBarNotification
import android.util.Log

class LSPosedNotificationListener : NotificationListenerService() {

    companion object {
        private var instance: LSPosedNotificationListener? = null

        fun getActiveNotifications(): Array<StatusBarNotification>? {
            return instance?.activeNotifications
        }
        
        fun isConnected(): Boolean = instance != null
    }

    override fun onListenerConnected() {
        super.onListenerConnected()
        instance = this
        Log.d("LSPosedLauncher", "Notification Listener Connected")
    }

    override fun onListenerDisconnected() {
        super.onListenerDisconnected()
        instance = null
        Log.d("LSPosedLauncher", "Notification Listener Disconnected")
    }
}
