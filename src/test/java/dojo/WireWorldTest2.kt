package dojo

import org.junit.Assert
import org.junit.Test


class WireWorldTest2 {

    @Test
    fun singleCellTestBlack() {
        Assert.assertEquals(dojo.animate(" ")[0], " ")
    }
    @Test
    fun singleCellTestDot() {
        Assert.assertEquals(dojo.animate(".")[0], ".")
    }
    @Test
    fun singleCellTestHead() {
        val result = dojo.animate("H")
        Assert.assertEquals(result[0], "H")
        Assert.assertEquals(result[1], "t")
        Assert.assertEquals(result[2], ".")
    }
}
