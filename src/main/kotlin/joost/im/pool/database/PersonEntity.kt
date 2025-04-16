package joost.im.pool.database

import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.Table

@Entity
@Table(name = "PERSON")
data class PersonEntity(
    @Id
    val id: Long = 0,
    val name: String = "",
    val age: Int = 0
)