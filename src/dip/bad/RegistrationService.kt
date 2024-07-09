package dip.bad

import model.User

class RegistrationService {
    private val database = DatabaseConnection() // Tight coupling with database

    fun register(user: User) {
        database.saveUser(user)
    }
}

