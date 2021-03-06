package com.andrehofmeister.ktor

import io.ktor.application.Application
import io.ktor.application.call
import io.ktor.application.install
import io.ktor.features.CallLogging
import io.ktor.features.DefaultHeaders
import io.ktor.http.ContentType
import io.ktor.response.respondText
import io.ktor.routing.get
import io.ktor.routing.routing

fun Application.main() {
  install(DefaultHeaders)
  install(CallLogging)
  routing {
    get("/") {
      call.respondText("Hello World!", ContentType.Text.Plain)
    }
    get("/demo") {
      call.respondText("HELLO WORLD!", ContentType.Text.Plain)
    }
  }
}
