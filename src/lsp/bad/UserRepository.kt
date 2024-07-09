package lsp.bad

import model.User

open class UserRepository {
    open fun save(user: User) {
        println("User ${user.name} registered with email ${user.email}")
    }
}

