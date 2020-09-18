import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class HelloWorldTest {
    @Test
    fun `hello world`() {
        assertThat("hello").isEqualTo("hello2")
    }
}