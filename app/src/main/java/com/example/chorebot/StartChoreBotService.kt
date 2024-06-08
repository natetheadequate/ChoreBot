package com.example.chorebot

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent

class StartChoreBotService : BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        context?.startService(intent)
    }
}
