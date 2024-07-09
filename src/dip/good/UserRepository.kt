package dip.good

import model.User

interface UserRepository {
    fun saveUser(user: User)
}

