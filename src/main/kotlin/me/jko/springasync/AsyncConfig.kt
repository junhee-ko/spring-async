package me.jko.springasync

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.core.task.TaskExecutor
import org.springframework.scheduling.annotation.EnableAsync
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor

@EnableAsync
@Configuration
class AsyncConfig {

    @Bean
    fun taskExecutor01(): TaskExecutor {
        val executor = ThreadPoolTaskExecutor()
        executor.corePoolSize = 2
        executor.maxPoolSize = 5
        executor.setThreadNamePrefix("jko-executor-v1-")
        executor.initialize()

        return executor
    }

    @Bean
    fun taskExecutor02(): TaskExecutor {
        val executor = ThreadPoolTaskExecutor()
        executor.corePoolSize = 2
        executor.maxPoolSize = 5
        executor.setThreadNamePrefix("jko-executor-v2-")
        executor.initialize()

        return executor
    }

    @Bean
    fun taskExecutor(): TaskExecutor {
        val executor = ThreadPoolTaskExecutor()
        executor.corePoolSize = 2
        executor.maxPoolSize = 5
        executor.setThreadNamePrefix("jko-executor-v3-")
        executor.initialize()

        return executor
    }
}