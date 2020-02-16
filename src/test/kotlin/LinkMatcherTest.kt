import com.oknotokt.extractor.ZippyshareExtractor
import org.junit.Assert
import org.junit.Test

class LinkMatcherTest {
    private val linkToPage = "https://www97.zippyshare.com/v/2y0ABioH/file.html"

    @Test
    fun `Test Zippyshare link extraction`() {
        val extractor = ZippyshareExtractor()
        val downloadableLink = extractor.extract(linkToPage)
        Assert.assertTrue(downloadableLink?.link?.contains(".mkv") == true)
    }
}