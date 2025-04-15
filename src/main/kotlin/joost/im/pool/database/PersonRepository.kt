package joost.im.pool.database

import org.springframework.data.repository.Repository

interface PersonRepository : Repository<PersonEntity, Long> {
    fun findAll(): List<PersonEntity>
}