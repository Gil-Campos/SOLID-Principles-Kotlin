package lsp.bad

import model.SpecialUser
import model.User

class SpecialUserRepository : UserRepository() {
    override fun save(user: User) {
        if (user is SpecialUser) {
            println("Special user ${user.name} registered with discount ${user.discount}")
        } else {
            super.save(user)
        }
    }
}


