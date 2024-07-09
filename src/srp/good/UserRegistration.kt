package srp.good

import model.User

class UserRegistration(
    private val userValidator: UserValidator,
    private val userRepository: UserRepository
) {
    fun register(user: User) {
        if (userValidator.validate(user)) {
            userRepository.save(user)
        } else {
            println("User is invalid")
        }
    }
}

