package com.example.demospringapp

import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse

@RestController
@RequestMapping("/demo-service")
class DemoEndpoint(private val properties: DemoProperties) {

    @GetMapping(produces = [MediaType.TEXT_PLAIN_VALUE])
    fun getMapping(
        request: HttpServletRequest,
        response: HttpServletResponse
    ): String {
        return properties.exampleProperty
    }
}
