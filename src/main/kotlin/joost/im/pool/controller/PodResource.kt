package joost.im.pool.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class PodResource {
    @GetMapping("/pod-name")
    fun getPodName(): String = System.getenv("POD_NAME")
}