package com.lloyd.plutotest

import android.app.Application
import com.pluto.Pluto
import com.pluto.plugins.datastore.pref.PlutoDatastorePreferencesPlugin
import com.pluto.plugins.exceptions.PlutoExceptionsPlugin
import com.pluto.plugins.network.PlutoNetworkPlugin
import com.pluto.plugins.rooms.db.PlutoRoomsDatabasePlugin

class PlutoApplication : Application() {
  override fun onCreate() {
    super.onCreate()
    Pluto.Installer(this)
      .addPlugin(PlutoExceptionsPlugin("exceptions"))
      .addPlugin(PlutoNetworkPlugin("network"))
      .addPlugin(PlutoRoomsDatabasePlugin("rooms-db"))
      .addPlugin(PlutoDatastorePreferencesPlugin("datastore"))
      .install()
  }
}