package lsp.good

import model.SpecialUser

class UserRepository : SaveUser {
    override fun save(user: SpecialUser): Boolean {
        println("User ${user.name} registered with email ${user.email}")
        return true
    }
}