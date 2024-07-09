package ocp.bad_1

import model.User
import srp.good.UserRepository
import srp.good.UserValidator

class UserRegistration(
    private val userValidator: UserValidator,
    private val userRepository: UserRepository
) {
    fun register(user: User) {
        if (userValidator.validate(user)) {
            userRepository.save(user)
            println("Sending confirmation email to ${user.email}")
        } else {
            println("User is invalid")
        }
    }
}



