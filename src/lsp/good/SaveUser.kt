package lsp.good

import model.SpecialUser
import model.User

interface SaveUser {
    fun save(user: SpecialUser): Boolean
}

