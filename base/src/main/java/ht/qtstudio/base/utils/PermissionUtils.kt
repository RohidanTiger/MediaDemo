package ht.qtstudio.base.utils

import android.app.Activity
import android.content.Context
import android.content.pm.PackageManager
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat


/**
 * Utility class that wraps access to the runtime permissions API in M and provides basic helper
 * methods.
 */
object PermissionUtils {
    /**
     * Check that all given permissions have been granted by verifying that each entry in the
     * given array is of the value [PackageManager.PERMISSION_GRANTED].
     *
     * @see Activity.onRequestPermissionsResult
     */
    fun verifyPermissions(grantResults: IntArray): Boolean {
        // At least one result must be checked.
        if (grantResults.size < 1) {
            return false
        }

        // Verify that each required permission has been granted, otherwise return false.
        for (result in grantResults) {
            if (result != PackageManager.PERMISSION_GRANTED) {
                return false
            }
        }
        return true
    }

    /**
     * Check that a permission has been granted or denied.
     * @param context
     * @param permission
     *
     * @return  true if granted, false if denied.
     */
    fun hasPermission(context: Context, permission: String?): Boolean {
        return ContextCompat
            .checkSelfPermission(context, permission!!) == PackageManager.PERMISSION_GRANTED
    }

    /**
     * Request a permission.
     * @param activity
     * @param permission
     * @param requestCode
     */
    fun requestPermission(
        activity: Activity?,
        permission: String,
        requestCode: Int
    ) {
        ActivityCompat.requestPermissions(activity!!, arrayOf(permission), requestCode)
    }

    /**
     * Request a permission.
     * @param activity
     * @param permissions
     * @param requestCode
     */
    fun requestListPermission(
        activity: Activity?,
        permissions: Array<String>,
        requestCode: Int
    ) {
        ActivityCompat.requestPermissions(activity!!, permissions, requestCode)
    }
}