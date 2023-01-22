package com.example.demo

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.ui.set
import org.springframework.web.bind.annotation.GetMapping

@Controller
class HtmlController {
    @GetMapping("/")
    fun server(model: Model): String {
        model["title"] = "Server2"
        model["title_data"] = serverOf()
        return "server"
    }

    fun serverOf():String {
        return "serverOf"
    }

}