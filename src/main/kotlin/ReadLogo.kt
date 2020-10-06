import arrow.core.Either
import arrow.fx.coroutines.IOPool
import arrow.fx.coroutines.evalOn
import java.nio.file.Files
import java.nio.file.Path

suspend fun readLogo(path: Path): Either<Throwable, ByteArray> =
    evalOn(IOPool) {
        Either.catch {
            Files.readAllBytes(path)
        }
    }
