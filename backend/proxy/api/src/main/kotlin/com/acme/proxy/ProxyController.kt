package com.acme.proxy

import jakarta.ws.rs.GET
import jakarta.ws.rs.Path

@Path("/v1/proxy")
class ProxyController {
    @GET
    fun infra(): String = "proxy"
}
