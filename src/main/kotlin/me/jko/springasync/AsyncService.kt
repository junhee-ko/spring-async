package me.jko.springasync

import org.slf4j.LoggerFactory
import org.springframework.scheduling.annotation.Async
import org.springframework.stereotype.Service

@Service
class AsyncService {

    private val logger = LoggerFactory.getLogger(javaClass)

    @Async
    fun doAsyncTask() {
        logger.info("doAsyncTask invoked, (current thread: ${Thread.currentThread()})")
    }
}