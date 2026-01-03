package me.jko.springasync

import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class AsyncServiceTest {

    @Autowired
    private lateinit var asyncService: AsyncService

    @Test
    fun name() {
        asyncService.doAsyncTask()
        Thread.sleep(2000)
    }
}