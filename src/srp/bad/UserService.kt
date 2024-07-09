package srp.bad

import model.User

class UserService {
    fun registerUser(user: User) {
        // Validate user data
        if (user.email.contains("@")) {
            println("User is valid")
        } else {
            println("User is invalid")
        }

        // Save user to database
        println("User ${user.name} registered with email ${user.email}")
    }
}



