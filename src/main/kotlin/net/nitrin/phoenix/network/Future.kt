package net.nitrin.phoenix.network

import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor

class Future<T: Any>(
    private val defaultExecutor: Executor?
): CompletableFuture<T>() {

    constructor(): this(null)

    override fun defaultExecutor(): Executor {
        return defaultExecutor
            ?: super.defaultExecutor()
    }
}