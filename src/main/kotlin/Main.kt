import java.nio.file.Paths

suspend fun main() {
    readLogo(Paths.get("logos/logo.png")).fold(
        { println("Could not read logo") },
        { bytes -> println("Logo size: ${bytes.size} bytes") }
    )
}
