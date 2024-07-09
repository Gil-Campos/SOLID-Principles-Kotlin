package ocp.good

import model.User
import srp.good.UserRepository
import srp.good.UserValidator

class UserRegistration(
    private val userValidator: UserValidator,
    private val userRepository: UserRepository,
    private val registrationSteps: List<RegistrationStep>
) {
    fun register(user: User) {
        if (userValidator.validate(user)) {
            userRepository.save(user)
            registrationSteps.forEach { it.execute(user) }
        } else {
            println("User is invalid")
        }
    }
}

