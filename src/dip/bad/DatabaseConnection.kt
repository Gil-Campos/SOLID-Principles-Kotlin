package dip.bad

import model.User

class DatabaseConnection {
    fun saveUser(user: User) {
        println("Database connection: Save ${user.name}")
    }
}

