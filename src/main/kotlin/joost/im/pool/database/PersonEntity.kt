package joost.im.pool.database

import jakarta.persistence.Entity
import jakarta.persistence.Id

@Entity
data class PersonEntity(
    @Id
    val id: Long,
    val name: String,
    val age: Int
)