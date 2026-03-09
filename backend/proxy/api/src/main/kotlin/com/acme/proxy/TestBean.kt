package com.acme.proxy

import jakarta.enterprise.context.ApplicationScoped

@ApplicationScoped
class TestBean {
    fun doSomething(): String = "BEAN"
}
