package srp.good

import model.User

class UserValidator {
    fun validate(user: User): Boolean {
        return user.email.contains("@")
    }
}

