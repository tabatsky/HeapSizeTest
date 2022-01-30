package jatx.heapsizetest

import android.util.Log
import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.ext.junit.runners.AndroidJUnit4

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {
    @Test
    fun showMaxMemory() {
        val rt = Runtime.getRuntime()
        val maxMemory = rt.maxMemory()
        Log.e("maxMemory", maxMemory.toString())
    }
}