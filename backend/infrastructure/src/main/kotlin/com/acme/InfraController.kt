package com.acme

import com.acme.proxy.TestBean
import jakarta.ws.rs.GET
import jakarta.ws.rs.Path

@Path("/v1/infra")
class InfraController(
  private val bean: TestBean
) {
    @GET
    fun infra(): String = "infra"
}
