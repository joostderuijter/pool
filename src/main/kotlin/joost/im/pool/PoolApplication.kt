package joost.im.pool

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class PoolApplication

fun main(args: Array<String>) {
	runApplication<PoolApplication>(*args)
}
