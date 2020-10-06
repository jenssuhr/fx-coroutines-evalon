import io.kotest.assertions.arrow.either.shouldBeLeft
import io.kotest.assertions.arrow.either.shouldBeRight
import io.kotest.core.spec.style.StringSpec
import java.nio.file.Paths

class ReadLogoTest : StringSpec() {
    private val existingLogo = Paths.get("logos/logo.png")
    private val invalidLogo = Paths.get("logos/foo.png")

    init {
        "should read an existing image file" {
            readLogo(existingLogo).shouldBeRight()
        }

        "should return an error for a non-existing image file " {
            readLogo(invalidLogo).shouldBeLeft()
        }
    }
}
