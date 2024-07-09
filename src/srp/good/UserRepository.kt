package srp.good

import model.User

class UserRepository {
    fun save(user: User) {
        println("User ${user.name} registered with email ${user.email}")
    }
}

