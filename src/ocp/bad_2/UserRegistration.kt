package ocp.bad_2

import model.User
import srp.good.UserRepository
import srp.good.UserValidator

class UserRegistration(
    private val userValidator: UserValidator,
    private val userRepository: UserRepository
) {
    fun register(user: User, registrationType: RegistrationTypes) {
        if (userValidator.validate(user)) {
            userRepository.save(user)

            when (registrationType) {
                RegistrationTypes.EMAIL -> {
                    println("Sending confirmation email to ${user.email}")
                }

                RegistrationTypes.OTP -> {
                    println("Sending confirmation code to ${user.email}")
                }
            }

        } else {
            println("User is invalid")
        }
    }
}

