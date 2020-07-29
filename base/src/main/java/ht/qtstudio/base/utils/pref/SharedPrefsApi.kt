package ht.qtstudio.base.data.local.pref

import android.content.Context
import android.content.SharedPreferences
import androidx.collection.LongSparseArray
import androidx.core.content.edit

class SharedPrefsApi constructor(val context: Context, val name:String) {
    val sharedPreferences: SharedPreferences = context.getSharedPreferences(name, Context.MODE_PRIVATE)

    fun set(key: String, value: String) =
        sharedPreferences.edit().apply { putString(key, value) }.apply()

    fun get(key: String, defValue: String?) = sharedPreferences.getString(key, defValue)

    fun set(key: String, value: Int) = sharedPreferences.edit().apply { putInt(key, value) }.apply()

    fun get(key: String, defValue: Int) = sharedPreferences.getInt(key, defValue)

    fun set(key: String, value: Boolean) =
        sharedPreferences.edit().apply { putBoolean(key, value) }.apply()

    fun get(key: String, defValue: Boolean) = sharedPreferences.getBoolean(key, defValue)

    fun set(key: String, value: Long) =
        sharedPreferences.edit().apply { putLong(key, value) }.apply()

    fun get(key: String, defValue: Long) = sharedPreferences.getLong(key, defValue)

    fun clear() = sharedPreferences.edit().apply { clear() }.apply()

    fun remove(key: String) = sharedPreferences.edit().apply { remove(key) }.apply()
}
