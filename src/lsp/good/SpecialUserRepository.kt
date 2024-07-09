package lsp.good

import model.SpecialUser
import model.User

class SpecialUserRepository : SaveUser {
    override fun save(user: SpecialUser): Boolean {
        println("Special user ${user.name} registered with discount ${user.discount}")
        return true
    }
}


