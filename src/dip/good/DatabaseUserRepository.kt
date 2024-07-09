package dip.good

import dip.bad.DatabaseConnection
import model.User

class DatabaseUserRepository : UserRepository {
    private val database = DatabaseConnection()

    override fun saveUser(user: User) {
        database.saveUser(user)
    }
}

